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
            UserCRUDService.ValideFormapago($scope.user.idCliente, $scope.userTicket,$scope.user.Formapago)
              .then (function success(response){
                  $scope.message = 'Verificando!';
                  $scope.errorMessage = '';
              },
              function error(response){
                  $scope.errorMessage = 'Error en la validacion del cliente o forma de pago!';
                  $scope.message = '';
            });
        }
   }
      
}]);

app.service('UserCRUDService',['$http', function ($http) {
	
    this.getUser = function getUser(userId){
        return $http({
          method: 'GET',
          url: 'users/'+userId
        });
	}
	
    this.addUser = function ValideFormaPago(idCliente, Ticket){
        return $http({
          method: 'POST',
          url: 'users',
          data: {cedula:idCLiente}
        });
    }
	
    
}]);