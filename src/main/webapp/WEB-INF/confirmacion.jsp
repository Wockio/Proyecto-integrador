<%@ page contentType="text/html;charset=UTF-8" %>

<html>  
    <body>
        <br>
        <p>Los datos del paciente fueron ingresados exitosamente<p>
        <br>
        <form action="${pageContext.request.contextPath}/datos" method="get">
            <button type="submit">Ingresar otro paciente</button>
        </form>
</html>