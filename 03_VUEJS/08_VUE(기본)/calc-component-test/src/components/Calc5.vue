<script>
import { watch, ref } from 'vue'

export default {
  name: 'Calc5',
  setup() {
    const x = ref(0)
    const result = ref(0)
    const result2 = ref(1)
    watch(x, (current, old) => {
      console.log(`${old} ==> ${current}`)
      result.value = current * 2
    })
    return { x, result }
  },
}
</script>

<template>
  <div>
    x: <input type="text" v-model.number="x" /> <br />
    결과1: {{ result }}
  </div>
</template>

<style scoped></style>
