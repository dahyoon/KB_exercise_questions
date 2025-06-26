export default [
  {
    path: '/board/list',
    name: 'board/list',
    // 지연 로딩 적용
    component: () => import('../pages/board/BoardListPage.vue'),
  },
]
