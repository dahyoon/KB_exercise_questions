<template>
  <div>
    <h2>콘솔을 확인합니다.</h2>
  </div>
</template>

<script setup>
import axios from 'axios'
const listUrl = '/api/todolist_long/gdhong'
const todoUrlPrefix = '/api/todolist_long/gdhong/'

// 4건의 목록을 조회한 후 첫 번째, 두 번째 할 일을 순차적으로 조회
// Promise의 then/catch 사용
const requestAPI = () => {
  let todoList = []
  axios
    .get(listUrl) // 할 일 목록을 조회
    .then((response) => {
      todoList = response.data
      console.log('# TodoList: ', todoList) // 할 일 목록 콘솔에 출력
      return todoList[0].id // 첫 번째 할 일의 ID 반환
    })
    .then((id) => {
      return axios.get(todoUrlPrefix + id) // 첫 번째 할 일 상세 조회
    })
    .then((response) => {
      console.log('## 첫 번째 Todo: ', response.data) // 첫 번째 할 일 상세 정보 출력
      return todoList[1].id // 두 번째 할 일의 ID 반환
    })
    .then((id) => {
      axios
        .get(todoUrlPrefix + id) // 두 번째 할 일 상세 조회
        .then((response) => {
          console.log('## 두 번째 Todo: ', response.data) // 두 번째 할 일 상세 정보 출력
        })
    })
    .catch((e) => {
      // 예외 처리
      if (e instanceof Error) {
        console.log(e.message)
      } else {
        console.log(e)
      }
    })
}
requestAPI()
</script>
