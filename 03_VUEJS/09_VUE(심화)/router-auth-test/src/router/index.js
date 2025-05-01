import { createRouter, createWebHistory } from 'vue-router'
import { isMatchToRoles, getUserInfo } from '@/utils/AuthUtil.js'

import Home from '@/pages/Home.vue'
import Login from '@/pages/Login.vue'
import Users from '@/pages/Users.vue'
import Admins from '@/pages/Admins.vue'

const router = createRouter({
  history: createWebHistory(),
  routes: [
    { path: '/', name: 'home', component: Home },
    { path: '/login', name: 'login', component: Login },
    { path: '/users', name: 'users', component: Users },
    { path: '/admins', name: 'admins', component: Admins },
  ],
})

router.beforeEach((to) => {
  // beforeEach 내비게이션 가드
  const userInfo = getUserInfo()

  // 로그인된 유저가 로그인 페이지 접근 시 홈으로
  if (to.name === 'login' && userInfo.authenticated) {
    return { name: 'home' }
  }

  // 접근 권한 없는 경우 로그인 페이지로
  if (!isMatchToRoles(to.path)) {
    return { name: 'login', query: { fromname: to.fullPath } }
  }
})

export default router
