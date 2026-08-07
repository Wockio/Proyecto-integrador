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
    <body>
        <form action="confirmacion" method="post">
            <br>
            <div class="form-row">
                <label for="nombre">Nombre:</label>
                <input type="text" id="nombre" name="nombre">
            </div>
            <div class="form-row">
                <label for="apellido">Apellido:</label>
                <input type="text" id="apellido" name="apellido">
            </div>
            <div class="form-row">
                <label for="sexo">Sexo:</label>
                <input type="text" id="sexo" name="sexo">
            </div>
            <div class="form-row">
                <label for="edad">Edad:</label>
                <input type="number" id="edad" name="edad">
            </div>
            <div class="form-row">
                <label for="padecimiento">Padecimiento:</label>
                <input type="text" id="padecimiento" name="padecimiento">
            </div>
            <div class="form-row">
                <label for="contacto">Contacto:</label>
                <input type="number" id="contacto" name="contacto">
            </div>
            <br>
            <br>
            <button type="submit">Ingresar datos</button>
        </form>
    </body>
</html>