<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
  <%
  	Date curDate = new Date();
  	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
  	String DateToStr = format.format(curDate);
  %>
    <%@include file="jsgl-menu.jsp" %>
    <!-- Inicio cabezera -->
    <div class="container">
      <div class="row">
        <h1 class="text-left">Revisar Memorando</h1>
        <p>Aprobar o Desparobar un Memorando Registrado en el Sistema</p>
      </div>
    </div>
    <!-- Fin cabezera-->
    <!-- Inicio Formulario de Registro-->
    <div class="container">
      <div class="row">
        <form action="" class="form-horizontal" name="" method="POST">
 		  <div class="form-group">
            <label for="inputIdMemorando" class="col-sm-3 control-label">ID Memorando</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="inputIdMemorando" placeholder="Nombres" name="txtNombres" value="${requestScope.memorando.idMemorando }" required disabled="disabled">
            </div>
          </div>
          <div class="form-group">
            <label for="inputFechaMemorando" class="col-sm-3 control-label">Fecha</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="inputFechaMemorando" placeholder="Fecha" name="txtFecha" value="${requestScope.memorando.fechaMemorando }" required disabled="disabled">
            </div>
          </div>
          <div class="form-group">
            <label for="inputContenidoMemorando" class="col-sm-3 control-label">Contenido</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="inputContenidoMemorando" placeholder="Contenido" name="txtContenido" value="${requestScope.memorando.contenidoMemorando }" required disabled="disabled">
            </div>
          </div>
          <div class="form-group">
            <label for="inputAsuntoMemorando" class="col-sm-3 control-label">Asunto</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="inputAsuntoMemorando" placeholder="Asunto" name="txtAsunto" value="${requestScope.memorando.descripcionAsuntoMemorando }" required disabled="disabled">
            </div>
          </div>
          <div class="form-group">
            <label for="inputEstadoMemorando" class="col-sm-3 control-label">Estado</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="inputEstadoMemorando" placeholder="Estado" name="txtEstado" value="${requestScope.memorando.descripcionEstadoMemorando }" required disabled="disabled">
            </div>
          </div>
          <div class="form-group">
            <label for="inputRemnitenteMemorando" class="col-sm-3 control-label">ID Remitente</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="inputRemnitenteMemorando" placeholder="Remitente" name="txtRemitente" value="${requestScope.memorando.idUsuarioRemitente }" required disabled="disabled">
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