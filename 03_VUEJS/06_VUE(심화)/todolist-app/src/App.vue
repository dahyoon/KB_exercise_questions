<script>
import TodoList from './components/TodoList.vue'
import InputTodo from './components/InputTodo.vue'

let ts = new Date().getTime()
export default {
  name: 'App',
  components: { InputTodo, TodoList },
  created() {
    this.emitter.on('add-todo', this.addTodo)
    this.emitter.on('delete-todo', this.deleteTodo)
    this.emitter.on('toggle-completed', this.toggleCompleted)
  },
  data() {
    return {
      ts,
      todoList: [
        { id: ts, todo: '자전거 타기', completed: false },
        { id: ts + 1, todo: '공부 하기', completed: false },
        { id: ts + 2, todo: '놀기', completed: true },
        { id: ts + 3, todo: '공원 산책하기', completed: true },
      ],
    }
  },
  methods: {
    addTodo(todo) {
      if (todo.length >= 2) {
        this.todoList.push({ id: new Date().getTime(), todo: todo, completed: false })
      }
    },
    deleteTodo(id) {
      let index = this.todoList.findIndex((item) => id === item.id)
      this.todoList.splice(index, 1)
    },
    toggleCompleted(id) {
      let index = this.todoList.findIndex((item) => id === item.id)
      this.todoList[index].completed = !this.todoList[index].completed
    },
  },
}
</script>

<template>
  <div id="app" class="container">
    <div class="card card-body bg-light pt-5 pb-5">
      <div class="title">:: Todolist App</div>
    </div>
    <div class="card card-default card-borderless">
      <div class="card-body">
        <InputTodo />
        {{ ts }}
        <TodoList :todoList="todoList" />
      </div>
    </div>
  </div>
</template>
