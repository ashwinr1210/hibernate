/**
 * 
 */
 function validateForm() {
	 debugger;
  var x = document.forms["form1"]["username"].value;
  var y = document.forms["form1"]["password"].value;
  if ((x == "") ||(y=="")){
    alert("Name & password must be filled out");
    return false;
  }
} 