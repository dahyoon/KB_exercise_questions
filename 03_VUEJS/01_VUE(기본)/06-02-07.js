// 배열의 구조 분해 사용
let arr = [10, 20, 30, 40];
// let [a1, a2, a3, a4] = arr;
let [a1, a2, a3] = arr;
console.log(a1, a2, a3);
let p1 = { name: '안다윤', age: 20, gender: 'F' };
let { name: n, age: a, gender } = p1;
console.log(n, a, gender);
