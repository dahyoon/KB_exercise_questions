<template>
  <div class="row">
    <div class="col p-3">
      <h2>할 일 추가</h2>
    </div>
  </div>
  <div class="row">
    <div class="col">
      <div class="form-group">
        <label for="todo">할 일:</label>
        <input type="text" class="form-control" id="todo" v-model="todoItem.todo" />
      </div>
      <div class="form-group">
        <label for="desc">설 명</label>
        <textarea id="desc" class="form-control" v-model="todoItem.desc"></textarea>
      </div>
      <div class="form-group">
        <button class="btn btn-primary m-1" @click="addTodoHandler">추 가</button>
        <button class="btn btn-primary m-1" @click="router.push('/todos')">취 소</button>
      </div>
    </div>
  </div>
</template>

<script setup>
import { inject, reactive } from 'vue'
import { useRouter } from 'vue-router'

const router = useRouter()
const { addTodo } = inject('actions')
const todoItem = reactive({ todo: '', desc: '' })

const addTodoHandler = () => {
  let { todo } = todoItem
  if (!todo || todo.trim() === '') {
    alert('할 일은 반드시 해야함')
    return
  }
  // 정상 실행 후 successCallback 함수 실행하도록 전달
  addTodo({ ...todoItem }, () => {
    router.push('/todos')
  })
}
</script>
