<?php 

require_once("conexion.php");
$base=Conectar::conexion();

$id=$_GET["id"];
$base->query("DELETE FROM tareas WHERE id='$id'");

header("Location:../index.php");





?>