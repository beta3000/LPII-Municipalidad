<jsp:include page="se-sesion.jsp"/>
<!-- Inicio Barra de navegación -->
    <div class="container-fluid">
      <div class="row">
        <nav class="navbar navbar-default" role="navigation">
          <!-- El logotipo y el icono que despliega el menú se agrupan
               para mostrarlos mejor en los dispositivos móviles -->
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target=".navbar-ex1-collapse">
              <span class="sr-only">Desplegar navegación</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="se-escritorio.jsp">Escritorio</a>
          </div>
          <div class="collapse navbar-collapse navbar-ex1-collapse">
            <ul class="nav navbar-nav">
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                  MEMORANDOS<b class="caret"></b>
                </a>
                <ul class="dropdown-menu">
                  <li><a href="MantenimientoMemorando?tipo=listarMemorandoRequerimientoVehicularSecretaria">Requerimiento Vehicular</a></li>
                </ul>
              </li> 
            </ul>
            <ul class="nav navbar-nav navbar-right" role="navigation">
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    PERFIL <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                      <li><a href="#">Ver Perfil</a></li>
                      <li><a href="#">Editar Perfil</a></li>
                    </ul>
                </li>
                <li><a href="ServletCerrar">SALIR</a></li>
            </ul>
          </div>
        </nav> 
      </div>
    </div>
    <!-- Fin Barra de Navegación -->