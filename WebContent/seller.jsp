<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>
  body {
            font-family: Arial, Helvetica, sans-serif;
            line-height: 25px;
        }

        .wrapper {
            width: 90%;
          
            margin: 0 auto;
            padding: 1% 1%;
        }

        /*------------CSS FOR HEADER---------------*/
        .header {
            background-color: rgb(250, 50, 50);
            color: white;

        }

        /*------------CSS FOR NAVBAR---------------*/
        .menu ul {
            list-style-type: none;
        }

        .menu ul a {
            color: rgb(250, 50, 50);
            text-decoration: none;
            padding: 1%;
        }

        .menu ul a:hover {
            background-color: rgb(250, 50, 50);
            color: white;
        }

        .menu ul a li {
            display: inline;
        }

        /*------------CSS FOR MAIN---------------*/
         /*------------CSS FOR FOOTER---------------*/
        .footer {
            background-color: rgb(250, 50, 50);
            color: white;
        }

        .para1 {
            text-align: left;
        }

        .para2 {
            text-align: right;
        }

</style>
</head>
<body>
<!-------------------header start here ---------------------->
    <header class="header">
        <div class="wrapper">
            <h1>getHome.</h1>
        </div>
    </header>
    <!------------------header ends here--------------------------->

    <!-------------nav bar starts here----------------------------->
    <nav class="menu">
        <div class="wrapper">
            <ul>
                <a href="index.html">
                    <li>Home</li>
                </a>
                <a href="about.html">
                    <li>About Us</li>
                </a>
                
                <a href="contact.html">
                    <li>Contact US</li>
                </a>
                <a href="signup.html">
                    <li>Sign Up</li>
                </a>
            </ul>
        </div>
    </nav>
    <!-----------------------nav ends here-------------------------->

    <!----------------------main body------------------------------->
<div>
 <div class="loginheadline">
                    <h1>Seller</h1>
                    <h2>login</h2>
          
           </div>
<div class="form">
<form action="" method="post">  
Email:<input type="text" name="email"/><br/><br/>  
Password:<input type="password" name="password"/><br/><br/>  
<input type="submit" value="login"/>
</form> 
</div>
</div>
  <!-------------------------main ends here------------------------>

    <!-------------------footer starts here-------------------------->
    <footer class="footer">
        <div class="wrapper">
            <p class="para1">&copy:<a href="#">getHome.</a>All Rights Reserved.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                devloped by: jayant parmar | jalaj hirdani | isshita trivedi </p>
        </div>
    </footer>
    <!--------------------------footer ends here----------------------->
</body>
</html>