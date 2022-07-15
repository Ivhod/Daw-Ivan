<link rel="stylesheet" href="../hoja.css">
<h1 align="center">Nueva Tarea</h1>
<form action="../modelo/insertarTareas.php" method="post" enctype="multipart/form-data" class="introducirTarea">
 
<b>Nombre y Apellido: </b><input type="text" name="nombre"><br>
<b>Telefono: </b><input type="text" name="tlf"><br>
<b>Descripcion: </b><input type="text" name="descripcion"><br>
<b>Correo Electronico: </b><input type="email" name="email"><br>
<b>Direccion: </b><input type="text" name="direccion"><br>
<b>Poblacion: </b><input type="text" name="poblacion"><br>
<b>Codigo Postal: </b><input type="text" name="cp"><br>
<b>Provincia: </b>
<select name="provincia">
<option value="Huelva">Huelva</option>
<option value="Sevilla">Sevilla</option>
</select><br>
<b>Estado: </b>
<input type="radio" name="estado" value="pendiente">Pendiente</input>
<input type="radio" name="estado" value="realizada">Realizada</input>
<input type="radio" name="estado" value="cancelada">Cancelada</input>
<br>
<b>Fecha de Creacion: </b><input type="text" name="fechaCreacion" placeholder="0000-00-00"><br>
<b>Operario: </b><input type="text" name="operario"><br>
<b>Fecha de realizacion: </b><input type="text" name="fechaRealizacion" placeholder="0000-00-00"><br>
<b>Anotaciones Posteriores: </b><input type="text" name="anotaPos"><br>
<b>Anotaciones Anteriores: </b><input type="text" name="anotaAnt"><br>
<b>Fichero: </b><input type="text" name="fichero"><br>
<br>

<input type="submit" name="submit" value="Enviar">


<input type="button" value="Regresar a inicio" onclick="location='../index.php'" />
</form>
