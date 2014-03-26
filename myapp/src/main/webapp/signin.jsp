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

    <!-- Bootstrap core CSS -->
    <link href="bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="aran.css" rel="stylesheet">
  </head>

  <body>
    <div class="container" id="signbodyCenter">
      <form class="form-signin" role="form">
        <h2 class="form-signin-heading">Please sign in</h2>
        <input type="userID" class="form-control" placeholder="User ID" required autofocus>
        <input type="password" class="form-control" placeholder="Password" required>
        <br>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>
    </div> <!-- /container -->

  </body>
</html>

