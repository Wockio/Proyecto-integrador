El Proyecto integrador se desarrolló para el hospital Médica de la Ciudad en Culiacán, Sinaloa para proveer un servicio de almacenamiento y manejo de bases de datos a través de una webapp en Maven con vínculo a MySQL. Su ejecución permite al usuario ingresar con sus datos de nombre de usuario y contraseña, para posteriormente almacenar los datos de un paciente con los siguienetes campos: Nombre, Apellido, Sexo, Edad, Padecimiento y Contacto (número telefónico). Una vez ingresados los datos, estos son almacenados en una base de datos de MySQL. El usuario tendrá la opción de seguir ingresando datos de pacientes uno por uno.

El hospital Médica de la Ciudad solía manejar una hoja de Excel para llevar registro de sus pacientes, lo cual se considera obsoleto y arriesgado comparado a soluciones más modernas. La webapp desarrollada busca proveer una alternativa más segura y confiable.

Su desarrollo se llevo a cabo en NetBeans como un proyecto de Maven + Spring Framework 5 + GlassFish y JDBC para vincular a MySQL. El programa cuenta con clases Java que definen la estructura de los objetos, .jsp que despliegan la interfaz para el usuario, controllers que captan los datos ingresados en los .jsp por el usuario y/o redirigen a la siguiente .jsp indicada, y DAO que insertan los datos en tablas de MySQL.

Link a la sección wiki: https://github.com/Wockio/Proyecto-integrador/wiki
