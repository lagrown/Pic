<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"

    "http://www.w3.org/TR/html4/loose.dtd">

<html>

   
<head>
      <title>Content Page</title>

<style>
body {
    background-image: url("http://www.pinoy7.com/psptutorials/7/textcutout/images/img1.gif") ;
 
}
p{ font-size: 18px;
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

div{
    text-align: center;
    padding-top: 100px;
}
</style>

</head>
<body>
  

  
    <ul>
             <li><a class="active"<a href="main?content">Home</a></li>
            <li> <a href="main?about">About</a> |</li>
            <li> <a href="main?uploader">Upload Images</a> |</li>
            <li><a href="view">View Images</a> |</li>
            <li> <a href="main?logout">Log out</a></li>
        
        </ul>

        <div>

            <h3> Choose Photo to upload </h3>

            <form action="upload" method="post" enctype="multipart/form-data">

                <input type="file" name="file" />

                <input type="submit" value="upload" />

            </form>         

        </div>

       

    </body>

</html>

