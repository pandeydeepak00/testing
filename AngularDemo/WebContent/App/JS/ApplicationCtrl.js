var app = angular.module("myApp", ["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "Application.html"
    })
    .when("/red", {
        templateUrl : "I.htm"
    })
    .when("/green", {
        templateUrl : "U.html"
    })
    .when("/blue", {
        templateUrl : "We.html"
    });
});