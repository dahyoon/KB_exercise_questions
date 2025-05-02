<template>
  <div class="row">
    <div class="col p-3">
      <h2>할 일 수정</h2>
    </div>
  </div>
  <div class="row">
    <div class="col">
      <div class="form-group">
        <label for="todo">할 일</label>
        <input type="text" class="form-control" id="todo" v-model="todoItem.todo" />
      </div>
      <div class="form-group">
        <label for="desc">설명: </label>
        <textarea
          type="text"
          class="form-control"
          rows="3"
          id="desc"
          v-model="todoItem.desc"
        ></textarea>
      </div>
      <div class="form-group">
        <label for="done">완료 여부:</label>&nbsp;
        <input type="checkbox" v-model="todoItem.done" />
      </div>
      <div class="form-group">
        <button class="btn btn-primary m-1" type="button" @click="updateTodoHandler">수 정</button>
        <button class="btn btn-primary m-1" type="button" @click="router.push('/todos')">
          취 소
        </button>
      </div>
    </div>
  </div>
</template>

<script setup>
import { inject, reactive } from 'vue'
import { useRouter, useRoute } from 'vue-router'

const todoList = inject('todoList')
const { updateTodo } = inject('actions')
const router = useRouter()
const currentRoute = useRoute()
const matchedTodoItem = todoList.value.find((item) => item.id === parseInt(currentRoute.params.id))

if (!matchedTodoItem) {
  router.push('/todos')
}
const todoItem = reactive({ ...matchedTodoItem })
const updateTodoHandler = () => {
  let { todo } = todoItem
  if (!todo || todo.trim() === '') {
    alert('할일은 반드시 입력해야 합니다')
    return
  }
  updateTodo({ ...todoItem })
  router.push('/todos')
}
</script>
