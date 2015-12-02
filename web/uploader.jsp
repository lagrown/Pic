<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"

    "http://www.w3.org/TR/html4/loose.dtd">

<html>

   

  

  
       <body style = "background-color: bisque ">
        <a href="main?content">Home</a>|
       <a href="main?about">About</a> |
        <a href="view">View Images</a> |
         <a href="main?logout">Log out</a>
        

        <div>

            <h3> Choose Photo to upload </h3>

            <form action="upload" method="post" enctype="multipart/form-data">

                <input type="file" name="file" />

                <input type="submit" value="upload" />

            </form>         

        </div>

       

    </body>

</html>

