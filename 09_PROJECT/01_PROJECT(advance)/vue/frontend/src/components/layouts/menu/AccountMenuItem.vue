<script setup>
// 부모 컴포넌트로부터 문자열 타입의 username prop을 전달받음
defineProps({ username: String })
</script>

<template>
  <div class="nav-item">
    <router-link class="nav-link" to="/auth/profile">
      <i class="fa-solid fa-user"></i>
      {{ username }}
    </router-link>
  </div>
</template>

<style scoped>
.AccountMenuItem {
}
</style>
