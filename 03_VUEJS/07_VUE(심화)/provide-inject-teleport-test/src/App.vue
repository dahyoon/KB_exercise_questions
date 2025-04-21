<template>
  <div>
    <h2>최신 인기곡</h2>
    <SongList :songs="songs" />
    <br /><br />
    <button @click="changeModal">Teleport를 이용한 Modal 기능</button>
    <teleport to="#modal_processing">
      <Modal v-if="isModal" />
    </teleport>
    <!-- 다음은 내가 추가한 것: 로그인 폼 모달창 -->
    <button @click="showLoginModal = true">로그인</button>
    <teleport to="#modal_login">
      <LoginModal v-if="showLoginModal" @close="showLoginModal = false" />
    </teleport>
  </div>
</template>

<script>
import { computed } from 'vue' // 주석처리해서 반응형 안되는것 확인 (p.263 참조)
import SongList from './components/SongList.vue'
import Modal from './components/Modal.vue'
import LoginModal from './components/LoginModal.vue' // 내가 추가한 것

export default {
  name: 'App',
  components: { SongList, Modal, LoginModal },
  data() {
    return {
      songs: [
        { id: 1, title: 'Blueming', done: false },
        { id: 2, title: 'Dynamite', done: true },
        { id: 3, title: 'Lovesick Girls', done: true },
        { id: 4, title: '마리아(Maria)', done: false },
      ],
      isModal: false,
      showLoginModal: false,
    }
  },
  methods: {
    changeModal() {
      this.isModal = true
      setTimeout(() => {
        this.isModal = false
      }, 2000)
    },
  },
  provide() {
    return {
      icons: {
        checked: 'far fa-check-circle',
        unchecked: 'far fa-circle',
      },
      doneCount: computed(() => {
        // 주석처리해서 반응형 안되는것  확인 (p.263 참조)
        return this.songs.filter((s) => s.done === true).length
      }),

      // doneCount: this.songs.filter((s) => s.done === true).length, // (p.263 참조)
    }
  },
}
</script>

<style>
@import url('https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css');
</style>
