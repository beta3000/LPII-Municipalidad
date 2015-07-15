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
    <title>Informes - Servicio Vehicular</title>
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
    <%@include file="jasg-menu.jsp" %>
    <!-- Inicio cabezera -->
    <div class="container">
      <div class="row">
        <h1 class="text-left">Informes de Servicio Vehicular</h1>
        <p>En la siguiente lista se muestran los Informes de Servicio Vehicular registrados en el Sistema.</p>
      </div>
    </div>
    <!-- Fin cabezera-->
    <!-- Inicio Tabla Lista -->
    <div class="container">
      <div class="row">
         <table class="table table-bordered table-hover">
	          <tr>
	            <th>ID</th>
	            <th>Fecha</th>
	            <th>Fecha Entrega</th>
	            <th>Asunto</th>
	            <th>Contenido</th>
	            <th>Estado</th>
	            <th>Operación</th>
	          </tr>
	          <jstlc:forEach items="${requestScope.listaInformeServicioVehicularJASG }" var="l">
	          	<tr>
	          		<td>${l.idInforme}</td>
	          		<td>${l.fechaInforme}</td>
	          		<td>${l.fechaEntregaInforme}</td>
	          		<td>${l.descripcionAsuntoInforme}</td>
	                <td>${l.contenidoInforme}</td>
	                <td>${l.descripcionEstadoInforme}</td>
			        <td>
		              <a href="MantenimientoInforme?tipo=cargarDatosInformeJASG&idInforme=${l.idInforme}">
		                <button class="btn btn-primary">
		                  <span class="glyphicon glyphicon-new-window"></span>
		                  Revisar
		                </button>
		              </a>
				      <a href="MantenimientoInforme?tipo=aprobarInformeJASG&idInforme=${l.idInforme}">
		                <button class="btn btn-success">
		                  <span class="glyphicon glyphicon-ok"></span>
		                  Aprobar
		                </button>
		              </a>
		              <a href="MantenimientoInforme?tipo=desaprobarInformeJASG&idInforme=${l.idInforme}">
		                <button class="btn btn-danger">
		                  <span class="glyphicon glyphicon-remove"></span>
		                  Desaprobar
		                </button>
		              </a>
		            </td>
	          	</tr>
	          </jstlc:forEach>
	        </table>
      </div>
    </div>
    <!-- Fin Tabla Lista  -->
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery-1.11.3.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>