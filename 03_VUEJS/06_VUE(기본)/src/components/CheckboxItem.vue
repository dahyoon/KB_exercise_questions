<template>
  <!-- li><input type="checkbox" v-model="checked" /> 옵션1</li> -->
  <!-- <li><input type="checkbox" :checked="checked" /> {{ name }}</li> -->
  <li><input type="checkbox" :checked="checked" />{{ id }} - {{ name }}</li>
</template>

<script>
export default {
  name: 'CheckboxItem',
  //   props: ['name', 'checked'],
  props: {
    id: [Number, String],
    //name: String,
    name: {
      validator(v) {
        return typeof v !== 'string' ? false : v.trim().length >= 4 ? true : false
      },
    },
    checked: {
      type: Boolean,
      required: false,
      default: false,
    },
  },

  //   created() {
  //     this.checked = true;
  //   },
  //   data() {
  //     return {
  //       checked: false,
  //     };
  //   },
}
</script>

<!-- <style scoped></style> -->
