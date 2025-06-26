<script setup>
// 부모 컴포넌트로부터 menu라는 props를 객체 타입으로 받아옴(필수)
const props = defineProps({
  menu: { type: Object, required: true },
})
</script>

<template>
  <li class="nav-iten">
    <router-link class="nav-link" :to="menu.url">
      <i :class="menu.icon"></i>
      {{ menu.title }}
    </router-link>
  </li>
</template>

<style scoped>
.MenuItem {
}
</style>
