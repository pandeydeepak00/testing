var app=angular.module('myApp', []);
app.controller('myCtrl', function($scope) {
    $scope.firstName= "Deepak";
    $scope.lastName= "Pandey";
	$scope.myCol= "red";
});