<script setup>
import { computed } from 'vue'
// 메뉴 컴포넌트
import MenuItem from './MenuItem.vue'
import AccountMenuItem from './AccountMenuItem.vue'
import LogoutMenuItem from './LogoutMenuItem.vue'
import config from '@/config'

// 설정 파일에서 계정 메뉴 가져오기
const { login, join } = config.accountMenus

// 로그인 상태 (임시: false)
const islogin = computed(() => false) // 임시: 로그인하지 않은 상태
// 사용자 이름 (임시: 없음)
const username = computed(() => '') // 임시: 사용자명 없는 상태
</script>

<template>
  <ul class="navbar-nav ms-auto">
    <!-- 로그인 상태 -->
    <template v-if="islogin">
      <!-- 사용자 이름 표시 메뉴 -->
      <AccountMenuItem :username="username" />
      <!-- 로그아웃 메뉴 -->
      <LogoutMenuItem />
    </template>
    <!-- 비로그인 상태 -->
    <template v-else>
      <!-- 로그인 메뉴 -->
      <MenuItem :menu="login" />
      <!-- 회원가입 메뉴 -->
      <MenuItem :menu="join" />
    </template>
  </ul>
</template>

<style scoped>
.AccountMenuGroup {
}
</style>
