<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Administración</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <!-- DataTables -->
    <link rel="stylesheet" href="css/jquery.dataTables.min.css">
    <link rel="stylesheet" href="css/jquery.dataTables_themeroller.min.css">
  </head>
  <body>
   <%@include file="chofer-menu.jsp" %>
    <!-- Inicio cabezera de escritorio -->
    <div class="container">
      <div class="row">
        <h1 class="text-center">Bienvedido ${sessionScope.USUARIO.descripcionTipoUsuario}  @<small>${sessionScope.USUARIO.apellidoPaternoUsuario} ${sessionScope.USUARIO.apellidoMaternoUsuario},${sessionScope.USUARIO.nombresUsuario}</small></h1>
        <p class="text-center">
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Odio sunt fuga a dignissimos nulla, recusandae, mollitia tempore molestias perferendis, id aspernatur voluptas? Suscipit aliquid saepe corporis, magnam quidem impedit, ex.
        </p>
        <p class="text-center">
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Distinctio impedit alias est illo, repellat nemo nulla fuga, nisi quod, veniam placeat, quo nesciunt sit deleniti quisquam hic ut a dicta?
        </p>
      </div>
    </div>
    <!-- Fin cabezera de escritorio -->
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery-1.11.3.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    <!-- DataTables -->
    <script src="js/jquery.dataTables.js"></script>
    <script src="js/misFunciones.js"></script>
  </body>
</html>