<?php    include("header.php"); ?>


        
<?php 
  require("modelo/paginacion.php");

?>
<input type='submit' name='cr' id='cr' value='Insertar' onclick="location='vista/crearTarea.php'">

  <table width="50%" border="0" align="center">
    <tr>
      <td class="primera_fila">ID</td>
      <td class="primera_fila">Nombre</td>
      <td class="primera_fila">Telefono</td>
      <td class="primera_fila">Descripcion</td>
      <td class="primera_fila">Correo</td>
      <td class="primera_fila">Direccion</td>
      <td class="primera_fila">Poblacion</td>
      <td class="primera_fila">CP</td>
      <td class="primera_fila">Provincia</td>
      <td class="primera_fila">Estado</td>
      <td class="primera_fila">Fecha Creacion</td>
      <td class="primera_fila">Operario</td>
      <td class="primera_fila">Fecha Realizado</td>
      <td class="primera_fila">Anotacion Anterior</td>
      <td class="primera_fila">Anotacion Posterior </td>
      <td class="primera_fila">Fichero </td>
      <td class="sin">&nbsp;</td>
      <td class="sin">&nbsp;</td>

    </tr>

    <?php 
    foreach ($matrizTareas as $persona):?>

   	<tr>
      <td><?php echo $persona["id"] ?></td>
      <td><?php echo $persona["nombre"] ?></td>
      <td><?php echo $persona["telefono"] ?></td>
      <td><?php echo $persona["descripcion"] ?></td>
      <td><?php echo $persona["correo"] ?></td>
      <td><?php echo $persona["direccion"] ?></td>
      <td><?php echo $persona["poblacion"] ?></td>
      <td><?php echo $persona["cp"] ?></td>
      <td><?php echo $persona["provincia"] ?></td>
      <td><?php echo $persona["estado"] ?></td>
      <td><?php echo $persona["fechaC"] ?></td>
      <td><?php echo $persona["operario"] ?></td>
      <td><?php echo $persona["fechaR"] ?></td>
      <td><?php echo $persona["anotacionAnt"] ?></td>
      <td><?php echo $persona["anotacionPos"] ?></td>
      <td><?php echo $persona["fichero"] ?></td>
 
      <td class="bot"><a href="modelo/borrarTareas.php?id=<?php echo $persona["id"] ?>"><input type='button' name='del' id='del' value='Borrar'></a></td>
      <td class='bot'><a href="modelo/editarTareas.php?id=<?php echo $persona["id"] ?> 
      & nom=<?php echo $persona["nombre"] ?>
      & tlf=<?php echo $persona["telefono"] ?>
      & des=<?php echo $persona["descripcion"] ?>
      & correo=<?php echo $persona["correo"] ?>
      & direc=<?php echo $persona["direccion"] ?>
      & poblacion=<?php echo $persona["poblacion"] ?>
      & cp=<?php echo $persona["cp"] ?>
      & provincia=<?php echo $persona["provincia"] ?>
      & estado=<?php echo $persona["estado"] ?>
      & fechaC=<?php echo $persona["fechaC"] ?>
      & operario=<?php echo $persona["operario"] ?>
      & fechaR=<?php echo $persona["fechaR"] ?>
      & anotaAnt=<?php echo $persona["anotacionAnt"] ?>
      & anotaPos=<?php echo $persona["anotacionPos"] ?>
      & fichero=<?php echo $persona["fichero"] ?>"><input type='button' name='up' id='up' value='Actualizar'></a>
      </td>
    </tr>

    <?php
    endforeach;


    ?>
    
    </table>
    
      
    <!-- -----------------------------------------PAGINACION------------------------------------------- -->
    <?php 

    for ($i=1; $i<=$totalPaginas ; $i++) { 
       echo "<a href='?pagina=". $i ."' >" .$i. "</a> ";
     }  
    ?>
    

  <?php include("footer.php"); ?>
    
