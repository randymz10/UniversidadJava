<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL y variables implicitas</title>
    </head>
    <body>
        <h1>EL y variables implicitas</h1>
        <ul>
            <li>Nombre de la apicacion: ${pageContext.request.contextPath}</li>
            <li>Navegador del cliente: ${header["User-Agent"]}</li>
            <li>ID de la sesion: ${cookie.JSESSIONID.value}</li>
            <li>Web Server: ${pageContext.servletContext.serverInfo}</li>
            <li>Valor parametro: ${param.usuario}</li>
            <br><br>
            <a href="index.jsp">Volver al inicio</a>
        </ul>
    </body>
</html>
