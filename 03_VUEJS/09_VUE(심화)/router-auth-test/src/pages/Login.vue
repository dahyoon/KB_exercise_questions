<template>
  <div>
    <h2>로그인</h2>
    사용자: <input type="text" v-model="info.userid" /> <br />
    암호: <input type="password" v-model="info.password" /> <br />
    <br />
    <button @click="login">로그인</button>
  </div>
</template>

<script>
import { reactive } from 'vue'
import { useRoute, useRouter } from 'vue-router'
import { loginProcess } from '@/utils/AuthUtil.js'

export default {
  name: 'Login',
  setup() {
    const router = useRouter()
    const currentRoute = useRoute()
    const fromname = currentRoute.query.fromname // fromname 쿼리문자열 정보 (로그인 화면으로 이동하기 전에 접근하려 했던 경로) 갖고오기

    const info = reactive({ userid: '', password: '' })

    const successCallback = () => {
      // fromname 경로 존재 시 로그인 후 fromname 라우트 이름을 이용해 자동으로 이동시킴
      if (fromname) router.push({ path: fromname })
      else router.push({ name: 'home' })
    }
    const failCallback = () => {
      alert('로그인 실패')
    }
    const login = () => {
      loginProcess(info.userid, info.password, successCallback, failCallback)
    }
    return { info, login }
  },
}
</script>
