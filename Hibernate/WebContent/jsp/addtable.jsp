<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="myform" action="" s
		 onsubmit="return validateForm()">
			<table border="0">
			
				<tr>
					<td>Product Name:</td>
					<td><input type="text" name="productName" placeholder=" name"/></td>
				</tr>
				<tr>
					<td>Product Quantity:</td>
					<td><input type="text" id="productQuantity"  placeholder="quantity" name="productQuantity"   /></td>
				
				</tr>
				<tr>
					<td>Product Price:</td>
					<td><input type="text"placeholder="Enter email" name="productPrice" /></td>
				</tr>
				<tr>
					
				</tr>

				<tr>
					<td><input class="btn btn-success" type="submit" value="register" /></td>
				</tr>
</div>
			</table>
		</form>
</body>
</html>