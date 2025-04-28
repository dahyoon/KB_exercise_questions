<template>
  <div>
    <h2>콘솔을 확인합니다</h2>
  </div>
</template>

<script setup>
import axios from 'axios'

const requestAPI = async () => {
  // const url = '/api/todolist_long/gdhong'
  const url = '/api/todos2' // 404 에러 발생: 서버가 요청된 페이지/리소스 찾을 수 없을 경우 발생
  // 지금과 같이 잘못된 경로 요청 시 발생
  axios
    .get(url, { timeout: 900 })
    .then((response) => {
      console.log('# 응답객체: ', response)
    })
    .catch((e) => {
      if (e instanceof Error) console.log(e.message)
      else console.log(e)
    })
}
requestAPI()
</script>
