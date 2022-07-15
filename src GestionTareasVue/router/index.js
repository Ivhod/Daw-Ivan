import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import Gestion from '../components/gestion.vue'
import Crear from '../components/crear.vue'
import Editar from '../components/editar.vue'
import VerReceta from '../components/verReceta.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/gestion',
    name: 'Gestion',
    component: Gestion
  },
  {
    path: '/editar/:id',
    name: 'Editar',
    component: Editar
  },
  {
    path: '/crear',
    name: 'Crear',
    component: Crear
  },
  {
    path: '/verReceta/:id',
    name: 'VerReceta',
    component: VerReceta
  },
  {
    path: '/about',
    name: 'about',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
