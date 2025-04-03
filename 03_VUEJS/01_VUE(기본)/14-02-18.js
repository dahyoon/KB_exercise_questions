// 템플릿 리터럴 사용 (``)
const d1 = new Date();
let name = '안다윤';
let r1 = `${name} 님에게 ${d1.toDateString()}에 연락했다.`;
console.log(r1);

let product = '아이폰15';
let price = 199000;
let str = `${product}의 가격은 \n \t ${price}원 입니다.`;
let str_multiple = `${product}의 가격은

            ${price}원 입니다.`;
console.log(str);
console.log(str_multiple);
