<template>
  <div class="container">
    <div class="card">
        <div class="card-header">
            <strong>Agregar nueva Receta</strong>
        </div>
        <div class="card-body">
            <form v-on:submit.prevent="agregarRegistro">

                <div class="form-group">
                  <label for="titulo">Titulo:</label>
                  <input type="text" class="form-control" name="titulo" id="titulo" aria-describedby="helpId" placeholder="Titulo" v-model="receta.titulo">
                </div>
            
                <div class="form-group">
                  <label for="categoria">Categoria:</label>
                  <input type="text" class="form-control" name="categoria" id="categoria" aria-describedby="helpId" placeholder="Categoria" v-model="receta.categoria">
                </div>
            
                <div class="form-group">
                  <label for="descripcion">Descripcion:</label>
                  <input type="text" class="form-control" name="descripcion" id="descripcion" aria-describedby="helpId" placeholder="Descripcion" v-model="receta.descripcion">
                </div>
            
                <div class="form-group">
                  <label for="ingredientes">Ingredientes:</label>
                  <input type="text" class="form-control" name="ingredientes" id="ingredientes" aria-describedby="helpId" placeholder="Ingredientes" v-model="receta.ingredientes">
                </div>
            
                <div class="form-group">
                  <label for="instrucciones">Intrucciones:</label>
                  <input type="text" class="form-control" name="intrucciones" id="instrucciones" aria-describedby="helpId" placeholder="Intrucciones" v-model="receta.instrucciones">
                  
                </div>

                <div class="form-group">
                  <label for="foto">Foto:</label>
                  <input type="text" class="form-control" name="foto" id="foto" aria-describedby="helpId" placeholder="Foto" v-model="receta.foto">
 
                </div>
                <div class="btn-group" role="group" aria-label="">
                    <button type="submit" class="btn btn-success">Agregar</button>
                    <router-link :to="{name:'Gestion'}" class="btn btn-warning">Cancelar</router-link>
                    
                </div>
            </form>
            
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
  data() {
      return{
          receta:{}
      }
  },
  methods: {
      agregarRegistro(){
          console.log(this.receta)

        var datosEnviar={titulo:this.receta.titulo, categoria:this.receta.categoria, descripcion:this.receta.descripcion, ingredientes:this.receta.ingredientes, instrucciones:this.receta.instrucciones, foto:this.receta.foto}
      fetch('http://localhost/recetas/?insertar=1',{
          method:"POST",
          body:JSON.stringify(datosEnviar)
      })
      .then(respuesta=>respuesta.json())
      .then((datosRespuesta=>{
          console.log(datosRespuesta);
          window.location.href='gestion'

      }))
      }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
label{
    font-weight: bold;
}
</style>
