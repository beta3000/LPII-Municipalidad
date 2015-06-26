<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="ct" uri="http://proyecto.mantenimiento" %>    
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>INICIAR SESIÓN</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/login.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
  	<div class="container">
    	<div class="row">
        	<div class="col-sm-6 col-md-4 col-md-offset-4">
	        <h1 class="text-center login-title">Municipalidad</h1>
	        <h5>${requestScope.msj }</h5>
	            <div class="account-wall">
	                <img class="profile-img" src="img/login.svg"
	                    alt="">
	                <form class="form-signin" method="post" action="MantenimientoUsuario?tipo=sesion">
	                <input type="text" class="form-control" placeholder="Login" required autofocus name="txtLogin">
	                <input type="password" class="form-control" placeholder="Contraseña" required name="txtPassword">
	                <button class="btn btn-lg btn-primary btn-block" type="submit">
	                    Iniciar Sesión</button>
	                <label class="checkbox pull-left">
	                    <input type="checkbox" value="remember-me">
	                    Recordarme
	                </label>
	                <a href="#" class="pull-right need-help">Necesitas Ayuda?</a><span class="clearfix"></span>
	                </form>
	            </div>
	        </div>
	    </div>
	</div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery-1.11.3.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>