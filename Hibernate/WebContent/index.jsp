<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
    <div align="center">
        <form action="login/checkCredentials"  >
            <table border="0">
                <tr>
                    <td>User Name:</td>
                    <td><input type="text" name="username" /></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="text" name="password" /></td>
                </tr>
                 <tr>
                    <td><input type="submit" /></td>
                </tr>
            </table>
        </form>
         <a href="jsp/register.jsp">signup</a> 
    </div>
</body>
</html>