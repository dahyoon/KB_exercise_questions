<template>
  <div
    style="
      border: 1px solid gray;
      border-radius: 5px;
      margin: 5px;
      padding: 5px;
    "
  >
    <h2 style="color: orange">Sender</h2>
    <hr />
    <button @click="sendMessage">이벤트 발신</button>
  </div>
</template>
<script>
export default {
  name: 'Sender', // 파일명과 동일 필수
  methods: {
    sendMessage() {
      this.emitter.emit('message', Date.now() + '에 발신된 메세지');
    },
  },
};
</script>
