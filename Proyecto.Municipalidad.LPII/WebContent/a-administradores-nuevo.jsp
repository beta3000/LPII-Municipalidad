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
        <h1 class="text-left">Agregar Nuevo Administrador</h1>
        <p>Completar el siguiente formulario para registrar un nuevo Administrador en el Sistema</p>
      </div>
    </div>
    <!-- Fin cabezera-->
    <!-- Inicio Formulario de Registro-->
    <div class="container">
      <div class="row">
        <form action="MantenimientoUsuario?tipo=registrarAdministrador" class="form-horizontal" name="" method="POST">
          <div class="form-group">
            <label for="inputNombres" class="col-sm-3 control-label">Nombres</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="inputNombres" placeholder="Nombres" name="txtNombres">
            </div>
          </div>
          <div class="form-group">
            <label for="inputApellidoPaterno" class="col-sm-3 control-label">Apellido Paterno</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="inputApellidoPaterno" placeholder="Apellido Paterno" name="txtApellidoPaterno">
            </div>
          </div>
          <div class="form-group">
            <label for="inputApellidoMaterno" class="col-sm-3 control-label">Apellido Materno</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="inputApellidoMaterno" placeholder="Apellido Materno" name="txtApellidoMaterno">
            </div>
          </div>
          <div class="form-group">
            <label for="inputfechaNacimiento" class="col-sm-3 control-label">Fecha Nacimiento</label>
            <div class="col-sm-5">
              <input type="date" class="form-control" id="inputfechaNacimiento" name="txtFecha">
            </div>
          </div>
          <div class="form-group">
            <label for="inputDNI" class="col-sm-3 control-label">DNI</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="inputDNI" placeholder="DNI" name="txtDNI">
            </div>
          </div>
          <div class="form-group">
            <label for="inputCorreo" class="col-sm-3 control-label">Correo</label>
            <div class="col-sm-5">
              <input type="email" class="form-control" id="inputCorreo" placeholder="Correo" name="txtCorreo">
            </div>
          </div>
          <div class="form-group">
            <label for="inputDireccion" class="col-sm-3 control-label">Dirección</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="inputDireccion" placeholder="Dirección" name="txtDireccion">
            </div>
          </div>
          <div class="form-group">
            <label for="selectDistrito" class="col-sm-3 control-label">Distrito</label>
            <div class="col-sm-5">
              <select name="selectDistrito" id="selectDistrito" class="form-control">
                <ct:cboDinamico sql="SQL_DISTRITO" nombre="cboDistrito"></ct:cboDinamico>
            </select>
            </div>
          </div>
          <div class="form-group">
            <label for="selectSexo" class="col-sm-3 control-label">Sexo</label>
            <div class="col-sm-5">
              <select name="selectSexo" id="selectSexo" class="form-control">
                <ct:cboDinamico sql="SQL_SEXO" nombre="cboSexo"></ct:cboDinamico>
            </select>
            </div>
          </div>
          <div class="form-group">
            <label for="inputTelefono" class="col-sm-3 control-label">Teléfono</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="inputTelefono" placeholder="Teléfono" name="txtTelefono">
            </div>
          </div>
          <div class="form-group">
            <label for="inputLogin" class="col-sm-3 control-label">Login</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="inputLogin" placeholder="Login" name="txtLogin">
            </div>
          </div>
          <div class="form-group">
            <label for="inputPassword" class="col-sm-3 control-label">Password</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="inputPassword" placeholder="Password" name="txtPassword">
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