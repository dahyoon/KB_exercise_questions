// Promise 사용
let likePizza = true;
const pizza = new Promise((resolve, reject) => {
  if (likePizza) resolve("피자를 주문합니다.");
  else reject("피자를 주문하지 않습니다.");
});
// console.log(pizza); // false일 경우 에러 발생 -> 예외 처리 필요

// 예외 처리
pizza.then((result) => console.log(result)); // then 함수: 성공 시 result 반환
pizza.catch((err) => console.log(err)); // catch 함수: 실패 시 err 반환
// 한줄로 표현 (프라미스 체이닝)
// 한줄
pizza
  .then((result) => console.log(result)) //
  .catch((err) => console.log(err));
