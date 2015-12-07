
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"

    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Images</title>
        
             
<style>
body {
    background-image: url("http://www.pinoy7.com/psptutorials/7/textcutout/images/img1.gif") ;
 
}
p{ font-size: 28px;
   text-align: center;
   color: #980000
}
blockquote{ text-align: center;
    padding-top: 50px;
font-style: italic;
color: #580000;
}
h1{ text-align: center;
}
 
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
       overflow: hidden;
    background-color: #404040   ;
}
li {
    float: left;
}
li a {
    display: inline-block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}
li a:hover:not(.active) {
    background-color: #111;
}
.active {
background-color:#980000 ;
}
</style>

    </head>
   
    <body>
        
         
             
             
           <ul>
             <li><a class="active"<a href="main?content">Home</a></li>
            <li> <a href="main?about">About</a> </li>
            <li> <a href="main?uploader">Upload Images</a> </li>
            <li><a href="view">View Images</a> </li>
            <li> <a href="main?logout">Log out</a></li>
        
        </ul>  
        
         <h1>${requestScope["message"]}</h1>
         
           <p>Images</p>
         
         
         
             <c:forEach var="imageFile" items="${imageList}">
                 <img src ="images?image=${imageFile}" style="width:350px;height:250px;" alt="pic" >
                </c:forEach>
        
   
                   
       
           
    </body>
</html>
