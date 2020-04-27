<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<!-- <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<!doctype html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<script  src="../demo/validation.js"></script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<script type ="text/javascript">
function validateForm() {
	 debugger;
var x = document.forms["form1"]["username"].value;
var y = document.forms["form1"]["password"].value;
if ((x == "") ||(y=="")){
  alert("Name & password must be filled out");
  return false;
}
} 

</script>
</head>
<body>
    <div align="center" class="container-sm">
        <form name="form1" action="login/checkCredentials" method="post"  onsubmit="return validateForm()" >
         
            <table border="0">
            <div class="form-group">
                <tr>
                    <td>User Name:</td>
                    <td><input type="text" class="form-control"  name="username" placeholder="Enter name" /></td>
                </tr>
                </div>
                <div class="form-group">
                <tr>
                    <td>Password:</td>
                    <td><input type="text" class="form-control" placeholder="password" name="password" /></td>
                </tr>
                </div>
                 <tr>
                  <td>  <div class="text-center"><input class="btn btn-success" type="submit" value="login" /></div></td>
                </tr>
            </table>
        </form>
         <a class="btn btn-primary" href="jsp/register.jsp">signup</a> 
    </div>
    
</body>
</html>