<template>
  <nav>
    <router-link to="/">Inicio</router-link> |
    <router-link to="/gestion">Gestion</router-link>
  </nav>
  <router-view/>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
}

nav {
  padding: 30px;
  text-align: center;
}

nav a {
  font-weight: bold;
  color: #2c3e50;
}

nav a.router-link-exact-active {
  color: #42b983;
}
body{
  background-image: linear-gradient(to right, #cfd9df 0%, #e2ebf0 100%);
  
}
</style>
