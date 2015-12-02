
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><title>Family Login</title></head>
	
    <body style = "background-color: bisque ">
	<h1>Log in</h1>
	
         <form method="POST" action="main">
          
             <table border ="1">
			<tr><td>User</td><td><input type="text" name="user"/></td></tr>
			<tr><td>Password</td><td><input type="password" name="pass"/></td></tr>
			<tr><td colspan="2"><input type="submit" name="login" value="Login" /></td></tr>
			
			</table>
        </form>
        
        
            <h2>${requestScope["message"]}</h2>
		
	</body>
	
	
</html>
