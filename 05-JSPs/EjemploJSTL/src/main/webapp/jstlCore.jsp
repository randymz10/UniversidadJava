<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Core</title>
    </head>
    <body>
        <h1>JSTL Core</h1>
        <!--Manipulacion de variables-->
        <!--Defiimos la variable-->
        <c:set var="nombre" value="Ernesto"/>
        <!--Desplegamos el valor de la variable-->
        Variable nombre: <c:out value="${nombre}"/>
        <br><br>
        Variable con codigo HTML:
        <c:out value="<h4>Hola</h4>" escapeXml="false"/>
        <br><br>
        <!--Codigo condicionado, uso de if-->
        <c:set var="bandera" value="true" />

        <c:if test="${bandera}" >
            La bandera es verdadera
        </c:if>
        <br>
        <!--Codigo condicionado, uso de switch-->
        <c:if test="${param.opcion != null}">
            <c:choose>
                <c:when test="${param.opcion == 1}">
                    <br>
                    Opcion 1 seleccionada
                </c:when>
                <c:when test="${param.opcion == 2}">
                    <br>
                    Opcion 2 seleccionada
                </c:when>
                <c:otherwise>
                    Opcion proporcionada desconocida: ${param.opcion}
                </c:otherwise>
            </c:choose>
        </c:if>
        <!--iteracion de un arreglo-->
        <%
            String nombres[] = {"claudia", "Pedro", "Juan"};
            request.setAttribute("nombres", nombres);
        %>
        <br>
        Lista de nombres:
        <br>
        <ul>
            <c:forEach var="persona" items="${nombres}">
                <li>Nombre: ${persona}</li>
            </c:forEach>
        </ul>
        <br><br>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
