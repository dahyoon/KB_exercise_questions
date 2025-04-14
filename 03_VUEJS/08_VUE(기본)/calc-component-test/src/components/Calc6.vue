<script>
import { watch, reactive } from 'vue'

export default {
  name: 'Calc6',
  setup() {
    const state = reactive({ x: 0, result: 0 })
    // (p.289)
    // watch(state, (current, old) => {
    //   console.log(`${old} ==> ${current}`)
    //   state.result = current.x * 2

    // (p.290)
    // watch(state.x, (current, old) => {
    //   console.log(`${old} ==> ${current}`)
    //   state.result = current * 2
    // })

    // (p.291)
    watch(
      () => state.x,
      (current, old) => {
        console.log(`${old} ==> ${current}`)
        state.result = current * 2
      },
    )

    return { state }
  },
}
</script>

<template>
  <div>
    x: <input type="text" v-model.number="state.x" /> <br />
    결과: {{ state.result }}
  </div>
</template>

<style scoped>
.Calc6 {
}
</style>
