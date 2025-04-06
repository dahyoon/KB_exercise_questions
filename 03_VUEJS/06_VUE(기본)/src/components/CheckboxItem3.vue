<script>
import Idol from '../Idol

export default {
    name: "CheckboxItem3",
    props: {
    idol: Idol}}
</script>

<template>
  <li><input type="checkbox" :checked="idol.checked" />{{ idol.name }}</li>
</template>

<style scoped>
.CheckboxItem3 {
}
</style>
