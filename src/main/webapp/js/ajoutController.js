var app = angular.module('app');

var ajoutController = function($http, $scope) {
  var $this = this;

  $http.get("data/sous-projets.json").then(function(response) {
    $this.sousprojets = response.data;
  })

  $http.get("data/secteurs.json").then(function(response) {
    $this.secteurs = response.data;
  })

$this.ajoutProjet = function() {
  $this.data = {
	"id_project": 33,
    "nom_project" : $this.projetName,
    "l" : [1, 2]
  }
  
 
  
	  $http({
		    method: 'POST',
		    url: ' http://localhost:8080/medz/webapi/data',
		    data: $this.data,
		    headers: {'Content-Type': 'application/json'}
		}).then(function(response){
	    $this.projets = response.data;
	    $this.projetName = "";
	  })
}
}
app.controller('ajoutController', ajoutController);
