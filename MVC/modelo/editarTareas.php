<?php 

require_once("conexion.php");
$base=Conectar::conexion();

if (!isset($_POST["actualizar"])) {

    $id=$_GET["id"];
    $nom=$_GET["nom"];
    $tlf=$_GET["tlf"];
    $des=$_GET["des"];
    $correo=$_GET["correo"];
    $direc=$_GET["direc"];
    $poblacion=$_GET["poblacion"];
    $cp=$_GET["cp"];
    $provincia=$_GET["provincia"];
    $estado=$_GET["estado"];
    $fechaC=$_GET["fechaC"];
    $operario=$_GET["operario"];
    $fechaR=$_GET["fechaR"];
    $anotacionAnt=$_GET["anotaAnt"];
    $anotacionPos=$_GET["anotaPos"];
    $fichero=$_GET["fichero"];

}else{

        $id=$_POST["id"];
        $nom=$_POST["nombre"];
        $tlf=$_POST["tlf"];
        $des=$_POST["descripcion"];
        $correo=$_POST["email"];
        $direc=$_POST["direccion"];
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

        $sql = "UPDATE tareas SET nombre=:miNon, telefono=:miTlf, descripcion=:miDes, correo=:miCorreo, direccion=:miDirec,
        poblacion=:miPoblacion, cp=:miCp, provincia=:miProvincia, estado=:miEstado, fechaC=:miFechaC, operario=:miOperario,
        fechaR=:miFechaR, anotacionAnt=:mianotaAnt, anotacionPos=:mianotaPos, fichero=:miFichero WHERE id=:miId ";
    
        $resulset=$base->prepare($sql);
        $resulset->execute(array(":miId"=>$id, ":miNon"=>$nom, ":miTlf"=>$tlf, ":miDes"=>$des, ":miCorreo"=>$correo,
        ":miDirec"=>$direc, ":miPoblacion"=>$poblacion, ":miCp"=>$cp, ":miProvincia"=>$provincia, ":miEstado"=>$estado,
        ":miFechaC"=>$fechaC, ":miOperario"=>$operario, ":miFechaR"=>$fechaR, ":mianotaAnt"=>$anotacionAnt,
        ":mianotaPos"=>$anotacionPos, ":miFichero"=>$fichero));

        header("Location:../index.php");
        
}
?>

<?php include("../vista/actualizarTarea.php"); ?>


