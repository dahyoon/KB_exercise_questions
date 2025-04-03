<!-- (교재 p.184 참조) -->
<template>
  <li><input type="checkbox" :checked="idol.checked" />{{ idol.name }}</li>
</template>
<script>
export default {
  name: 'CheckboxItem2',
  props: ['idol'], // idol 안에 다 담겨있음
  // created 생명주기 (교재 p.186-188 참조)
  created() {
    this.idol.checked = true;
  },
};
</script>
<style scoped></style>
