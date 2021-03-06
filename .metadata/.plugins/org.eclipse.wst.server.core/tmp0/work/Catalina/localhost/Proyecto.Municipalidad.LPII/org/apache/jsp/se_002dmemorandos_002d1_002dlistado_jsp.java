package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class se_002dmemorandos_002d1_002dlistado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/se-menu.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fjstlc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fjstlc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fjstlc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("     \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("    <title>Memorandos - Requerimiento Vehicular</title>\r\n");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "se-sesion.jsp", out, false);
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
      out.write("            <a class=\"navbar-brand\" href=\"se-escritorio.jsp\">Escritorio</a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\r\n");
      out.write("            <ul class=\"nav navbar-nav\">\r\n");
      out.write("              <li class=\"dropdown\">\r\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                  MEMORANDOS<b class=\"caret\"></b>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"dropdown-menu\">\r\n");
      out.write("                  <li><a href=\"MantenimientoMemorando?tipo=listarMemorandoRequerimientoVehicularSecretaria\">Requerimiento Vehicular</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </li> \r\n");
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
      out.write("        <h1 class=\"text-left\">Memorandos de Requerimento Vehicular</h1>\r\n");
      out.write("        <p>En la siguiente lista se muestran los Memorandos de Requerimento Vehicular registrados en el Sistema.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Fin cabezera-->\r\n");
      out.write("    <!-- Inicio Tabla Lista -->\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("\t      <table class=\"table table-bordered table-hover\">\r\n");
      out.write("\t          <tr>\r\n");
      out.write("\t            <th>ID</th>\r\n");
      out.write("\t            <th>Fecha</th>\r\n");
      out.write("\t            <th>Asunto</th>\r\n");
      out.write("\t            <th>Contenido</th>\r\n");
      out.write("\t            <th>Estado</th>\r\n");
      out.write("\t            <th>Operación</th>\r\n");
      out.write("\t          </tr>\r\n");
      out.write("\t          ");
      if (_jspx_meth_jstlc_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t        </table>\r\n");
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

  private boolean _jspx_meth_jstlc_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jstlc:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_jstlc_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fjstlc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_jstlc_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_jstlc_005fforEach_005f0.setParent(null);
    // /se-memorandos-1-listado.jsp(43,11) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_jstlc_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.listaMemorandoRequerimientoVehicularSecretaria }", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /se-memorandos-1-listado.jsp(43,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_jstlc_005fforEach_005f0.setVar("l");
    int[] _jspx_push_body_count_jstlc_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_jstlc_005fforEach_005f0 = _jspx_th_jstlc_005fforEach_005f0.doStartTag();
      if (_jspx_eval_jstlc_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t          \t<tr>\r\n");
          out.write("\t          \t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.idMemorando}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t          \t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.fechaMemorando}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t          \t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.descripcionAsuntoMemorando}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.contenidoMemorando}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.descripcionEstadoMemorando}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t        <td>\r\n");
          out.write("\t\t              <a href=\"MantenimientoMemorando?tipo=cargarDatosMemorandoSecretaria&idMemorando=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.idMemorando}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t                <button class=\"btn btn-primary\">\r\n");
          out.write("\t\t                  <span class=\"glyphicon glyphicon-new-window\"></span>\r\n");
          out.write("\t\t                  Revisar\r\n");
          out.write("\t\t                </button>\r\n");
          out.write("\t\t              </a>\r\n");
          out.write("\t\t\t\t      <a href=\"MantenimientoMemorando?tipo=aprobarMemorandoSecretaria&idMemorando=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.idMemorando}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t                <button class=\"btn btn-success\">\r\n");
          out.write("\t\t                  <span class=\"glyphicon glyphicon-ok\"></span>\r\n");
          out.write("\t\t                  Aprobar\r\n");
          out.write("\t\t                </button>\r\n");
          out.write("\t\t              </a>\r\n");
          out.write("\t\t              <a href=\"MantenimientoMemorando?tipo=desaprobarMemorandoSecretaria&idMemorando=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.idMemorando}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t                <button class=\"btn btn-danger\">\r\n");
          out.write("\t\t                  <span class=\"glyphicon glyphicon-remove\"></span>\r\n");
          out.write("\t\t                  Desaprobar\r\n");
          out.write("\t\t                </button>\r\n");
          out.write("\t\t              </a>\r\n");
          out.write("\t\t            </td>\r\n");
          out.write("\t          \t</tr>\r\n");
          out.write("\t          ");
          int evalDoAfterBody = _jspx_th_jstlc_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_jstlc_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_jstlc_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_jstlc_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_jstlc_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fjstlc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_jstlc_005fforEach_005f0);
    }
    return false;
  }
}
