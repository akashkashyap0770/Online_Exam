<%-- 
    Document   : AdminChangePassword
    Created on : 18 Jul, 2023, 3:34:31 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            *{
                margin: 30px;
                box-sizing: border-box;
            }
            .container{
                width: 530px;
                height: 530px;
                border: 2px solid black;
                background-color: black;
                color: white;
                
            }
            
        </style>
    </head>
    <body><center>
        <div class="container">
            <form action="StudentChangePassword">
                <h1>Student Change Password</h1>
                <br>
                <span>Old Password : <input type="password" name="opswd" value=""></span>
                <br>
                <span>New Password : <input type="password" name="npswd" value=""></span>
                <br>
                <span>Confirm Password : <input type="password" name="cpswd" value=""></span>
                <br>
                <button>Submit</button><button>Reset</button>
            </form>    
        </div>
    </center>
    </body>
</html>
