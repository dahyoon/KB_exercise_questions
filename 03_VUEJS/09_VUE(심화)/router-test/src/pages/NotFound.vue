<template>
  <div class="card card-body">
    <h2>404 Not Found</h2>
    <!-- Options API -->
    <!-- <p>존재하지 않는 요청 경로: {{ $route.fullPath }}</p> -->
    <!-- Composition API -->
    <p>존재하지 않는 요청 경로: {{ fullPath }}</p>
  </div>
</template>

<script setup>
// Options API
// export default {
//  name: 'NotFound',
//  created() {
//    console.log(this.$route.params)
//  },
// }

// Composition API
import { onMounted } from 'vue'
import { useRoute, useRouter } from 'vue-router'

const route = useRoute()
const router = useRouter()
const fullPath = route.fullPath

onMounted(() => {
  console.log(route.params)
  console.log(router)
})
</script>
