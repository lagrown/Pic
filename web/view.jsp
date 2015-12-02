
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"

    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Images</title>
    </head>
   
      
        
         <body  style = "background-color: bisque ">
             
               <h1>Images</h1>
          <a href="main?content">Home</a>|
         <a href="main?about">About</a> |
        <a href="main?uploader">Upload Images</a> |
       
        <a href="main?logout">Log out</a>
        
        
        
         <h1>${requestScope["message"]}</h1>
         
         
         
             <c:forEach var="imageFile" items="${imageList}">
                 <img src ="images?image=${imageFile}" style="width:304px;height:228px;" alt="pic" >
                </c:forEach>
        
   
                   
       
           
    </body>
</html>
