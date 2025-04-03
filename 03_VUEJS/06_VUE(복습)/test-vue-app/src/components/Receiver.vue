<template>
  <div
    style="
      border: 1px solid gray;
      border-radius: 5px;
      margin: 5px;
      padding: 5px;
    "
  >
    <h2 style="color: navy">Receiver</h2>
    <hr />
    <h2>전송된 텍스트: {{ textMessage }}</h2>
  </div>
</template>
<script>
export default {
  name: 'Receiver', // 파일명과 동일 필수
  created() {
    // created() 생명주기 - instant에 있는데 아직 ~ 하기 전?
    this.emitter.on('message', this.receiveHandler);
  },
  data() {
    return {
      textMessage: '',
    };
  },
  methods: {
    receiveHandler(msg) {
      this.textMessage = msg;
    },
  },
};
</script>
