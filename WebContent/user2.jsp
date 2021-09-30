<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>welcome </title>
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
        /*--------------CSS FOR MAIN-------------------*/
        .main h3{
        color: rgb(0, 0, 153);
        }
        main{
        }
        
        .houses{
        width:200px;
        border: 1px solid black;
        margin:1%;
        float: left;
        }
   
       .houses img{
       width=100%;
       }  
        
        .submitfrm{
        background-color:rgb(255, 71, 26);
        margin-top:65%;
        margin-right:25%;
        margin-left:25%;
        padding: 50%;
        
        }
        input[type=text], select, textarea {
              width: 100%; /* Full width */
               padding: 12px; /* Some padding */ 
                border: 1px solid #ccc; /* Gray border */
                  border-radius: 4px; /* Rounded borders */
               box-sizing: border-box; /* Make sure that padding and width stays in place */
                 margin-top: 6px; /* Add a top margin */
               margin-bottom: 16px; /* Bottom margin */
                resize: vertical /* Allow the user to vertically resize the textarea (not horizontally) */

        }
        .submitfrm,h4{
        padding:10px;
          text-align: center;
        
        }
      
  
        .adbtn{
        
            background-color: #4CAF50; /* Green */
             border: none;
             color: white;
              padding: 15px 32px;
             text-align: center;
               text-decoration: none;
              display: inline-block;
              font-size: 16px;
}
    .bnbtn{
     background-color: #4CAF50; /* Green */
             border: none;
             color: white;
              padding: 15px 86px;
             text-align: center;
               text-decoration: none;
              display: inline-block;
              font-size: 12px;
    }    
    .bnbtn:hover{
    opacity:0.5;
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
    <!-- ---------------------main starts here--------------------- -->
    <div class="main">
       <div class="wrapper">
      
              
             
             <!-- ---displayddd---- -->
             <h3>Recently added</h3>
           
             
           
                       <div class="houses">
                              <img src="images/4.jpg" width=200px height=200px>
                              <span class="house-title">ram villa</span>
                                <span class="house-added">02-02-2021</span>
                                  <span class="house-location">56,vijay nagar, indore,mp 451263</span><br>
                                  <span class="house-sale">Rs-15,455,000/-</span><br>
                                  <span class="house-id">house id -10111</span>
                                    <a href="book.html">
                                  <buttontype="button" class="bnbtn">Book </button>
                                  </a>
                        </div>
                        
                          <div class="houses">
                              <img src="images/3.jpg" width=200px height=200px>
                              <span class="house-title">sant villa</span>
                                <span class="house-added">06-02-2021</span>
                                  <span class="house-location">526,bawarkua, indore,mp 451263</span><br>
                                  <span class="house-sale">Rs-12,565,000/-</span><br>
                                       <span class="house-id">house id -10112</span>
                                       <a href="book.html">
                                    <buttontype class="bnbtn">Book</button>
                                    </a>
                        </div>
                        
                          <div class="houses">
                              <img src="images/5.jpg" width=200px height=200px>
                              <span class="house-title">mushe villa</span>
                                <span class="house-added">12-02-2021</span>
                                  <span class="house-location">189,rajiv gandhi nagar, indore,mp 451263</span><br>
                                         <span class="house-sale">Rs-26,895,000/-</span><br>
                                            <span class="house-id">house id -10113</span>
                                       <a href="book.html">
                                       
                                       
                                    <buttontype="button" class="bnbtn">Book </button>
                                       </a>
                        </div>
                        
                          <div class="houses">
                              <img src="images/2.jpg" width=200px height=200px>
                              <span class="house-title">sadan villa</span>
                                <span class="house-added">20-02-2021</span>
                                  <span class="house-location">145,silicon city, indore,mp 451263</span><br>
                                   
                                   <span class="house-sale">Rs-15,455,000/-</span><br>
                                        <span class="house-id">house id -10114</span>
                                    <a href="book.html">
                                    <buttontype="button" class="bnbtn">Book </button>
                                       </a>
                        </div>
                        
                          <div class="houses">
                              <img src="images/1.jpg" width=200px height=200px>
                              <span class="house-title">patel palace</span>
                                <span class="house-added">26-02-2021</span>
                                  <span class="house-location">124,royal buglow, rau,mp 4515263</span><br>
                                      <span class="house-sale">Rs-16,775,000/-</span><br>
                                          <span class="house-id">house id -10115</span>
                                     <a href="book.html">
                                    <buttontype="button" class="bnbtn">Book </button>
                                       </a>
                        </div>
                         <div class="houses">
                              <img src="images/6.jpg" width=200px height=200px>
                              <span class="house-title" >raj residency</span>
                                <span class="house-added">03-03-2021</span>
                                  <span class="house-location">189,tilak nagar, indore,mp 451263</span><br>
                                  <span class="house-sale">Rs-18,555,000/-</span><br>
                                     <span class="house-id">house id -10116</span>
                                <a href="book.html">
                                    <buttontype="button" class="bnbtn">Book </button>
                                       </a>
                        </div>
                        
                          <div class="houses">
                              <img src="images\jay.jpg" width=200px height=200px>
                              <span class="house-title"> apple cottage</span>
                                <span class="house-added">20-02-2021</span>
                                  <span class="house-location">145,herotech city, indore,mp 451263</span><br>
                                      <span class="house-sale">Rs-14,805,000/-</span><br>
                                         <span class="house-id">house id -10117</span>
                                    <a href="book.html">
                                       <buttontype= "button" class="bnbtn">Book</button>
                                  </a>
                        </div>
                        
                          <div class="houses">
                              <img src="images/aa.jpg" width=200px height=200px>
                              <span class="house-title"> soni palace</span>
                                <span class="house-added">25-02-2021</span>
                                  <span class="house-location">129,indore-rau bypass, rau,mp 4515263</span><br>
                                     <span class="house-sale">Rs-11,805,000/-</span><br>
                                        <span class="house-id">house id -10118</span>
                                   <a href="book.html">
                                    <buttontype="button" class="bnbtn">Book </button>
                                       </a>
                        </div>
                        <div class="houses">
                              <img src="images/abc.jpg" width=200px height=200px>
                              <span class="house-title"> shree balaji resigency</span>
                                <span class="house-added">20-02-2021</span>
                                  <span class="house-location">145,bal vihar colony, indore,mp 451263</span><br>
                                      <span class="house-sale">Rs-08,005,000/-</span><br>
                                         <span class="house-id">house id -10119</span>
                                    <a href="book.html">
                                    <buttontype="button" class="bnbtn">Book </button>
                                       </a>
                           </div>
                        
                          <div class="houses">
                              <img src="imagess/B.jpg" width=200px height=200px>
                              <span class="house-title">kalka residency</span>
                                <span class="house-added">25-03-2021</span>
                                  <span class="house-location">125,teen imli,indore,mp 4515263</span><br>
                                  <span class="house-sale">Rs-10,805,000/-</span><br>
                                        <span class="house-id">house id -10120</span>
                                   <a href="book.html">
                                    <buttontype="button" class="bnbtn">Book </button>
                                       </a>
                        </div>
               
           </div>
           </div>
         
           
              <div class="submitfrm">
            <form action="Register">
            <h2>Hey USER ,if you want to sell your property ,please fill the form given below .</h2>
            <h4><b><u>Add details</u></b></h4>
            <input type="text" class="inputbox" placeholder="Full Name" name="fname" required><br>
   
                <input type="text" class="inputbox" placeholder="Email Address" name="email" required><br>
                <input type="text" class="inputbox" placeholder="House/Flat/Shop" name="item" required ><br>
                  <input type="text" class="inputbox" placeholder="Contact Details" name="phnno" required><br>
                   <input type="text" class="inputbox" placeholder="Location" name="loc" required><br>
                  <textarea class="inputbox" placeholder="description..." name="subject" style="height:200px"></textarea><br>
                  <h5>*Our team will contact you shortly.</h5>
                       
                          <button class="adbtn" >Submit</button>
            </form>\
          </div>
    <!-- -------------------main ends here------------------------ -->
    
</body>
</html>