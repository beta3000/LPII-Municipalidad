<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="jstlc" uri="http://java.sun.com/jstl/core_rt"%>    
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Talleres Mecánicos Listado</title>
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
        <h1 class="text-left">Lista de Talleres Mecánicos <a href="a-talleres-nuevo.jsp">
                <button class="btn btn-primary">
                  <span class="glyphicon glyphicon-plus"></span>
                  Agregar Nuevo
                </button>
        </a></h1>
        <p>En la siguiente lista se muestran los Talleres Mecánicos registrados en el Sistema.</p>
      </div>
    </div>
    <!-- Fin cabezera-->
    <!-- Inicio Tabla Lista -->
    <div class="container">
      <div class="row">
        <table class="table table-bordered table-hover">
          <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Dirección</th>
            <th>Teléfono</th>
            <th>Distrito</th>
            <th>Operación</th>
          </tr>
          <jstlc:forEach items="${requestScope.listaTalleres }" var="l">
            <tr>
              <td>${l.idTallerMecanico}</td>
            <td>${l.nombreTallerMecanico}</td>
            <td>${l.direccionTallerMecanico}</td>
            <td>${l.telefonoTallerMecanico}</td>
            <td>${l.nombreDistrito}</td>
            <td>
              <a href="MantenimientoTallerMecanico?tipo=cargarDatos&idTaller=${l.idTallerMecanico}">
                <button class="btn btn-primary">
                  <span class="glyphicon glyphicon-pencil"></span>
                  Editar
                </button>
              </a>
              <a href="MantenimientoTallerMecanico?tipo=eliminar&idTaller=${l.idTallerMecanico}">
                <button class="btn btn-danger">
                  <span class="glyphicon glyphicon-remove"></span>
                  Eliminar
                </button>
              </a>
            </td>
            </tr>
          </jstlc:forEach>
        </table>
      </div>
    </div>
    <!-- Fin Tabla Lista -->
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery-1.11.3.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>