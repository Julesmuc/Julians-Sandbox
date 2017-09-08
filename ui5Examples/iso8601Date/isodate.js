 sap.ui.getCore().attachInit(function() {
   "use strict";
   sap.ui.controller("MyController", {
     onInit: function() { this.byId("dateTime").setModel(new sap.ui.model.json.JSONModel({"datum": "2017-08-31T11:58:06.977+0000"}));
     }
   });
   sap.ui.xmlview({
     viewContent: jQuery("#myView").html()
   }).placeAt("content");

 });
