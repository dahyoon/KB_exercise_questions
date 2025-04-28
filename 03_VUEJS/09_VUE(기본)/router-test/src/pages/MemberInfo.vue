<template>
  <div class="mt-5">
    <img :src="member.photo" alt="이미지" class="img" />
    <h4 class="mt-2">{{ member.name }}({{ member.role }})</h4>
    <p>{{ member.desc }}</p>
    <a
      v-if="member.insta && member.insta !== ''"
      :href="member.insta"
      class="fa fa-instagram m-1"
    ></a>
    <a
      v-if="member.facebook && member.facebook !== ''"
      :href="member.facebook"
      class="fa fa-facebook m-1"
    ></a>
    <a
      v-if="member.youtube && member.youtube !== ''"
      :href="member.youtube"
      class="fa fa-youtube m-1"
    ></a>
    <br /><br />
    <router-link to="/members">멤버 목록으로</router-link>
  </div>
</template>

<script>
import { useRoute } from 'vue-router'
import members from '@/members.json'

export default {
  name: 'MemberInfo',
  setup() {
    const currentRoute = useRoute()
    const id = parseInt(currentRoute.params.id, 10)
    const member = members.find((m) => m.id === id)
    return { member }
  },
}
</script>
