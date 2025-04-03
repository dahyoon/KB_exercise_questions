<!-- (교재 p.192 참조) -->
<template>
  <li><input type="checkbox" :checked="idol.checked" />{{ idol.name }}</li>
</template>
<script>
import Idol from '../Idol.js';
export default {
  name: 'CheckboxItem3',
  props: {
    idol: Idol,
  },
};
</script>
<style scoped></style>
