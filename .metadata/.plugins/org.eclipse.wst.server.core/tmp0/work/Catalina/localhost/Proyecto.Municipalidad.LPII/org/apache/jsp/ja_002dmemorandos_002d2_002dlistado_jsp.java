package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ja_002dmemorandos_002d2_002dlistado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/ja-menu.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("    <title>Memorandos - Reparación Vehicular</title>\r\n");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "ja-sesion.jsp", out, false);
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
      out.write("            <a class=\"navbar-brand\" href=\"ja-escritorio.jsp\">Escritorio</a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\r\n");
      out.write("            <ul class=\"nav navbar-nav\">\r\n");
      out.write("              <li class=\"dropdown\">\r\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                  MEMORANDOS<b class=\"caret\"></b>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"dropdown-menu\">\r\n");
      out.write("                  <li><a href=\"ja-memorandos-1-listado.jsp\">Requerimiento Vehicular</a></li>\r\n");
      out.write("                  <li><a href=\"ja-memorandos-2-listado.jsp\">Reparación Vehicular</a></li>\r\n");
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
      out.write("        <h1 class=\"text-left\">Memorandos de Reparación Vehicular <a href=\"ja-memorandos-2-nuevo.jsp\">\r\n");
      out.write("                <button class=\"btn btn-primary\">\r\n");
      out.write("                  <span class=\"glyphicon glyphicon-plus\"></span>\r\n");
      out.write("                  Agregar Nuevo\r\n");
      out.write("                </button>\r\n");
      out.write("        </a></h1>\r\n");
      out.write("        <p>En la siguiente lista se muestran los Memorandos de Reparación Vehicular registrados en el Sistema.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Fin cabezera-->\r\n");
      out.write("    <!-- Inicio Tabla Lista -->\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <table class=\"table table-bordered table-hover\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th>ID</th>\r\n");
      out.write("            <th>Remitente</th>\r\n");
      out.write("            <th>Destinatario</th>\r\n");
      out.write("            <th>Fecha</th>\r\n");
      out.write("            <th>Asunto</th>\r\n");
      out.write("            <th>Operación</th>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>1</td>\r\n");
      out.write("            <td>Carlos Manrique</td>\r\n");
      out.write("            <td>Pedro Zambrano</td>\r\n");
      out.write("            <td>15-09-2015</td>\r\n");
      out.write("            <td>Mantenimiento de Vehículos</td>\r\n");
      out.write("            <td>\r\n");
      out.write("              <a href=\"#\">\r\n");
      out.write("                <button class=\"btn btn-primary\">\r\n");
      out.write("                  <span class=\"glyphicon glyphicon-new-window\"></span>\r\n");
      out.write("                  Ver\r\n");
      out.write("                </button>\r\n");
      out.write("              </a>\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>1</td>\r\n");
      out.write("            <td>Carlos Manrique</td>\r\n");
      out.write("            <td>Pedro Zambrano</td>\r\n");
      out.write("            <td>15-09-2015</td>\r\n");
      out.write("            <td>Mantenimiento de Vehículos</td>\r\n");
      out.write("            <td>\r\n");
      out.write("              <a href=\"#\">\r\n");
      out.write("                <button class=\"btn btn-primary\">\r\n");
      out.write("                  <span class=\"glyphicon glyphicon-new-window\"></span>\r\n");
      out.write("                  Ver\r\n");
      out.write("                </button>\r\n");
      out.write("              </a>\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>1</td>\r\n");
      out.write("            <td>Carlos Manrique</td>\r\n");
      out.write("            <td>Pedro Zambrano</td>\r\n");
      out.write("            <td>15-09-2015</td>\r\n");
      out.write("            <td>Mantenimiento de Vehículos</td>\r\n");
      out.write("            <td>\r\n");
      out.write("              <a href=\"#\">\r\n");
      out.write("                <button class=\"btn btn-primary\">\r\n");
      out.write("                  <span class=\"glyphicon glyphicon-new-window\"></span>\r\n");
      out.write("                  Ver\r\n");
      out.write("                </button>\r\n");
      out.write("              </a>\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>1</td>\r\n");
      out.write("            <td>Carlos Manrique</td>\r\n");
      out.write("            <td>Pedro Zambrano</td>\r\n");
      out.write("            <td>15-09-2015</td>\r\n");
      out.write("            <td>Mantenimiento de Vehículos</td>\r\n");
      out.write("            <td>\r\n");
      out.write("              <a href=\"#\">\r\n");
      out.write("                <button class=\"btn btn-primary\">\r\n");
      out.write("                  <span class=\"glyphicon glyphicon-new-window\"></span>\r\n");
      out.write("                  Ver\r\n");
      out.write("                </button>\r\n");
      out.write("              </a>\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>1</td>\r\n");
      out.write("            <td>Carlos Manrique</td>\r\n");
      out.write("            <td>Pedro Zambrano</td>\r\n");
      out.write("            <td>15-09-2015</td>\r\n");
      out.write("            <td>Mantenimiento de Vehículos</td>\r\n");
      out.write("            <td>\r\n");
      out.write("              <a href=\"#\">\r\n");
      out.write("                <button class=\"btn btn-primary\">\r\n");
      out.write("                  <span class=\"glyphicon glyphicon-new-window\"></span>\r\n");
      out.write("                  Ver\r\n");
      out.write("                </button>\r\n");
      out.write("              </a>\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Fin Tabla Lista  -->\r\n");
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
}
