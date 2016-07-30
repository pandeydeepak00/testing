app.controller("arrayCtrl" ,function($scope,$location){
	$scope.test ="1";
	 $scope.myUrl = $location.absUrl();
	$scope.names =[{name:'Jani',country:'Norway'},
	               {name:'Carl',country:'Sweden'},
	               {name:'Margareth',country:'England'},
	               {name:'Hege',country:'Norway'},
	               {name:'Joe',country:'Denmark'},
	               {name:'Gustav',country:'Sweden'},
	               {name:'Birgit',country:'Denmark'},
	               {name:'Mary',country:'England'},
	               {name:'Kai',country:'Norway'}];
	$scope.orderByMe = function(x) {
	    $scope.myOrderBy = x;
	  }
});