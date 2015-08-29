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
    "secteurs" : $scope.secteur,
    "sousprojets" : $scope.sousprojet
  }
  $http({
    method: 'POST',
    url: 'data',
    data: $this.data,
    headers: {'Content-Type': 'application/json'}
}).then(function(data) {
  $this.dataserv = $this.data;
  console.log($this.dataserv);
});
}
}
app.controller('ajoutController', ajoutController);
