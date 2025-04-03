<!-- src/components/InputName.vue 파일, 교재 P.196 참조 -->
<template>
  <div style="border: solid 1px gray; padding: 5px">
    이름 : <input type="text" v-model="name" />
    <button @click="$emit('nameChanged', { name })">이벤트 발신</button>
  </div>
</template>

<script>
export default {
  name: 'InputName', // 파일명과 동일 필수(안 맞으면 나중에 에러 날 수 있음)
  // emits: ['nameChanged'],
  // 유효성 검사 포함  emit
  emits: {
    nameChanged: (e) => {
      return e.name && typeof e.name === 'string' && e.name.trim().length >= 3
        ? true
        : false;
    },
  },
  data() {
    return {
      name: '',
    };
  },
};
</script>
