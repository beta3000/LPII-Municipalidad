<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Administradores Listado</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
    <%@include file="a-menu.jsp" %>
    <!-- Inicio cabezera -->
    <div class="container">
      <div class="row">
        <h1 class="text-left">Agregar Nuevo Vehículo</h1>
        <p>Completar el siguiente formulario para registrar un nuevo Vehículo en el Sistema</p>
      </div>
    </div>
    <!-- Fin cabezera-->
    <!-- Inicio Formulario de Registro-->
    <div class="container">
      <div class="row">
        <form action="MantenimientoVehiculo?tipo=registrar" class="form-horizontal" name="" method="POST">
          <div class="form-group">
            <label for="inputPlaca" class="col-sm-3 control-label">Placa</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="inputPlaca" placeholder="Placa" name="txtPlaca" required>
            </div>
          </div>
          <div class="form-group">
            <label for="inputMarca" class="col-sm-3 control-label">Marca</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="inputMarca" placeholder="Marca" name="txtMarca" required>
            </div>
          </div>
          <div class="form-group">
            <label for="inputModelo" class="col-sm-3 control-label">Modelo</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="inputModelo" placeholder="Modelo" name="txtModelo" required>
            </div>
          </div>
          <div class="form-group">
            <label for="inputAño" class="col-sm-3 control-label">Año</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="inputAño" placeholder="Año" name="txtAnio" required>
            </div>
          </div>
          <div class="form-group">
            <label for="inputColor" class="col-sm-3 control-label">Color</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="inputColor" placeholder="Color" name="txtColor" required>
            </div>
          </div>
          <div class="form-group">
            <div class="col-sm-offset-3 col-sm-5">
              <button type="submit" class="btn btn-default btn-lg btn-block btn-primary">Registrar</button>
              <button type="reset" class="btn btn-default btn-lg btn-block btn-default">Limpiar</button>
            </div>
          </div>
        </form>
      </div>
    </div>
    <!-- Fin Formulario de Registro -->
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery-1.11.3.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>