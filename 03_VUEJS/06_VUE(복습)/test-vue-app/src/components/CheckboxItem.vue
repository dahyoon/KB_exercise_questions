<template>
  <!-- <li><input type="checkbox" v-model="checked" />{{ name }}</li> -->
  <!-- <li><input type="checkbox" :checked="checked" />{{ name }}</li> -->
  <li><input type="checkbox" :checked="checked" />{{ id }} - {{ name }}</li>
</template>
<script>
export default {
  name: 'CheckboxItem', // 컴포넌트 파일명(CheckboxItem.vue)과 동일하게 설정 권장 (교재 p.177 참조)
  // 방법 1: data() 메소드 사용 (교재 p.176, 177 참조)
  // data() {
  //   return { checked: false };
  // },

  // 방법 2: props 속성 사용
  // props: ['name', 'checked'], // (교재 p.181 참조)

  // (교재 p.186 참조)
  // created() {
  //   this.checked = true;
  // },

  // (교재 p.189 참조)
  // props: {
  //   id: [Number, String],
  //   name: String,
  //   checked: {
  //     type: Boolean,
  //     required: false,
  //     default: false,
  //   },
  // },

  // (교재 p.194 참조)
  props: {
    id: [Number, String],
    name: {
      validator(v) {
        // v = name Prop으로 전달된 값
        return typeof v !== 'string'
          ? false
          : v.trim().length >= 4
          ? true
          : false;
      },
    },
    checked: {
      type: Boolean,
      required: false,
      default: false,
    },
  },
};
</script>
<style scoped></style>
