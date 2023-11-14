<%-- 
    Document   : StudentLogin
    Created on : 16 Jul, 2023, 8:34:52 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .box{
            background-color:black;
            width: 400px;
            height: 400px;
            border-radius: 5px;
            margin-top: 100px;
            box-shadow: 12px 12px yellow  ;
         }
         #login{
             color:yellow;
             padding-top: 20px;
             
         }
         .table{
             width: 300px;
             height: 180px;
            color: white;
            padding: 30px;
            font-size: 25px;
            padding: 10px;
            border: white;
                     }
                     #button{
                         width: 300px;
                         height:50px ;
                         background: yellow ;
                         border-radius: 13px;
                         font-size: 33px;
                          }
                          #td input
                          {
                         width: 300px;
                         height:43px ;
                         background: white;
                         border-radius: 13px;
                         font-size: 33px;

                          }
                        #td select
                        {
                         width: 305px;
                         height:43px ;
                         background: white;
                         border-radius: 13px;
                         font-size: 33px; 
                        }
                        
    </style>
</head> 
<body bgcolor="	#383838">
    
   <center><div class="box"><h1 id="login"> Admin Login </h1><hr>
           <form action="StudentLoginConf">
    <table class="table" id="td">
        <td><select name="usertype"><option>Student</option></select></td></tr>
<tr><td><input type="email" name="email" placeholder="Email"></td></tr>
<tr><td><input type="password" name="password" placeholder="Password"></td></tr>
</table>
 <input type="submit" name="login" value="Login" id="button">
    <hr>
    <label style="color: white; margin-right: 120px; font-size: 17px;">
        <input type="checkbox" checked="checked" name="remember"> Remember me  </label> 
        <label style="color: white; font-size: 17px;">Forget Password?
      </label>
    Forget Password?
   
</form>
</div></center> </body>
</html>
