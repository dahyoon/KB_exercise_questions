<!-- (교재 p.184 참조) -->
<template>
  <div>
    <h2>관심있는 K-POP 가수?</h2>
    <hr />
    <ul>
      <CheckboxItem v-for="idol in idols" :key="idol.id" :idol="idol" />
    </ul>
  </div>
</template>

<style scoped></style>

<script>
import CheckboxItem from './components/CheckboxItem2.vue'; // 컴포넌트 import
export default {
  name: 'App',
  components: { CheckboxItem }, // components 옵션으로 등록

  // (교재 p.182 참조)
  data() {
    return {
      idols: [
        { id: 1, name: 'BTS', checked: true },
        { id: 2, name: 'Black Pink', checked: false },
        { id: 3, name: 'EXO', checked: false },
        { id: 4, name: 'ITZY', checked: false },
      ],
    };
  },
};
</script>
