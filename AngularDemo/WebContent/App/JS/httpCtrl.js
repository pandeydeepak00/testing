app.controller('httpCtrl', function($scope,$http) {
	$http({
        method : "GET",
        url : "Action.do"
    }).then(function mySucces(response) {
        $scope.data = response.data.Data;
    }, function myError(response) {
        $scope.myWelcome = response.statusText;
    });
	
	
});