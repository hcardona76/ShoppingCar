var app = angular.module('app',[]);

app.controller('UserCRUDCtrl', ['$scope','UserCRUDService', function ($scope,UserCRUDService) {
	  
    $scope.updateUser = function () {
        UserCRUDService.updateUser($scope.user.ID,$scope.user.Razon_Social,$scope.user.RUT,$scope.user.Telefono_Contacto,$scope.user.Direccion,$scope.user.Horario_Disponibilidad,$scope.user.Contacto,$scope.user.Productos)
          .then(function success(response){
              $scope.message = 'User data updated!';
              $scope.errorMessage = '';
          },
          function error(response){
              $scope.errorMessage = 'Error updating user!';
              $scope.message = '';
          });
    }
    
    $scope.getUser = function () {
        var id = $scope.user.id;
        UserCRUDService.getUser($scope.user.ID)
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
            UserCRUDService.addUser($scope.user.ID,$scope.user.Razon_Social,$scope.user.RUT,$scope.user.Telefono_Contacto,$scope.user.Direccion,$scope.user.Horario_Disponibilidad,$scope.user.Contacto,$scope.user.Productos)
              .then (function success(response){
                  $scope.message = 'Proveedor Agregado';
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
    
    $scope.deleteUser = function () {
        UserCRUDService.deleteUser($scope.user.ID)
          .then (function success(response){
              $scope.message = 'Proveedor Eliminado';
              $scope.user = null;
              $scope.errorMessage='';
          },
          function error(response){
              $scope.errorMessage = 'Error deleting user!';
              $scope.message='';
          })
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
	
    this.addUser = function addUser(Razon_Social,RUT,Telefono_Contacto,Direccion,Horario_Disponibilidad,Contacto,Productos){
        return $http({
          method: 'POST',
          url: 'users',
          data: {ID:ID,Razon_Social:Razon_Social,RUT:RUT,Telefono_Contacto:Telefono_Contacto,Direccion:Direccion,Horario_Disponibilidad:Horario_Disponibilidad,Contacto:Contacto,Productos:Productos}
        });
    }
	
    this.deleteUser = function deleteUser(ID){
        return $http({
          method: 'DELETE',
          url: 'users/'+ID
        })
    }
	
    this.updateUser = function updateUser(ID,Razon_Social,RUT,Telefono_Contacto,Direccion,Horario_Disponibilidad,Contacto,Productos){
        return $http({
          method: 'PATCH',
          url: 'users/'+ID,
          data: {ID:ID,Razon_Social:Razon_Social,RUT:RUT,Telefono_Contacto:Telefono_Contacto,Direccion:Direccion,Horario_Disponibilidad:Horario_Disponibilidad,Contacto:Contacto,Productos:Productos}
        })
    }
	
    this.getAllUsers = function getAllUsers(){
        return $http({
          method: 'GET',
          url: 'users'
        });
    }

}]);