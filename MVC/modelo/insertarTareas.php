<?php 
require_once("conexion.php");

$base=Conectar::conexion();

$nombre=$_POST["nombre"];
$tlf=$_POST["tlf"];
$des=$_POST["descripcion"];
$email=$_POST["email"];
$direccion=$_POST["direccion"];
$poblacion=$_POST["poblacion"];
$cp=$_POST["cp"];
$provincia=$_POST["provincia"];
$estado=$_POST["estado"];
$fechaC=$_POST["fechaCreacion"];
$operario=$_POST["operario"];
$fechaR=$_POST["fechaRealizacion"];
$anotacionAnt=$_POST["anotaAnt"];
$anotacionPos=$_POST["anotaPos"];
$fichero=$_POST["fichero"];

$sql= "INSERT INTO tareas (nombre, telefono, descripcion, correo, direccion, poblacion, cp, provincia, estado, fechaC, operario, fechaR, anotacionAnt, anotacionPos, fichero)
VALUES ('$nombre',$tlf,'$des','$email','$direccion','$poblacion','$cp','$provincia','$estado','$fechaC','$operario','$fechaR','$anotacionAnt','$anotacionPos','$fichero')";

//echo "<pre>$sql</pre>";

$resul=$base->prepare($sql);
$resul->execute(array());


if ($resul==false) {
    echo "Error en la consulta";
 }else{
    echo "Registro Guardado. <a href='../index.php'>Continuar ....</a>";
    //header("Location:../index.php");
    
 }
 
//":n"=>$nombre,":tlf"=>$tlf,":descr"=>$des,":email"=>$email,"direc"=>$direccion,":pobla"=>$poblacion,":cp"=>$cp,":pro"=>$provincia,":es"=>$estado,
//":fechaC"=>$fechaC,":opera"=>$operario,":fechaR"=>$fechaR,":anotaAnt"=>$anotacionAnt,":anotaPos"=>$anotacionPos,":fiche"=>$fichero
?>

