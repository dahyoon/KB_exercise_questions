<template>
  <div class="card card-body">
    <h2>About</h2>
    <!-- Options API 사용 -->
    <!-- <p>요청 경로: {{ $route.fullPath }}</p> -->
    <!-- Composition API 사용 -->
    <p>요청 경로: {{ currentRoute.fullPath }}</p>
    <p>currentRoute의 모든 정보: <br />{{ currentRoute }}</p>
  </div>
</template>

<script>
import { useRoute } from 'vue-router'
import { onMounted } from 'vue'

export default {
  name: 'About',
  //   Options API 사용
  // created() {
  //   console.log(this.$route)
  // },

  // Composition API 사용
  setup() {
    const currentRoute = useRoute()
    onMounted(() => {
      console.log('마운트 시 현재 currentRoute:', currentRoute)
    })
    return { currentRoute }
  },
}
</script>
