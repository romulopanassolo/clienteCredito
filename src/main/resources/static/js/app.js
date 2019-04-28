var appCreditoRest = angular.module("appCreditoRest", ['ngRoute']);

appCreditoRest.config(function($routeProvider,$locationProvider){
	$routeProvider
	.when("/", {
		templateUrl:"views/cadastroClienteCredito.html", 
		controller:"clienteCreditoController"
	}).when("/clienteCredito", {
		templateUrl:"views/clienteCredito.html", 
		controller:"clienteCreditoController"
	}).when("/cadastroClienteCredito/:cliId", {
		templateUrl:"views/cadastroClienteCredito.html", 
		controller:"clienteCreditoController"
	}).otherwise({
		redirectTo:"/"
	});
	
	$locationProvider.html5Mode(true);
});