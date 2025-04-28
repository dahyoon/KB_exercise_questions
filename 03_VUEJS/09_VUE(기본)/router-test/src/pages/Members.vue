<template>
  <div>
    <h2 class="m-4">이날치 멤버</h2>
    <div class="container">
      <div class="row">
        <div v-for="m in members" :key="m.id" class="col-6 col-xs-6 col-sm-4 col-md-3 col-lg-2">
          <router-link :to="'/members/' + m.id">
            <!-- 또는, <router-link :to="{ name: 'memberInfo', params: { id: m.id } }"> -->
            <img
              style="width: 90px; height: 110px"
              :src="m.photo"
              :title="m.name"
              alt="이미지"
              class="img-thumbnail"
            />
            <br />
            <h6 class="display-7">{{ m.name }}</h6>
          </router-link>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
// import { useRoute } from 'vue-router'
// import { onMounted } from 'vue'
import members from '@/members.json'

export default {
  name: 'Members',
  setup() {
    // const currentRoute = useRoute()
    // onMounted(() => {
    //   console.log('마운트 시 현재 currentRoute:', currentRoute)
    // })
    // return { currentRoute }
    return { members }
  },
}
</script>
