angular.module("appCreditoRest").factory("clienteCreditoApi", function($http, config){
	
	
	var _findAll = function(){
		return $http({method:'GET', url:config.baseUrl+'/api/clienteCredito/findAll'});
	};
	
	
	var _cadastra = function(restaurante){
		return $http({method:'POST', url:config.baseUrl+'/api/clienteCredito/cadastra',data:restaurante});
	};
	
	
	var _findById = function(id){
		return $http({method:'GET', url:config.baseUrl+'/api/clienteCredito/findOne/'+id});
	};
	
	
	var _excluir = function(id){
		return $http({method:'DELETE', url:config.baseUrl+'/api/clienteCredito/excluir/'+id});
	};
	
	return {
		findAll : _findAll,
		cadastra : _cadastra,
		findById : _findById,
		excluir : _excluir
	};
	
});