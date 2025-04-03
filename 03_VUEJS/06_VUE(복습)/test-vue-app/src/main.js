import { createApp } from 'vue';
// import App from './App.vue';
// import CheckboxItem from './components/CheckboxItem.vue';
// import App from './App2.vue';
// import App3 from './App3.vue'; // (교재 p.193 참조 - 교재에서는 안 나오지만 작성한 App3.vue 적용하기 위한 수정)
// import App from './App4.vue'; // (교재 p.198 참조)
import App from './App5.vue'; // (교재 p.203 참조)
import mitt from 'mitt';

import './assets/main.css';

// 컴포넌트 작성 방법 1: 전역 컴포넌트 (main.js에 작성하기) (교재 p.177 참조)
// - mount 하기 전에 컴포넌트 등록 필수
// - 순서: 앱 생성 -> 컴포넌트 등록 -> 마운트
// createApp(App).component('CheckboxItem', CheckboxItem).mount('#app');

// (교재 p.185 참조)
// createApp(App).mount('#app');

// (교재 p.193 참조 - 교재에서는 안 나오지만 작성한 App3.vue 적용하기 위한 수정)
// createApp(App3).mount('#app');

// (교재 p.203-204 참조)
const emitter = mitt();
emitter.on('*', (type, e) => console.log(`## 이벤트 로그:${type} -> `, e));
const app = createApp(App);
app.config.globalProperties.emitter = emitter;
app.mount('#app');
