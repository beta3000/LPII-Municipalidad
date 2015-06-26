package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class a_002dadministradores_002dnuevo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/a-menu.jsp");
    _jspx_dependants.add("/WEB-INF/tag/proyecto.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fct_005fcboDinamico_0026_005fsql_005fnombre_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fct_005fcboDinamico_0026_005fsql_005fnombre_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fct_005fcboDinamico_0026_005fsql_005fnombre_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("    <title>Administradores Listado</title>\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sesion.jsp", out, false);
      out.write("\r\n");
      out.write("<!-- Inicio Barra de navegación -->\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("          <!-- El logotipo y el icono que despliega el menú se agrupan\r\n");
      out.write("               para mostrarlos mejor en los dispositivos móviles -->\r\n");
      out.write("          <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("                    data-target=\".navbar-ex1-collapse\">\r\n");
      out.write("              <span class=\"sr-only\">Desplegar navegación</span>\r\n");
      out.write("              <span class=\"icon-bar\"></span>\r\n");
      out.write("              <span class=\"icon-bar\"></span>\r\n");
      out.write("              <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"a-escritorio.jsp\">Escritorio</a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\r\n");
      out.write("            <ul class=\"nav navbar-nav\">\r\n");
      out.write("              <li class=\"dropdown\">\r\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                  MEMORANDOS<b class=\"caret\"></b>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"dropdown-menu\">\r\n");
      out.write("                  <li><a href=\"a-memorandos-1-listado.jsp\">Requerimiento de Vehículos y Choferes</a></li>\r\n");
      out.write("                  <li><a href=\"a-memorandos-2-listado.jsp\">Mantenimiento de Vehículos</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"dropdown\">\r\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                  SOLICITUDES<b class=\"caret\"></b>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"dropdown-menu\">\r\n");
      out.write("                  <li><a href=\"a-solicitudes-1-listado.jsp\">Requerimiento de Vehículos y Choferes</a></li>\r\n");
      out.write("                  <li><a href=\"a-solicitudes-2-listado.jsp\">Mantenimiento de Vehículos</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"dropdown\">\r\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                  INFORMES<b class=\"caret\"></b>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"dropdown-menu\">\r\n");
      out.write("                  <li><a href=\"a-informes-1-listado.jsp\">Requerimiento de Vehículos y Choferes</a></li>\r\n");
      out.write("                  <li><a href=\"a-informes-2-listado.jsp\">Mantenimiento de Vehículos</a></li>\r\n");
      out.write("                  <li><a href=\"a-informes-3-listado.jsp\">Reparación Vehicular</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"dropdown\">\r\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                  USUARIOS <b class=\"caret\"></b>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"dropdown-menu\">\r\n");
      out.write("                  <li><a href=\"a-empleados-listado.jsp\">Empleados Municipales</a></li>\r\n");
      out.write("                  <li><a href=\"MantenimientoUsuario?tipo=listarAdministrador\">Administradores</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"dropdown\">\r\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                  OTROS<b class=\"caret\"></b>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"dropdown-menu\">\r\n");
      out.write("                  <li><a href=\"MantenimientoVehiculo?tipo=listar\">Vehículos</a></li>\r\n");
      out.write("                  <li><a href=\"MantenimientoTallerMecanico?tipo=listar\">Talleres Mecánicos</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\" role=\"navigation\">\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                  <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                    PERFIL <b class=\"caret\"></b>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                      <li><a href=\"#\">Ver Perfil</a></li>\r\n");
      out.write("                      <li><a href=\"#\">Editar Perfil</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li><a href=\"ServletCerrar\">SALIR</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("        </nav> \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Fin Barra de Navegación -->");
      out.write("\r\n");
      out.write("    <!-- Inicio cabezera -->\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <h1 class=\"text-left\">Agregar Nuevo Administrador</h1>\r\n");
      out.write("        <p>Completar el siguiente formulario para registrar un nuevo Administrador en el Sistema</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Fin cabezera-->\r\n");
      out.write("    <!-- Inicio Formulario de Registro-->\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <form action=\"MantenimientoUsuario?tipo=registrarAdministrador\" class=\"form-horizontal\" name=\"\" method=\"POST\">\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"inputNombres\" class=\"col-sm-3 control-label\">Nombres</label>\r\n");
      out.write("            <div class=\"col-sm-5\">\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"inputNombres\" placeholder=\"Nombres\" name=\"txtNombres\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"inputApellidoPaterno\" class=\"col-sm-3 control-label\">Apellido Paterno</label>\r\n");
      out.write("            <div class=\"col-sm-5\">\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"inputApellidoPaterno\" placeholder=\"Apellido Paterno\" name=\"txtApellidoPaterno\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"inputApellidoMaterno\" class=\"col-sm-3 control-label\">Apellido Materno</label>\r\n");
      out.write("            <div class=\"col-sm-5\">\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"inputApellidoMaterno\" placeholder=\"Apellido Materno\" name=\"txtApellidoMaterno\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"inputfechaNacimiento\" class=\"col-sm-3 control-label\">Fecha Nacimiento</label>\r\n");
      out.write("            <div class=\"col-sm-5\">\r\n");
      out.write("              <input type=\"date\" class=\"form-control\" id=\"inputfechaNacimiento\" name=\"txtFecha\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"inputDNI\" class=\"col-sm-3 control-label\">DNI</label>\r\n");
      out.write("            <div class=\"col-sm-5\">\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"inputDNI\" placeholder=\"DNI\" name=\"txtDNI\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"inputCorreo\" class=\"col-sm-3 control-label\">Correo</label>\r\n");
      out.write("            <div class=\"col-sm-5\">\r\n");
      out.write("              <input type=\"email\" class=\"form-control\" id=\"inputCorreo\" placeholder=\"Correo\" name=\"txtCorreo\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"inputDireccion\" class=\"col-sm-3 control-label\">Dirección</label>\r\n");
      out.write("            <div class=\"col-sm-5\">\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"inputDireccion\" placeholder=\"Dirección\" name=\"txtDireccion\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"selectDistrito\" class=\"col-sm-3 control-label\">Distrito</label>\r\n");
      out.write("            <div class=\"col-sm-5\">\r\n");
      out.write("              <select name=\"selectDistrito\" id=\"selectDistrito\" class=\"form-control\">\r\n");
      out.write("                ");
      if (_jspx_meth_ct_005fcboDinamico_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </select>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"selectSexo\" class=\"col-sm-3 control-label\">Sexo</label>\r\n");
      out.write("            <div class=\"col-sm-5\">\r\n");
      out.write("              <select name=\"selectSexo\" id=\"selectSexo\" class=\"form-control\">\r\n");
      out.write("                ");
      if (_jspx_meth_ct_005fcboDinamico_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </select>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"inputTelefono\" class=\"col-sm-3 control-label\">Teléfono</label>\r\n");
      out.write("            <div class=\"col-sm-5\">\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"inputTelefono\" placeholder=\"Teléfono\" name=\"txtTelefono\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"inputLogin\" class=\"col-sm-3 control-label\">Login</label>\r\n");
      out.write("            <div class=\"col-sm-5\">\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"inputLogin\" placeholder=\"Login\" name=\"txtLogin\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"inputPassword\" class=\"col-sm-3 control-label\">Password</label>\r\n");
      out.write("            <div class=\"col-sm-5\">\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"inputPassword\" placeholder=\"Password\" name=\"txtPassword\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <div class=\"col-sm-offset-3 col-sm-5\">\r\n");
      out.write("              <button type=\"submit\" class=\"btn btn-default btn-lg btn-block btn-primary\">Registrar</button>\r\n");
      out.write("              <button type=\"reset\" class=\"btn btn-default btn-lg btn-block btn-default\">Limpiar</button>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Fin Formulario de Registro -->\r\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("    <script src=\"js/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_ct_005fcboDinamico_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ct:cboDinamico
    etiquetas.ComboDinamico _jspx_th_ct_005fcboDinamico_005f0 = (etiquetas.ComboDinamico) _005fjspx_005ftagPool_005fct_005fcboDinamico_0026_005fsql_005fnombre_005fnobody.get(etiquetas.ComboDinamico.class);
    _jspx_th_ct_005fcboDinamico_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ct_005fcboDinamico_005f0.setParent(null);
    // /a-administradores-nuevo.jsp(81,16) name = sql type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ct_005fcboDinamico_005f0.setSql("SQL_DISTRITO");
    // /a-administradores-nuevo.jsp(81,16) name = nombre type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ct_005fcboDinamico_005f0.setNombre("cboDistrito");
    int _jspx_eval_ct_005fcboDinamico_005f0 = _jspx_th_ct_005fcboDinamico_005f0.doStartTag();
    if (_jspx_th_ct_005fcboDinamico_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fct_005fcboDinamico_0026_005fsql_005fnombre_005fnobody.reuse(_jspx_th_ct_005fcboDinamico_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fct_005fcboDinamico_0026_005fsql_005fnombre_005fnobody.reuse(_jspx_th_ct_005fcboDinamico_005f0);
    return false;
  }

  private boolean _jspx_meth_ct_005fcboDinamico_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ct:cboDinamico
    etiquetas.ComboDinamico _jspx_th_ct_005fcboDinamico_005f1 = (etiquetas.ComboDinamico) _005fjspx_005ftagPool_005fct_005fcboDinamico_0026_005fsql_005fnombre_005fnobody.get(etiquetas.ComboDinamico.class);
    _jspx_th_ct_005fcboDinamico_005f1.setPageContext(_jspx_page_context);
    _jspx_th_ct_005fcboDinamico_005f1.setParent(null);
    // /a-administradores-nuevo.jsp(89,16) name = sql type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ct_005fcboDinamico_005f1.setSql("SQL_SEXO");
    // /a-administradores-nuevo.jsp(89,16) name = nombre type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ct_005fcboDinamico_005f1.setNombre("cboSexo");
    int _jspx_eval_ct_005fcboDinamico_005f1 = _jspx_th_ct_005fcboDinamico_005f1.doStartTag();
    if (_jspx_th_ct_005fcboDinamico_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fct_005fcboDinamico_0026_005fsql_005fnombre_005fnobody.reuse(_jspx_th_ct_005fcboDinamico_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fct_005fcboDinamico_0026_005fsql_005fnombre_005fnobody.reuse(_jspx_th_ct_005fcboDinamico_005f1);
    return false;
  }
}
