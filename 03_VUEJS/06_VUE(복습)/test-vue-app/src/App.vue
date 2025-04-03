<template>
  <!-- <h2>App 컴포넌트</h2>
  <hr />
  <ul>
    <CheckboxItem />
    <CheckboxItem />
    <CheckboxItem />
    <CheckboxItem />
  </ul> -->
  <div>
    <h2>관심있는 K-POP 가수?</h2>
    <hr />
    <ul>
      <!-- (교재 p.182 참조) -->
      <!-- <CheckboxItem
        v-for="idol in idols"
        :key="idol.id"
        :name="idol.name"
        :checked="idol.checked"
      /> -->
      <!-- 위와 동일, 더 간결 (교재 p.183 참조) -->
      <CheckboxItem v-for="idol in idols" :key="idol.id" v-bind="idol" />
    </ul>
  </div>
</template>

<script>
// 컴포넌트 작성 방법 2: 지역 컴포넌트 (App.vue에 작성하기) (교재 p.178 참조)
// - 순서: script 안에 컴포넌트 import 및 components 옵션 등록
import CheckboxItem from './components/CheckboxItem.vue'; // 컴포넌트 import
export default {
  name: 'App',
  components: { CheckboxItem }, // components 옵션으로 등록

  // (교재 p.182 참조)
  data() {
    return {
      idols: [
        { id: 1, name: 'BTS', checked: true },
        // { id: 2, name: 'Black Pink', checked: false },
        // { id: 3, name: 'EXO', checked: false },
        // { id: 4, name: 'ITZY', checked: false },

        // (교재 p.190 참조)
        // { id: 2, name: 'Black Pink', checked: 1 },
        // { id: 3, name: 'EXO' },
        // { id: 4, name: { special: 'ITZY' } },

        // (교재 p.194-195 참조)
        { id: 2, name: 'Black Pink' },
        { id: 3, name: 'EXO', checked: true },
        { id: 4, name: 'ITZY' },
      ],
    };
  },
};
</script>
