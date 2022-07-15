<?php 

    class TareasModelo {
        private $db;

        private $tareas; // = $personas

        public function __construct(){

            require_once("modelo/conexion.php");

            $this->db=Conectar::conexion(); //Almacenamos conexion

            $this->tareas=array();
        }

        public function get_tareas(){ // = $get_personas
            require("paginacion.php");

            $consulta=$this->db->query("SELECT * FROM tareas LIMIT $empezarPagina, $paginasTa"); //Todas la tareas
            
            while ($filas=$consulta->fetch(PDO::FETCH_ASSOC)) { //Leer array que esta asociado
                $this->tareas[]=$filas;
            }
            return $this->tareas; // = $this->personas

        }

    }



?>