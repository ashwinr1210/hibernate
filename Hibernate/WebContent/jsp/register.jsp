<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<script  src="../demo/validation.js"></script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<script src="../js/validation.js"></script>
<script type="text/javascript">
function validateForm() {
	 
var x = document.forms["myform"]["username"].value;
var y = document.forms["myform"]["password"].value;
var z=  document.forms["myform"]["email"].value;
var d=document.forms["myform"]["dob"].value;
if (x == ""){
  alert("Name  must be filled out");
  return false;
}
if (y == ""){
	  alert("password  must be filled out");
	  return false;
	}
if (z == ""){
	  alert("email  must be filled out");
	  return false;
	}
if (d == ""){
	  alert("dob  must be filled out");
	  return false;
	}
} 

function checkPass()
{
    var pass1 = document.getElementById('password');
    var message = document.getElementById('error');
    var badColor = "#ff6666";
    var goodColor = "#66cc66";
    if(pass1.value.length > 5)
    {
        pass1.style.backgroundColor = goodColor;
        message.style.color = goodColor;
        message.innerHTML = "password is  ok!"
    }
    else
    {
        pass1.style.backgroundColor = badColor;
        message.style.color = badColor;
        message.innerHTML = " you have to enter at least 6 digit!"
        return;
    }
}
</script>

<title>Register</title>
</head>
<body>
	<div align="center" class="container-sm">
		<form name="myform" action="../register/addCredentials" method="post"
			onsubmit="return validateForm()">
			<table border="0">
			<div class="form-group">
				<tr>
					<td>User Name:</td>
					<td><input type="text"class="form-control" name="username" placeholder="Enter name"/></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" class="form-control"id="password"  placeholder="Enter password"name="password" onkeyup="checkPass(); return false;"  /></td>
					<div id="error-nwl"></div>
				</tr>
				<tr>
					<td>email:</td>
					<td><input type="email"class="form-control"placeholder="Enter email" name="email" /></td>
				</tr>
				<tr>
					<td><label for="start">Date of birth:</label></td>
					<td><input class="form-control" type="date" id="start" name="dob" min="1918-01-01"
						max="2028-12-31"></td>
				</tr>

				<tr>
					<td><input class="btn btn-success" type="submit" value="register" /></td>
				</tr>
</div>
			</table>
		</form>
	</div>
</body>
</html>