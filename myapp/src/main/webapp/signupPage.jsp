<%-- 
    Document   : signupPage
    Created on : Mar 25, 2014, 6:53:09 PM
    Author     : Aran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Core CSS - Include with every page -->
    <link href="bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet">

    <!-- Page-Level Plugin CSS - Dashboard -->
    <link href="css/plugins/morris/morris-0.4.3.min.css" rel="stylesheet">
    <link href="css/plugins/timeline/timeline.css" rel="stylesheet">

    <!-- SB Admin CSS - Include with every page -->
    <link href="css/sb-admin.css" rel="stylesheet">
    <link href="css/aran.css" rel="stylesheet">
    
  </head>

  <body>
      
   <div class="container" id="signupbodyCenter">
      <form class="form-horizontal" role="form" action="serv_signup" method="post">
        <h2 class="form-signin-heading">Welcome to Sign Up Page</h2>
        <span class="bg-danger">*${errorMessage}</span>
        <div class ="form-group"> 
            <div class="input-group" style="padding-top: 5px;">
                <span class ="input-group-addon" style="padding-right: 98px">First Name</span>
                <span class ="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" name="fname" class="form-control" placeholder="First Name" required autofocus>
            </div>
        </div>
        <div class ="form-group"> 
            <div class="input-group" style="padding-top: 5px;">
                <span class ="input-group-addon" style="padding-right: 85px">Middle Name</span>
                <span class ="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" name="mname" class="form-control" placeholder="Middle Name" required>
            </div>
        </div>
        <div class ="form-group"> 
            <div class="input-group" style="padding-top: 5px;">
                <span class ="input-group-addon" style="padding-right: 100px">Last Name</span>
                <span class ="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" name="lname" class="form-control" placeholder="Last Name" required>
            </div>
        </div>
        <div class ="form-group"> 
            <div class="input-group" style="padding-top: 5px;">
                <span class ="input-group-addon" style="padding-right: 40px">Health Card Number</span>
                <span class ="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" name="hcard" class="form-control" placeholder="Health Card Number" required>
            </div>
        </div>
        <div class ="form-group"> 
            <div class="input-group" style="padding-top: 5px;">
                <span class ="input-group-addon" width="20px">Social Insurance Number</span>
                <span class ="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" name="scard" class="form-control" placeholder="Social Insurance Number">
            </div>
        </div>
        <div class ="form-group"> 
            <div class="input-group" style="padding-top: 5px;">
                <span class ="input-group-addon" style="padding-right: 78px">Street Number</span>
                <span class ="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" name="add_streetno" class="form-control" placeholder="Street Number">
            </div>
        </div>
        <div class ="form-group"> 
            <div class="input-group" style="padding-top: 5px;">
                <span class ="input-group-addon" style="padding-right: 90px">Street Name</span>
                <span class ="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" name="add_street" class="form-control" placeholder="Street Name">
            </div>
        </div>
        <div class ="form-group"> 
            <div class="input-group" style="padding-top: 5px;">
                <span class ="input-group-addon" style="padding-right: 50px">Apartment Number</span>
                <span class ="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" name="add_aptno" class="form-control" placeholder="Apartment Number">
            </div>
        </div>
        <div class ="form-group"> 
            <div class="input-group" style="padding-top: 5px;">
                <span class ="input-group-addon" style="padding-right: 143px">City</span>
                <span class ="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" name="add_city" class="form-control" placeholder="City">
            </div>
        </div>
        <div class ="form-group"> 
            <div class="input-group" style="padding-top: 5px;">
                <span class ="input-group-addon" style="padding-right: 110px">Province</span>
                <span class ="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" name="add_prov" class="form-control" placeholder="Province">
            </div>
        </div>
        <div class ="form-group"> 
            <div class="input-group" style="padding-top: 5px;">
                <span class ="input-group-addon" style="padding-right: 108px">Zip Code</span>
                <span class ="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" name="add_zip" class="form-control" placeholder="Zip Code">
            </div>
        </div>
        <div class ="form-group"> 
            <div class="input-group" style="padding-top: 5px;">
                <span class ="input-group-addon" style="padding-right: 70px">Phone Number</span>
                <span class ="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="tel" name="phone_no" class="form-control" placeholder="Phone Number">
            </div>
        </div>
        <div class ="form-group"> 
            <div class="input-group" style="padding-top: 5px;">
                <span class ="input-group-addon" style="padding-right: 85px">Date of Birth</span>
                <span class ="input-group-addon"><i class="fa fa-calendar"></i></span>
                <input type="date" name="dob" class="form-control" placeholder="Date of Birth">
            </div>
        </div>
        <div class ="form-group">
            <div class="input-group">
                <span class ="input-group-addon" style="padding-right: 103px">Password</span>
                <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                <input type="password" name="password1" class="form-control" placeholder="Password" required>
            </div>
        </div>
        <div class ="form-group">
            <div class="input-group">
                <span class ="input-group-addon" style="padding-right: 103px">Password</span>
                <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                <input type="password" name="password2" class="form-control" placeholder="Re-enter Password" required>
            </div>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit" >Sign Up</button> 
        <div class="form-group">
            <div class="col-md-12 control">
                <div style="padding-top:15px; font-size:85%" >
                    Already have an account! 
                <a href="index.jsp" >
                    Sign In Here
                </a>
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-md-12 control">
                <div style="font-size:85%" >
                    Forgot Password? 
                <a href="resetpassPage.jsp" >
                    Reset it Here
                </a>
                </div>
            </div>
        </div>
      </form>
       
    </div> <!-- /container --> 

    <!-- Core Scripts - Include with every page -->
    <script src="js/jquery-1.10.2.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>

    <!-- Page-Level Plugin Scripts - Dashboard -->
    <script src="js/plugins/morris/raphael-2.1.0.min.js"></script>
    <script src="js/plugins/morris/morris.js"></script>

    <!-- SB Admin Scripts - Include with every page -->
    <script src="js/sb-admin.js"></script>

    <!-- Page-Level Demo Scripts - Dashboard - Use for reference -->
    <script src="js/demo/dashboard-demo.js"></script>
    
  </body>
</html>
