<template>
  <div class="header">
    <h1 class="headerText">태평양 전쟁의 해전</h1>
    <nav>
      <ul class="nav nav-tabs nav-fill">
        <li v-for="tab in tabs" :key="tab.id" class="nav-item">
          <a
            style="cursor: pointer"
            class="nav-link"
            :class="{ active: tab.id === currentTab }"
            @click="changeTab(tab.id)"
            >{{ tab.label }}</a
          >
        </li>
      </ul>
    </nav>
  </div>
  <div class="container">
    <!-- keep-alive 제거 (p.268 참조) -->
    <!-- <keep-alive include="CoralSeaTab, MidwayTab"> -->
    <component :is="currentTab"></component>
    <!-- </keep-alive> -->
  </div>
</template>

<script>
import { defineAsyncComponent } from 'vue' // (p.268)
import pMinDelay from 'p-min-delay' // (p.268)
// 하위 3줄은 의도적 지연시간 발행시키는 것을 적용하기 위해 주석 처리 (p.268)
// import CoralSeaTab from './components/CoralSeaTab.vue'
// import LeyteGulfTab from './components/LeyteGulfTab.vue'
// import MidwayTab from './components/MidwayTab.vue'
import Loading from './components/Loading.vue' // (p.272)

// 의도적 지연시간 발생 (p.268 참조)
// const CoralSeaTab = defineAsyncComponent(() =>
//   pMinDelay(import('./components/CoralSeaTab.vue'), 2000),
// )
// const LeyteGulfTab = defineAsyncComponent(() =>
//   pMinDelay(import('./components/LeyteGulfTab.vue'), 2000),
// )
// const MidwayTab = defineAsyncComponent(() => pMinDelay(import('./components/MidwayTab.vue'), 2000))

// (p.272)
const CoralSeaTab = defineAsyncComponent({
  loader: () => pMinDelay(import('./components/CoralSeaTab.vue'), 2000),
  loadingComponent: Loading,
})
const LeyteGulfTab = defineAsyncComponent({
  loader: () => pMinDelay(import('./components/LeyteGulfTab.vue'), 2000),
  loadingComponent: Loading,
})
const MidwayTab = defineAsyncComponent({
  loader: () => pMinDelay(import('./components/MidwayTab.vue'), 2000),
  loadingComponent: Loading,
})

export default {
  name: 'App',
  components: { CoralSeaTab, LeyteGulfTab, MidwayTab },
  data() {
    return {
      currentTab: 'CoralSeaTab',
      tabs: [
        { id: 'CoralSeaTab', label: '산호해 해전' },
        { id: 'MidwayTab', label: '미드웨이 해전' },
        { id: 'LeyteGulfTab', label: '레이테만 해전' },
      ],
    }
  },
  methods: {
    changeTab(tab) {
      this.currentTab = tab
    },
  },
}
</script>

<style>
.header {
  padding: 20px 0px 0px 20px;
}
.headerText {
  padding: 0px 20px 40px 20px;
}
.tab {
  padding: 30px;
}
</style>
