<template>
  <div class="modal_login">
    <div class="modal_content">
      <h3>로그인</h3>
      <input type="text" placeholder="아이디" />
      <input type="password" placeholder="비밀번호" />
      <button @click="$emit('close')">닫기</button>
    </div>
  </div>
</template>

<script>
export default {
  name: 'LoginModal',
}
</script>

<style scoped>
.modal_login {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background-color: rgba(0, 0, 0, 0.4);
}
.modal_content {
  background-color: white;
  padding: 20px;
  margin: 100px auto;
  width: 300px;
  border-radius: 8px;
}
</style>
