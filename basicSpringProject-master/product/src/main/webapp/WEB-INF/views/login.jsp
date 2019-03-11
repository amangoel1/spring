<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
        <title>LoginForm</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container-fluid bg-light">
            
            <br><br><br>
            <div class="row">
                <div class="col-md-4"></div>
                <div class="col-md-4">
                       <center><h3>Login Form</h3></center>
                    <form action="login.html" method="POST">
                <div class="form-group">
                  <label for="userid">User ID:</label>
                  <input type="text" name="userName" class="form-control" id="userid" maxlength="10">
                </div>
                <div class="form-group">
                  <label for="password">Password:</label>
                  <input type="password" name="password" class="form-control" id="password" maxlength="20">
                </div>
               
                
                <center><button type="submit" class="btn btn-success">Login</button>&nbsp;&nbsp;&nbsp;<button type="reset" class="btn btn-danger ">Reset</button></center>
              </form>
            </div>
            </div>
            </div>
        
    </body>
</html>