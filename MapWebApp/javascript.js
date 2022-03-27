var map = L.map('map').setView([51.505, -0.09], 15);

L.tileLayer('https://tile.thunderforest.com/neighbourhood/{z}/{x}/{y}.png?apikey=6cdc98f40f0d47fa9c175a99e41688ce', {
attribution: 'Map data &copy; <div class="leaflet-control-attribution leaflet-control">Maps © <a href="https://www.thunderforest.com">Thunderforest</a>, Data © <a href="https://www.openstreetmap.org/copyright">OpenStreetMap contributors</a>',

maxZoom: 18,
id: 'mapbox/streets-v11',
tileSize: 512,
zoomOffset: -1,
}).addTo(map);

var plpointsArr = [fetch('../GPXFileToArrayJava/JsonArr.txt')]; 


var array = JSON.parse("\"" + plpointsArr + "\"");


/*
var polylinePoints = [
    [51.502500, -0.090000],
    [51.503000, -0.090000],
    [51.504500, -0.090500],
    [51.504000, -0.091000]
  ];
*/

  var polyline = L.polyline(array, {color: 'red'}).addTo(map);


