<?php 
    require_once("modelo/tareasModelo.php");

    $tarea=new TareasModelo(); // = new Personas_modelo

    $matrizTareas=$tarea->get_tareas();// = get_personas



    require_once("vista/tareasView.php");


?>