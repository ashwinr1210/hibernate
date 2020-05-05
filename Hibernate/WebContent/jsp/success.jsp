<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
function doSubmit()
{
window.open("jsp/addtable.jsp","_self");
}
function add(){
	document.getElementById("showtable").style.display="none";
	
	$.ajax({
		method: "GET",
		url: "http://localhost:8080/Hibernate/product",
		success: function(data){
			var array = data['data'];
			var table = document.getElementById("myTable");
			for (i in array) {
				var row = table.insertRow(1);
				// Insert new cells (<td> elements) at the 1st and 2nd position of the "new" <tr> element:
				var cell1 = row.insertCell(0);
				var cell2 = row.insertCell(1);
				var cell3 = row.insertCell(2);
				var cell4 = row.insertCell(3);
				// Add some text to the new cells:
			
				cell1.innerHTML = array[i].productId;
				cell2.innerHTML = array[i].productName;
				cell3.innerHTML = array[i].productPrice;
				cell4.innerHTML = array[i].productQuantity;
			}
		}
	});
}




</script>
</head>
<body>
<h1> LOGIN SUCCESSFULL</h1>
 <input type ="button" value="showtable" id="showtable" onclick="add()"/>
  <input type ="button" value="addtable" id="addtable" onclick="dosubmit"/>
  
 <div>

<table id ="myTable" style="width:100%">
  <tr>
    <th>PRODUCT ID</th>
    <th>PRODUCT NAME</th> 
    <th>PRODUCT PRICE</th>
     <th>PRODUCT QUANTITY</th>
  </tr>


</table>
 
 </div>
 
</body>
</html>