<!-- <script setup>은 Vue 3에서 Composition API를 더 간단하게 쓸 수 있게 하는 문법 -->
<script setup>
import { RouterView } from 'vue-router'
import DefaultLayout from './components/layouts/DefaultLayout.vue'
</script>

<template>
  <DefaultLayout>
    <RouterView />
  </DefaultLayout>
</template>

<style scoped>
/* 아직 스타일 없음 */
</style>
