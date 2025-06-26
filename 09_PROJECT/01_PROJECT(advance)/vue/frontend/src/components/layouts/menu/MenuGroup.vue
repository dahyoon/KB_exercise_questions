<script setup>
import MenuItem from './MenuItem.vue'
// 부모 컴포넌트로부터 menus라는 props를 객체 타입으로 받아옴(필수)
const props = defineProps({
  menus: { type: Array, required: true },
})
</script>

<template>
  <ul class="navbar-nav">
    <MenuItem v-for="menu in menus" :menu="menu" />
  </ul>
</template>

<style scoped>
.MenuGroup {
}
</style>
