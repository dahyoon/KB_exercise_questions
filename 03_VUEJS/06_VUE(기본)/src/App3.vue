<script>
import CheckboxItem from './components/CheckboxItem3.vue'
import Idol from './Idol.js'
export default {
name: 'App3',
components: {CheckboxItem}},
data() {
return {
idols: [
new Idol(1, "BTS", true),
new Idol(1, "Black Pink", false),
new Idol(1, "EXO", false),
new Idol(1, "ITZU", false),
]}}
</script>

<template>
  <div>
    <h2>관심있는 K-POP 가수?</h2>
    </hr>
    <ul>
    <CheckboxItem v-for="idol in idols" :key="idol.id" :idol="idol""/>
    </ul>
  </div>
</template>

<style scoped>
</style>
