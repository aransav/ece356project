<%-- 
    Document   : index
    Created on : Mar 24, 2014, 11:20:16 PM
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
      
   <div class="container" id="signbodyCenter">
      <form class="form-horizontal" role="form" action="serv_login" method="post">
        <h2 class="form-signin-heading">Please Sign In</h2>
        <div class ="form-group"> 
            <div class="input-group" style="padding-top: 5px;">
                <span class ="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" name="userID" class="form-control" placeholder="User ID" required autofocus>
            </div>
        </div>
        <div class ="form-group">
            <div class="input-group">
                <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                <input type="password" name="password" class="form-control" placeholder="Password" required>
            </div>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit" >Sign in</button> 
        <div class="form-group">
            <div class="col-md-12 control">
                <div style="padding-top:15px; font-size:85%" >
                    Don't have an account! 
                <a href="signupPage.jsp" >
                    Sign Up Here
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


