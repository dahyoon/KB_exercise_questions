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
const requestAPI = () => {
  let todoList = []
  axios
    .get(listUrl)
    .then((response) => {
      todoList = response.data
      console.log('# TodoList: ', todoList)
      return todoList[0].id
    })
    .then((id) => {
      return axios.get(todoUrlPrefix + id)
    })
    .then((response) => {
      console.log('## 첫 번째 Todo: ', response.data)
      return todoList[1].id
    })
    .then((id) => {
      axios.get(todoUrlPrefix + id).then((response) => {
        console.log('## 두 번째 Todo: ', response.data)
      })
    }).catch((e) => {
      // 예외 처리
      if (e instanceof Error) {
        console.log(e.message)
      } else {
        console.log(e);
      }
    })
}
requestAPI()
</script>
