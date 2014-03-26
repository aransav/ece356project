<%-- 
    Document   : makeAppointment
    Created on : Mar 26, 2014, 4:19:12 PM
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
    
  </head>

  <body>
       <div id="wrapper">

        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="frontPage.jsp">Super Cool New Program</a>
            </div>
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="userProf.jsp"><i class="fa fa-user fa-fw"></i> User Profile</a>
                        </li>
                        <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="logoutRefresh.jsp"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->

        </nav>
        <!-- /.navbar-static-top -->

        <nav class="navbar-default navbar-static-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="side-menu">
                    <li class="sidebar-search">
                        <div class="input-group custom-search-form">
                            <input type="text" class="form-control" placeholder="Search...">
                            <span class="input-group-btn">
                                <button class="btn btn-default" type="button">
                                    <i class="fa fa-search"></i>
                                </button>
                            </span>
                        </div>
                        <!-- /input-group -->
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Charts<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">Random Chart 1</a>
                            </li>
                            <li>
                                <a href="#">Random Chart 2</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-table fa-fw"></i> Tables</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-edit fa-fw"></i> Forms</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-wrench fa-fw"></i>Settings<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">Personal Settings</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-sitemap fa-fw"></i> Multi-Level Dropdown<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">Second Level Item</a>
                            </li>
                            <li>
                                <a href="#">Third Level <span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="#">Third Level Item</a>
                                    </li>
                                </ul>
                                <!-- /.nav-third-level -->
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                    <li class="active">
                        <a href="#"><i class="fa fa-files-o fa-fw"></i>Other Pages<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="logoutRefresh.jsp">Login Page</a>
                            </li>
                            <li>
                                <a href="userProf.jsp">User Profile</a>
                            </li>
                            <li>
                                <a href="makeAppointment.jsp">Make New Appointment</a>
                            </li>                            
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                </ul>
                <!-- /#side-menu -->
            </div>
            <!-- /.sidebar-collapse -->
        </nav>
        <!-- /.navbar-static-side -->
        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Make an Appointment</h1>
                </div>
            </div>
            <form role="form" method="post" action="serv_mkapt">
                <div class="row">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <div class="col-lg-12">
                                <h3>Patient Details</h3>
                            </div>
                            <div class ="row" > <!--Gather Patient Info -->
                                <div class="col-lg-4" style="padding-top: 5px;">
                                    <div style="text-align: left;">
                                        <label>User ID</label>
                                    </div>
                                    <div class="input-group">
                                        <span class ="input-group-addon"><i class="fa fa-user" style="width: 10px;"></i></span>
                                        <input type="text" name="userID" class="form-control" placeholder="User ID" required>
                                    </div>
                                </div> 
                                <div class="col-lg-4" style="padding-top: 5px;">
                                    <div style="text-align: left;">
                                        <label>Date</label>
                                    </div>
                                    <div class="input-group">
                                        <span class ="input-group-addon"><i class="fa fa-calendar" style="width: 10px;"></i></span>
                                        <input type="date" name="ap_date" class="form-control" placeholder="Date" required>
                                    </div>
                                </div>
                                <div class="col-lg-4" style="padding-top: 5px;">
                                    <div style="text-align: left;">
                                        <label>Time</label>
                                    </div>
                                    <div class="input-group">
                                        <span class ="input-group-addon"><i class="fa fa-clock-o" style="width: 10px;"></i></span>
                                        <input type="time" name="ap_time" class="form-control" placeholder="Time" required>
                                    </div>
                                </div>                                                                
                            </div>
                            <div class="col-lg-12">
                                <h3>Doctor Details</h3>
                            </div>
                            <div class ="row" >
                                <div class="col-lg-12" style="padding-top: 5px;">
                                    <div class="checkbox" style="text-align: left;">
                                      <label>
                                        <input name="visPrime" type="checkbox" checked="checked">Are you making an appointment with your primary doctor?
                                      </label>
                                    </div>   
                                </div>
                            </div>
                            <div class ="row" >
                                <div class="col-lg-12" style="padding-top: 5px;">
                                    <label> If you are not visiting your primary doctor please fill in information below </label>
                                </div>
                            </div>
                            <div class ="row" >
                                <div class="col-lg-6" style="padding-top: 5px;">
                                    <div style="text-align: left;">
                                        <label>Doctors Name</label>
                                    </div>
                                    <div class="input-group">
                                        <span class ="input-group-addon"><i class="fa fa-user-md" style="width: 10px;"></i></span>
                                        <input type="text" name="d_name" class="form-control" placeholder="Doctors Name">
                                    </div>
                                </div>   
                                <div class="col-lg-6" style="padding-top: 5px;">
                                    <div style="text-align: left;">
                                        <label>Doctors Department</label>
                                    </div>
                                    <div class="input-group">
                                        <span class ="input-group-addon"><i class="fa fa-hospital-o" style="width: 10px;"></i></span>
                                        <input type="text" name="d_depart" class="form-control" placeholder="Doctors Department">
                                    </div>
                                </div>                                    
                            </div>
                            <div class="col-lg-12">
                                <h3>Appointment Details</h3>
                            </div>
                            <div class ="row" >
                                <div class="col-lg-4" style="padding-top: 5px;">
                                    <div style="text-align: left;">
                                        <label>Status</label>
                                    </div>
                                    <div class="input-group">
                                        <span class ="input-group-addon"><i class="fa fa-user" style="width: 10px;"></i></span>
                                        <input type="text" name="ap_status" class="form-control" placeholder="Status" disabled>
                                    </div>
                                </div>
                                <div class="col-lg-4" style="padding-top: 5px;">
                                    <div style="text-align: left;">
                                        <label>Appointment Length</label>
                                    </div>
                                    <div class="input-group">
                                        <span class ="input-group-addon"><i class="fa fa-clock-o" style="width: 10px;"></i></span>
                                        <input type="text" name="ap_length" class="form-control" placeholder="###" required>
                                    </div>
                                </div>
                                <div class="col-lg-4" style="padding-top: 5px;">
                                    <div style="text-align: left;">
                                        <label>Procedure</label>
                                    </div>
                                    <div class="input-group">
                                        <span class ="input-group-addon"><i class="fa fa-stethoscope" style="width: 10px;"></i></span>
                                        <input type="text" name="ap_procedure" class="form-control" placeholder="" required>
                                    </div>
                                </div>                             
                            </div>
                        </div>                
                    </div>              
                </div>
                <button class="btn btn-lg btn-primary btn-block" type="submit" >Make Appointment</button>
            </form>
            
        </div>
    </div>

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