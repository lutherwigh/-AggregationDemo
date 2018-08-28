import Vue from 'vue'
import Router from 'vue-router'

import HomeSearch from '../pages/HomeSearch.vue'
import Info from '../pages/Info.vue'
import Discuss from '../pages/Discuss.vue'
import LaptopDetail from '../pages/LaptopDetail.vue'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      redirect: '/home'
    },
    {
      path: '/home',
      name: 'home',
      component: HomeSearch
    },
    {
      path: '/info',
      name: 'info',
      component: Info
    },
    {
      path: '/discuss',
      name: 'discuss',
      component: Discuss
    },
    {
      path: '/detail',
      name: 'detail',
      component: LaptopDetail
    }
  ]
})
