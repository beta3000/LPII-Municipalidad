<% 
	if(session.getAttribute("USUARIO")==null){//no se inicio sesion
		request.setAttribute("msj", "Debe iniciar Sesi�n");
		pageContext.forward("login.jsp");
	}
%>