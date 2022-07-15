<template>
  <div class="">
    <router-link id="botonAgregar" to="/crear" class="btn btn-info">Agregar nueva Receta</router-link>
    <br><br>
    <div class="card">
      <div class="card-header" id="medio">
        <strong>Recetas</strong>
      </div>
      <div class="card-body">

        <table class="table">
          <thead>
            <tr>
              <th>ID</th>
              <th>Titulo</th>
              <th>Categoria</th>
              <th>Descripcion</th>
              <th>Ingredientes</th>
              <th>Instrucciones</th>
              <th>Foto</th>
              <th>Acciones</th>
            </tr>
          </thead>
          <tbody>
            <tr v-for="receta in recetas" :key="receta.id">
              <td>{{receta.id}}</td>
              <td>{{receta.titulo}}</td>
              <td>{{receta.categoria}}</td>
              <td>{{receta.descripcion}}</td>
              <td>{{receta.ingredientes}}</td>
              <td>{{receta.instrucciones}}</td>
              <td>
               
                <img v-bind:src="'fotos/' + receta.foto" width="200"/> 
              </td>
              <td>
                <div class="btn btn-group" role="group" aria-label="">
                  
                  <router-link :to="{name:'Editar',params:{id:receta.id}}" class="btn btn-info">Editar</router-link>
                  <button type="button" class="btn btn-danger" v-on:click="borrarReceta(receta.id)">Borrar</button>

                </div>
              </td>
            </tr>
          </tbody>
        </table>

      </div>
    </div>
   
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  data(){
      return{
        recetas:[]
      }
  },

  created:function(){
    this.consultarRecetas(); //consultarEmpleados
  },

  methods:{
    
      consultarRecetas(){
        fetch('http://localhost/recetas/')
        .then(respuesta=>respuesta.json())
        .then((datosRespuesta)=>{

          console.log(datosRespuesta)
          this.recetas=[]
          if(typeof datosRespuesta[0].success==='undefined'){

                    this.recetas=datosRespuesta;
                }

        })
        .catch(console.log)

      },
      borrarReceta(id){

        console.log(id);

        fetch('http://localhost/recetas/?borrar='+id)
        .then(respuesta=>respuesta.json())
        .then((datosRespuesta)=>{

          console.log(datosRespuesta)
          window.location.href="gestion"

        })
        .catch(console.log)
      }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
#medio{
  text-align: center;
  
}
</style>
