import { defineStore } from 'pinia'
import { reactive, computed } from 'vue'

// Options API 방식의 todoList1 스토어
export const useTodoList1Store = defineStore('todoList1', {
  state: () => ({
    todoList: [
      { id: 1, todo: 'ES6학습', done: false },
      { id: 2, todo: '샤오바오 먹기', done: false },
      { id: 3, todo: '뽀로로랑 놀기', done: true },
      { id: 4, todo: '공부하기', done: true },
    ],
  }),
  getters: {
    doneCount: (state) => {
      return state.todoList.filter((todoItem) => todoItem.done === true).length
    },
  },
  actions: {
    addTodo(todo) {
      this.todoList.push({ id: new Date().getTime(), todo, done: false })
    },
    deleteTodo(id) {
      let index = this.todoList.findIndex((todo) => todo.id === id)
      this.todoList.splice(index, 1)
    },
    toggleDone(id) {
      let index = this.todoList.findIndex((todo) => todo.id === id)
      this.todoList[index].done = !this.todoList[index].done
    },
  },
})

// Composition API 방식의 todoList2 스토어
export const useTodoList2Store = defineStore('todoList2', () => {
  const state = reactive({
    todoList: [
      { id: 1, todo: 'ES6학습', done: false },
      { id: 2, todo: '크롱이랑 놀기', done: true },
      { id: 3, todo: '자기', done: false },
      { id: 4, todo: 'VUE.JS 공부하기', done: true },
    ],
  })

  const addTodo = (todo) => {
    state.todoList.push({ id: new Date().getTime(), todo, done: false })
  }

  const deleteTodo = (id) => {
    let index = state.todoList.findIndex((todo) => todo.id === id)
    state.todoList.splice(index, 1)
  }

  const toggleDone = (id) => {
    let index = state.todoList.findIndex((todo) => todo.id === id)
    state.todoList[index].done = !state.todoList[index].done
  }

  const doneCount = computed(() => {
    return state.todoList.filter((todoItem) => todoItem.done === true).length
  })

  const todoList = computed(() => {
    return state.todoList
  })

  return { todoList, doneCount, addTodo, deleteTodo, toggleDone }
})
