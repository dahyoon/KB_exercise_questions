<!-- (교재 p.193 참조) -->
<template>
  <div>
    <h2>관심있는 K-POP 가수?</h2>
    <hr />
    <ul>
      <CheckboxItem v-for="idol in idols" :idol="idol" />
    </ul>
  </div>
</template>

<script>
import CheckboxItem from './components/CheckboxItem3.vue'; // 컴포넌트 import
import Idol from './Idol.js';
export default {
  name: 'App3',
  components: { CheckboxItem }, // components 옵션으로 등록

  // (교재 p.182 참조)
  data() {
    return {
      idols: [
        // 객체 생성
        new Idol(1, 'BTS', true),
        new Idol(2, 'Black Pink', false),
        new Idol(3, 'EXO', false),
        new Idol(4, 'ITZY', true),
      ],
    };
  },
};
</script>
