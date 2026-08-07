<%@ page contentType="text/html;charset=UTF-8" %>

<style>
    .form-row {
        display: grid;
        grid-template-columns: 100px 200px;
        gap: 10px;
        margin-bottom: 10px;
        align-items: center;
    }
</style>

<html>
    <head>
        <title>Proyecto Integrador</title>
    </head>
    
    <body>
        <h1>Base de datos de Médica de la Ciudad</h1>
            <form action="datos" method="post">
                <div class="form-row">
                    <label for="usuario">Usuario:</label>
                    <input type="text" id="usuario" name="usuario">
                </div>
                <div class="form-row">
                    <label for="contrasena">Contraseña:</label>
                    <input type="password" id="contrasena" name="contrasena">
                </div>
                <br>
                <br>
                <button type="submit">Ingresar</button>
            </form>
    </body>
</html>