<link rel="stylesheet" href="../hoja.css">
<h1 align="center">Actualizar Tarea</h1>
<form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post" class="introducirTarea">
<input type="hidden" name="id" value="<?php echo $id ?>"><br>
<b>Nombre y Apellido: </b><input type="text" name="nombre" value="<?php echo $nom ?>"><br>
<b>Telefono: </b><input type="text" name="tlf" value="<?php echo $tlf ?>"><br>
<b>Descripcion: </b><input type="text" name="descripcion" value="<?php echo $des ?>"><br>
<b>Correo Electronico: </b><input type="email" name="email" value="<?php echo $correo ?>"><br>
<b>Direccion: </b><input type="text" name="direccion" value="<?php echo $direc ?>"><br>
<b>Poblacion: </b><input type="text" name="poblacion" value="<?php echo $poblacion ?>"><br>
<b>Codigo Postal: </b><input type="text" name="cp"value="<?php echo $cp ?>"><br>
<b>Provincia: </b>
<select name="provincia" >
<option value="Huelva">Huelva</option>
<option value="Sevilla">Sevilla</option>
<option value="Cordoba">Cordoba</option>
<option value="Jaen">Jaen</option>
<option value="Almeria">Almeria</option>
<option value="Malaga">Malaga</option>
<option value="Cadiz">Cadiz</option>
</select><br>
<b>Estado: </b>
<input type="radio" name="estado" value="pendiente">Pendiente</input>
<input type="radio" name="estado" value="realizada">Realizada</input>
<input type="radio" name="estado" value="cancelada">Cancelada</input>
<br>
<b>Fecha de Creacion: </b><input type="text" name="fechaCreacion"value="<?php echo $fechaC ?>"><br>
<b>Operario: </b><input type="text" name="operario" value="<?php echo $operario ?>"><br>
<b>Fecha de realizacion: </b><input type="text" name="fechaRealizacion" value="<?php echo $fechaR ?>"><br>
<b>Anotaciones Anteriores: </b><input type="text" name="anotaAnt" value="<?php echo $anotacionAnt ?>"><br>
<b>Anotaciones Posteriores: </b><input type="text" name="anotaPos" value="<?php echo $anotacionPos ?>"><br>
<b>Fichero: </b><input type="text" name="fichero" value="<?php echo $fichero ?>"><br>
<br>

<input type="submit" name="actualizar" value="Actualizar">
<input type="button" name="cancelar" value="Cancelar" onclick="location='../index.php'">
</form>