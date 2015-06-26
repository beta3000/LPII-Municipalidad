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
    <title>Vehículos Listado</title>
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
        <h1 class="text-left">Lista de Vehículos</h1>
        <p>En la siguiente lista se muestran los Vehículos registrados en el Sistema.</p>
        <a href="a-vehiculos-nuevo.jsp">
                <button class="btn btn-primary">
                  <span class="glyphicon glyphicon-plus"></span>
                  Agregar Nuevo
                </button>
        </a>
      </div>
    </div>
    <!-- Fin cabezera-->
    <!-- Inicio Tabla Lista -->
    <div class="container">
      <div class="row">
        <table class="table table-bordered table-hover">
          <tr>
            <th>ID</th>
            <th>Placa</th>
            <th>Marca</th>
            <th>Modelo</th>
            <th>Año</th>
            <th>Color</th>
            <th>Operación</th>
          </tr>
          <jstlc:forEach items="${requestScope.listaVehiculos }" var="l">
            <tr>
              <td>${l.idVehiculo}</td>
            <td>${l.placaVehiculo}</td>
            <td>${l.marcaVehiculo}</td>
            <td>${l.modeloVehiculo}</td>
            <td>${l.anioFabricacionVehiculo}</td>
            <td>${l.colorVehiculo}</td>
            <td>
              <a href="MantenimientoVehiculo?tipo=cargarDatos&idVehiculo=${l.idVehiculo}">
                <button class="btn btn-primary">
                  <span class="glyphicon glyphicon-pencil"></span>
                  Editar
                </button>
              </a>
              <a href="MantenimientoVehiculo?tipo=eliminar&idVehiculo=${l.idVehiculo}">
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