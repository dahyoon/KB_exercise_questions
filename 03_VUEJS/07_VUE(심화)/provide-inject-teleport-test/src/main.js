import { createApp } from 'vue'
import App from './App.vue'

// vue 3.3 이상 버전은 다음 설정 불필요 (p.262)
// - 다음은 데이터를 브라우저 콘솔에서 직접 수정할 수 있도록 전역 변수 vm에 루트 컴포넌트(App) 인스턴스를 할당하는 것
// - 또한 다음과 같은 환경 설정 필요
// - -> app.config.unwrapInjectedRef = true
// - -> 이는 값을 주입하는 컴포넌트(SongList 컴포넌트)에서 computed 참조를 자동으로 해제해야 하기 때문
// - -> 즉, 하위 컴포넌트에서 상위 컴포넌트의 데이터를 변경하지 않도록 하기 위함
// const app = createApp(App);
// app.config.unwrapIinjectedRef = true
// window.vm = app.mount('#app')

createApp(App).mount('#app')
