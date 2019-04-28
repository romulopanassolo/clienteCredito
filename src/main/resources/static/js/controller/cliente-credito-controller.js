appCreditoRest.controller("clienteCreditoController", function($scope,clienteCreditoApi,$routeParams,$location){
	$scope.cliente ={};
	$scope.clientes =[];
	$scope.riscos =["A","B","C"];
	
	$scope.carregarClientes = function(){
	   clienteCreditoApi.findAll().then(function(response){
		   $scope.clientes = response.data;
	   }, function(response){
		   console.log(response.data);
	   });
	};
	
	
	$scope.carregarCliente = function(){
		clienteCreditoApi.findById($routeParams.cliId).then(function(response){
			   $scope.cliente = response.data;
		   }, function(response){
			   console.log(response.data);
		   });
		};
	
	
	$scope.salvarCliente = function(){
		   clienteCreditoApi.cadastra($scope.cliente).then(function(response){
			   $scope.carregarClientes();
			   $scope.cliente ={};
			   $location.path("/clienteCredito/");
		   }, function(response){
			   console.log(response.data);
		   });
	};
	
		
	$scope.excluirCliente = function(cliente){
			   clienteCreditoApi.excluir(cliente.id).then(function(response){
				   pos = $scope.clientes.indexOf(cliente);
				   $scope.clientes.splice(pos,1);
			   }, function(response){
				   console.log(response.data);
		   });
	};	
	
	
	$scope.cancelarCliente = function(){
		$scope.cliente = {};
		
	};
	
	
	$scope.carregarClientes();
	$scope.carregarCliente();
	
});	
	


