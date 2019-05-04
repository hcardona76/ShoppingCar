var app = angular.module('app',[]);

app.controller('UserCRUDCtrl', ['$scope','UserCRUDService', function ($scope,UserCRUDService) {
	  
    $scope.updateUser = function () {
        UserCRUDService.updateUser($scope.user.id,$scope.user.nombre,$scope.user.telefono,$scope.user.direccion,$scope.user.celular,$scope.user.tipo)
          .then(function success(response){
              $scope.message = 'Data del usuario actualizada!';
              $scope.errorMessage = '';
          },
          function error(response){
              $scope.errorMessage = 'Error updating user!';
              $scope.message = '';
          });
    }
    
    $scope.getUser = function () {
        var id = $scope.user.id;
        UserCRUDService.getUser($scope.user.id)
          .then(function success(response){
              $scope.user = response.data;
              $scope.user.id = id;
              $scope.message='';
              $scope.errorMessage = '';
          },
          function error (response ){
              $scope.message = '';
              if (response.status === 404){
                  $scope.errorMessage = 'User not found!';
              }
              else {
                  $scope.errorMessage = "Error getting user!";
              }
          });
    }
    
    $scope.addUser = function () {
        if ($scope.user != null && $scope.user.name) {
            UserCRUDService.addUser($scope.user.nombre, $scope.user.telefono,$scope.user.telefono2, $scope.user.direccion,$scope.user.ciudad, $scope.user.tipo)
              .then (function success(response){
                  $scope.message = 'Cliente Agregado!';
                  $scope.errorMessage = '';
              },
              function error(response){
                  $scope.errorMessage = 'Error adding user!';
                  $scope.message = '';
            });
        }
        else {
            $scope.errorMessage = 'Please enter a name!';
            $scope.message = '';
        }
    }
    
    $scope.getAllUsers = function () {
        UserCRUDService.getAllUsers()
          .then(function success(response){
              $scope.users = response.data._embedded.users;
              $scope.message='';
              $scope.errorMessage = '';
          },
          function error (response ){
              $scope.message='';
              $scope.errorMessage = 'Error getting users!';
          });
    }

}]);

app.service('UserCRUDService',['$http', function ($http) {
	
    this.getUser = function getUser(userId){
        return $http({
          method: 'GET',
          url: 'users/'+userId
        });
	}
	
    this.addUser = function addUser(name, email){
        return $http({
          method: 'POST',
          url: 'users',
          data: {name:name, email:email}
        });
    }
	
    this.getAllUsers = function getAllUsers(){
        return $http({
          method: 'GET',
          url: 'users'
        });
    }

}]);