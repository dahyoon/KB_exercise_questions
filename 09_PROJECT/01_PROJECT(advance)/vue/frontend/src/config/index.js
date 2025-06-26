export default {
  title: 'scoula',
  subtitle: 'KB Fullstack 학습(Vue + Spring)',
  menus: [
    // 메인 메뉴
    {
      title: '게시판',
      url: '/board/list',
      icon: 'fa-solid fa-paste',
    },
    {
      title: '여행',
      url: '/travel/list',
      icon: 'fa-solid fa-plane-departure',
    },
    {
      title: '갤러리',
      url: '/gallery/list',
      icon: 'fa-regular fa-images',
    },
  ],
  accountMenus: {
    // 인증 관련 메뉴
    login: {
      url: '/auth/login',
      title: '로그인',
      icon: 'fa-solid fa=right-to-bracket',
    },
    join: {
      url: '/auth/join',
      title: '회원가입',
      icon: 'fa-solid fa-user-plus',
    },
  },
}
