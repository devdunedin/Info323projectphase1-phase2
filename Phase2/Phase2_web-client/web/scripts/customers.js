// import AngularJS resource module
angular.module('CustomersModule', ['ngResource']);

// ShoppingItem domain class
function Customer(id, dob, month, gender) {
   this.id = id;
   this.dob = dob;
   this.month = month;
   this.gender = gender;
}
// ShoppingCart domain class
//function ShoppingCart() {
//this.orderId = Math.floor(Math.random()*1000);
//this.items = new Array();
//this.addItem = function(item) {
//this.items.push(item);
//}
//}

// WebSocket for communicating with router
var ws = new WebSocket("ws://localhost:9002/sign");

ws.onload = function(event){
   alert("WS started");
}

ws.onmessage = function(event) {
   var messages = document.getElementById("messages");
   messages.innerHTML = event.data;
   
 
}



// define controller
function CustomerController($scope, $resource) {

   var serverURI = 'http://localhost\\:8081';  // backslashes are necessary to escape the ':' since ':' is used to define URI placeholders

   // resource object to work with customer namess
   var namesResource = $resource(serverURI +'/customers/');

   // resource object to work with customers
   var customerResource = $resource(serverURI +'/customers/:customerIds', {
      customerIds:'@id'
   }, {
      update:{
         method:'PUT'
      }
   });  // update:PUT mapping is necessary since currently there is no default method for sending a PUT


   // customer object that UI components are bound to
   $scope.dob = null;

   // item object that UI components are bound to
   $scope.month = null;

   // array of customerNames that select component is bound to
   $scope.gender = null;

   // array of customerNames that select component is bound to
   $scope.items = [];

   // field for displaying messages to to user
   $scope.messages = null;

   //$scope.shoppingCart = new ShoppingCart();

   $scope.displayError = function(error) {
      $scope.messages = "Error: " + error.data;
   }

   $scope.clearMessages = function() {
      $scope.messages = null;
   }

   // method for retrieving and displaying all customer IDs in the 'select' component
   $scope.displayProductNames = function() {

      // send a GET request
      namesResource.get(

         // on success
         function(response) {

            // A lot of JSON frameworks will only return a single value instead
            // of an array if the collection on the server only has one element.
            // This affects how the data will be treated on the client side, so
            // we need to test what we actually received

            // did we get back an array of IDs or a single ID?
            if(typeof response.name == "string") {
               // single ID, so wrap it in an array
               $scope.customerNames = [response.name];
            } else {
               // else we got an array so use it directly
               $scope.customerNames = response.name;
            }

         },

         // on error
         $scope.displayError)

   }

   $scope.getSign = function() {
      var customerId = $scope.id;
      var customerName = $scope.name;
      var customerDob = $scope.dob;
      var customerMonth = $scope.month;
      var customerGender = $scope.gender;
      var customer = new Customer(customerId, customerDob, customerMonth, customerGender);     
         
      //Data Validation
      
      if(customerId == null || customerId == undefined || customerDob == null || customerDob == undefined || 
         customerName == null || customerName == undefined || customerMonth == null || customerMonth == undefined || 
         customerGender == null || customerGender == undefined){
         alert("You cannot leave the fields empty again"); 
         }
      
      if(!IsNumeric(customerId)){
         alert(customerId + "is not a decimal");
      }  
      
      
      json = JSON.stringify(customer);
      ws.send(json);
//      ws.flush();
      
   }

}

function IsNumeric(input)
{
    return (input - 0) == input && (input+'').replace(/^\s+|\s+$/g, "").length > 0;
}

