<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que lee los valores del JavaBean</title>
    </head>
    <body>
        <h1>JSP que lee los valores del JavaBean</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session" />
        <br><br>
        Valor base: <jsp:getProperty name="rectangulo" property="base" />
        <br><br>
        Valor Altura <jsp:getProperty name="rectangulo" property="altura" />
        <br><br>
        Valor Area: <jsp:getProperty name="rectangulo" property="area" />
        <br><br>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
