<template>
  <div class="container">
    <Header />
    <router-view />
    <Loading v-if="states.isLoading" />
  </div>
</template>

<script setup>
import { reactive, computed, provide } from 'vue'
import Header from '@/components/Header.vue'
import Loading from '@/components/Loading.vue'
import axios from 'axios'

// 교재 예제
// const owner = 'gdhong'
// 의도적 지연 시간을 발생시키는 /todolist_long 사용
// const BASEURI = '/api/todolist_long'

// KB 실습 예제
const BASEURI = '/api/todos'
const states = reactive({ todoList: [], isLoading: false })

// TodoList 목록 조회
const fetchTodoList = async () => {
  states.isLoading = true
  try {
    // const response = await axios.get(BASEURI + `/${owner}`)
    const response = await axios.get(BASEURI)
    if (response.status === 200) {
      states.todoList = response.data
    } else {
      alert('데이터 조회 실패')
    }
  } catch (error) {
    alert('에러 발생: ' + error)
  }
  states.isLoading = false
}

// 새 TodoItem 추가
const addTodo = async ({ todo, desc }, successCallback) => {
  states.isLoading = true
  try {
    // const response = await axios.post(BASEURI + `/${owner}`, payload)
    const payload = { todo, desc }
    const response = await axios.post(BASEURI, payload)
    // if (response.data.status === 'success') {
    if (response.status === 201) {
      // states.todoList.push({ id: response.data.item.id, todo, desc, done: false })
      states.todoList.push({ ...response.data, done: false })
      successCallback()
    } else {
      alert('Todo 추가 실패: ' + response.data.message)
    }
  } catch (error) {
    alert('에러 발생: ' + error)
  }
  states.isLoading = false
}

// 기존 TodoItem 수정
const updateTodo = async ({ id, todo, desc, done }, successCallback) => {
  states.isLoading = true
  try {
    // const payload = { todo, desc, done }
    // const response = await axios.put(BASEURI + `/${owner}`, payload)
    const payload = { id, todo, desc, done }
    const response = await axios.put(BASEURI + `/${id}`, payload)
    // if (response.data.status === 'success') {
    if (response.status === 200) {
      let index = states.todoList.findIndex((todo) => todo.id === id)
      states.todoList[index] = { id, todo, desc, done }
      successCallback()
    } else {
      alert('Todo 수정 실패: ' + response.data.message)
    }
  } catch (error) {
    alert('에러 발생: ' + error)
  }
  states.isLoading = false
}

// 기존 TodoItem 삭제
const deleteTodo = async (id) => {
  states.isLoading = true
  try {
    // const response = await axios.delete(BASEURI + `/${owner}/${id}`)
    const response = await axios.delete(BASEURI + `/${id}`)
    // if (response.data.status === 'success') {
    if (response.status === 200) {
      let index = states.todoList.findIndex((todo) => todo.id === id)
      states.todoList.splice(index, 1)
    } else {
      alert('Todo 삭제 실패: ' + response.data.message)
    }
  } catch (error) {
    alert('에러 발생: ' + error)
  }
  states.isLoading = false
}

// 기존 TodoItem의 완료여부(done) 값 토글
const toggleDone = async (id) => {
  states.isLoading = true
  try {
    // const response = await axios.put(BASEURI + `/${owner}/${id}/done`)
    let todo = states.todoList.find((todo) => todo.id === id)
    let payload = { ...todo, done: !todo.done }
    const response = await axios.put(BASEURI + `/${id}`, payload)
    // if (response.data.status === 'success') {
    if (response.status === 200) {
      // let index = states.todoList.findIndex((todo) => todo.id === id)
      // states.todoList[index].done = !states.todoList[index].done
      todo.done = payload.done
    } else {
      alert('Todo 완료 변경 실패: ' + response.data.message)
    }
  } catch (error) {
    alert('에러 발생: ' + error)
  }
  states.isLoading = false
}

provide(
  'todoList',
  computed(() => states.todoList),
)
provide('actions', { addTodo, deleteTodo, toggleDone, updateTodo, fetchTodoList })

fetchTodoList()
</script>
