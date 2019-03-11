<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
</head>

    <body>
        <div class="container-fluid bg-light">
            
            <br><br><br>
            <div class="row">
                <div class="col-md-4"></div>
                <div class="col-md-4">
                       <center><h3>Add Product</h3></center>
                    <form >
                <div class="form-group">
                  <label for="productid">Product ID:</label>
                  <input type="text" name="productId" class="form-control" maxlength="10">
                </div>
                <div class="form-group">
                  <label for="productName">Product Name:</label>
                  <input type="text" name="productName"class="form-control" minlength="8" maxlength="20">
                  
                </div>

                <div class="form-group">
                    <label for="price">Price:</label>
                    <input type="number" name="price" class="form-control" >
                </div>

                <div class="form-group">
                        <label for="quantity">Quantity:</label>
                        <input type="number" name="quantity" class="form-control">
                </div>
             
                <center><button type="submit" class="btn btn-success">Submit</button>&nbsp;&nbsp;&nbsp;<button type="reset" class="btn btn-danger ">Reset</button></center>
              </form>
            </div>
            </div>
            </div>
        
    </body>
</html>
