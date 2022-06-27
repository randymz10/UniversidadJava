<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--Botstrap-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <!--Font Awesome-->
        <script src="https://kit.fontawesome.com/f5a2001aa5.js" crossorigin="anonymous"></script>
        <title>Control de clientes</title>
    </head>
    <body>
        <!--Cabecero-->
        <jsp:include page="/WEB-INF/paginas/comunes/cabecero.jsp"/>

        <!--Botones de navegacion-->
        <jsp:include page="/WEB-INF/paginas/comunes/botonesNavegacion.jsp"/>

        <!--Listado clientes -->
        <jsp:include page="/WEB-INF/paginas/cliente/listadoClientes.jsp"/>



        <!--Pie de pagina-->
        <jsp:include page="/WEB-INF/paginas/comunes/piePagina.jsp"/>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    </body>
</html>
