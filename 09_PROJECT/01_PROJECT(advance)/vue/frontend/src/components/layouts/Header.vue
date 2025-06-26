<script setup>
import config from '@/config'
</script>

<template>
  <div class="jumbotron p-5 bg-primary text-white">
    <h1>{{ config.title }}</h1>
    <p>{{ config.subtitle }}</p>
  </div>
</template>

<style scoped>
.jumbotron {
  position: relative;
  background-image: url('@/assets/images/background.jpg');
  background-repeat: no-repeat;
  background-position: center;
  background-size: cover;
  color: white;
  padding: 2rem;
  z-index: 0; /* 다른 요소들과 레이어 우선순위 설정 */
}
.jumbotron::before {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background-color: rgba(0, 0, 0, 0.3); /* 30% 어두운 검정 레이어 */
  z-index: -1;
}
</style>
