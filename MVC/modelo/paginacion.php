<?php
  require_once("conexion.php");

  $base=Conectar::conexion();
  
    $paginasTa=4; //Tamaño pagina

    if(isset($_GET["pagina"])) {
    
      if($_GET["pagina"]==1) {
    
        header("Location:index.php");
    
      }else{
        $pagina=$_GET["pagina"];
      }
    
    }else {
      $pagina=1;
    }
    
    $empezarPagina=($pagina-1)*$paginasTa;
    
    $sqlTotal="SELECT * FROM tareas";
    
    $resultado=$base->prepare($sqlTotal);
    
    $resultado->execute(array());
    
    $numFilas=$resultado->rowCount();
    
    $totalPaginas=ceil($numFilas/$paginasTa);

?>