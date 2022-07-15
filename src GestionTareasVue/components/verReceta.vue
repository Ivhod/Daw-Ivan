<template>
<div class="container">
  <div class="columns">
    <h2 align="center">Detalle de la receta</h2>
    <div class="column" style="padding: 0; margin: 0">
    <p class="is-size-6" id="titulo">{{receta.titulo}}</p>
    <p class="is-size-6" id="categoria">{{receta.categoria}}</p>
      <div class="columns">
        <div class="column is-one-third">
          <p class="title is-size-2">
            <img v-bind:src="'/fotos/' + receta.foto" width="600">
            </p>
        </div>
        <div class="column">
          <div class="media">
            <div class="media-content">
              <p class="title is-size-2"></p>
            </div>
          </div>
          <div class="content is-medium"></div>
          <p class="is-size-6">{{receta.descripcion}}</p>
        </div>
      </div>

      <div class="content">
        <div class="columns">
          <div class="column">
            <h2 class="has-text-centered is-2">Ingredientes</h2>
            <p class="title is-size-2">{{receta.ingredientes}}</p>
          </div>
          <div class="column">
            <h2 class="has-text-centered is-2">Preparación</h2>
            <p class="title is-size-2">{{receta.instrucciones}}</p>
          </div>
        </div>
        <div class="columns">
        </div>
      </div>
    </div>
    </div>
    <br>
    <router-link :to="{ name: 'home' }" class="btn btn-primary"
      >Inicio</router-link
    >
  </div>
</template>

<script>
export default {
  name: "HelloWorld",
  props: {
    msg: String,
  },

  data() {
    return {
      receta:{},
    };
  },

  created: function () {
    this.obtenerInformacionID();
  },

  methods: {
    obtenerInformacionID() {
      fetch("http://localhost/recetas/?consultar=" + this.$route.params.id)
        .then((respuesta) => respuesta.json())
        .then((datosRespuesta) => {
          console.log(datosRespuesta);
          this.receta = datosRespuesta[0];
        })
        .catch(console.log);
    },
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
#titulo{ 
font-family: Comic Sans MS; 
font-weight:bold; 
font-size: 30px; 
color: #ff8800;
}
#categoria{

font-family: Comic Sans MS; 
font-weight:bold;
font-size: 20px;
color: #df6400;
}  
</style>
