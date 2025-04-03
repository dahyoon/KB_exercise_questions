// 가변 파라미터, 구조분해 할당 (전개 연산자 사용)
// - 뒤에 몇 개를 받을 지 미정일 시 ...배열명 에 배열 타입으로 담김!
function foodReport(name, age, ...fav_foods) {
  console.log(`${name}, ${age}`);
  console.log(fav_foods);
}

foodReport('김수현', 20, '짜장면', '냉면', '불고기');
foodReport('원빈', 16, '초밥');

// 실행: # node 05-02-06.js
// 출력:
// 김수현, 20
// [ '짜장면', '냉면', '불고기' ]
// 원빈, 16
// [ '초밥' ]
