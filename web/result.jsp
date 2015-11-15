<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"

    "http://www.w3.org/TR/html4/loose.dtd">

<html>

    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Photo Upload</title>

    </head>

  

    <body>
         <body style = "background-color: bisque ">
          <a href="main?content">Home</a>|
         <a href="main?about">About</a> |
        <a href="main?uploader">Upload Images</a> |
        <a href="main?logout">Log out</a>
        
        

        <div id="result">

            <h1>${requestScope["message"]}</h1>
            
            <h2>${initParam.UPLOAD_DIRECTORY}</h2>
            
            <img src="images">
            
         
            
    
        </div>
            
         </body>

       


