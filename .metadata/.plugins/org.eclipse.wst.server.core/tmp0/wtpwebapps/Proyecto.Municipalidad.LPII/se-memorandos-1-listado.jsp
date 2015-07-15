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
    <title>Memorandos - Requerimiento Vehicular</title>
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
    <%@include file="se-menu.jsp" %>
    <!-- Inicio cabezera -->
    <div class="container">
      <div class="row">
        <h1 class="text-left">Memorandos de Requerimento Vehicular</h1>
        <p>En la siguiente lista se muestran los Memorandos de Requerimento Vehicular registrados en el Sistema.</p>
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
	            <th>Asunto</th>
	            <th>Contenido</th>
	            <th>Estado</th>
	            <th>Operación</th>
	          </tr>
	          <jstlc:forEach items="${requestScope.listaMemorandoRequerimientoVehicularSecretaria }" var="l">
	          	<tr>
	          		<td>${l.idMemorando}</td>
	          		<td>${l.fechaMemorando}</td>
	          		<td>${l.descripcionAsuntoMemorando}</td>
	                <td>${l.contenidoMemorando}</td>
	                <td>${l.descripcionEstadoMemorando}</td>
			        <td>
		              <a href="MantenimientoMemorando?tipo=cargarDatosMemorandoSecretaria&idMemorando=${l.idMemorando}">
		                <button class="btn btn-primary">
		                  <span class="glyphicon glyphicon-new-window"></span>
		                  Revisar
		                </button>
		              </a>
				      <a href="MantenimientoMemorando?tipo=aprobarMemorandoSecretaria&idMemorando=${l.idMemorando}">
		                <button class="btn btn-success">
		                  <span class="glyphicon glyphicon-ok"></span>
		                  Aprobar
		                </button>
		              </a>
		              <a href="MantenimientoMemorando?tipo=desaprobarMemorandoSecretaria&idMemorando=${l.idMemorando}">
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