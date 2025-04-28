<template>
  <div>
    <h2>콘솔을 확인합니다</h2>
  </div>
</template>

<script setup>
import axios from 'axios'

const listUrl = '/api/todolist_long/gdhong'
const todoUrlPrefix = '/api/todolist_long/gdhong/'

// 4건의 목록 조회
const requestAPI = async () => {
  let todoList

  // 예외 처리
  try {
    let response = await axios.get(listUrl)
    todoList = response.data
    console.log('# TodoList (App2): ', todoList)

    // 첫 번째, 두 번째 할 일을 순차적으로 조회
    response = await axios.get(todoUrlPrefix + todoList[0].id)
    console.log('## 첫 번째 Todo: ', response.data)

    response = await axios.get(todoUrlPrefix + todoList[1].id)
    console.log('## 두 번쩨 Todo: ', response.data)

    // 한 건씩 순차적으로 조회
    for (let i = 0; i < todoList.length; i++) {
      response = await axios.get(todoUrlPrefix + todoList[i].id)
      console.log(`# ${i + 1}번째 Todo: `, response.data)
    }
  }
  catch (e) {
    if (e instanceof Error) {
      console.log(e.message)
    } else {
      console.log(e);
    }
  }
}
requestAPI()
</script>