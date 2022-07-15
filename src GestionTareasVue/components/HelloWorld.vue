<template>
<div class="container">
  <h2 id="medio">GESTOR DE RECETAS</h2>

  <div class="form-group">
    <select class="form-control" name="" id="" v-model="categoriaSeleccionada" v-on:change="filtrarCategoria">
      <option v-for="categoria in categorias" :key="categoria.categoria" v-bind:value="categoria.categoria">{{categoria.categoria}}</option>
    </select>

  </div>
  <div class="panel panel-default" v-for="receta in recetas" :key="receta.id" id="paneles">
    <div class="panel-heading" id="padre">

      <router-link :to="{name:'VerReceta',params:{id:receta.id}}" class="textoFoto">Ver</router-link>
      <img v-bind:src="'fotos/' + receta.foto" width="180"/> 
    
    </div>

    <div class="panel-body" id="titulo">
      
      {{receta.titulo}}

    </div>

    

    <!-- <div class="panel-footer">
      {{receta.descripcion}}
    </div> -->
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
        recetas:[],
        categorias:[],
        categoriaSeleccionada:""
      }
  },
  created:function(){
    this.consultarRecetas(); //consultarEmpleados
    this.consultarCategoria();
  },

  methods: {

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

  
  consultarCategoria(){
        fetch('http://localhost/recetas/?consultarCategoria=1')
        .then(respuesta=>respuesta.json())
        .then((datosRespuesta)=>{
          
          console.log(datosRespuesta)
          this.categorias=[]
          if(typeof datosRespuesta[0].success==='undefined'){

                    this.categorias=datosRespuesta;
                }

        })
        .catch(console.log)
  },
  filtrarCategoria(){
        fetch('http://localhost/recetas/?categoria='+this.categoriaSeleccionada)
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
}
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

#medio{
  text-align: center  
}
#paneles{
  float: left;
    margin-right: 1em;
    margin-bottom: 1em;
}
#titulo{
  text-align: center; 
font-family: Comic Sans MS; 
font-weight:bold; 
font-size: 15px; 
color: #ff8800; 
}
#padre{
  position: relative;
  display: inline-block;
}
.textoFoto{
  position: absolute;
  bottom: 0;
  right: 1rem;
  font-size: 80px;
  opacity: 0;
}


</style>
