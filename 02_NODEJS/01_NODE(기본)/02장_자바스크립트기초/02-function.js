// 1: 기본 방법
// 함수 선언
function greeting(name) {
  console.log(`${name}님, 안녕하세요?`);
}
// 함수 호출
greeting('안다윤');

// 2: 함수 표현식 (이름 없이 명령만 작성)
// 함수 선언
const greeting2 = function (name) {
  console.log(`${name}님, 안녕하세요?`);
};
// 함수 호출
greeting2('안다윤');

// 3: 즉시 실행 함수
// 함수 선언 + 호출
(function (a, b) {
  console.log(`두 수의 합: ${a + b}`);
})(100, 200); // 두 수의 합: 300

// 4: 화살표 함수
// 4-1: 여러 줄이면 {} 사용
// 함수 선언
let hi = () => {
  return '안녕하세요?';
};
console.log(hi());
// 4-2: 한 줄이면 {} 및 return 생략 가능
// 함수 선언
let hi2 = () => '안녕하세요2?';
console.log(hi2());
// 4-3: 매개변수 포함, {} 및 return 사용
// 함수 선언
let sum = (a, b) => {
  return a + b;
};
console.log(sum(100, 200)); // 300
// 4-4: 매개변수 포함, {} 및 return 생략
// 함수 선언
let sum2 = (a, b) => a + b;
console.log(sum2(10, 30)); // 40
