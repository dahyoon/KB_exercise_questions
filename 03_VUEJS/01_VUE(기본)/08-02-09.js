const test1 = function (a, b) {
  return a + b;
};
const test2 = (a, b) => {
  return a + b;
};
const test3 = (a, b) => test1(a, b);
const test4 = (a, b) => a + b;
const test5 = (a, b) => {
  a + b;
}; // undefined // 이유: return 값이 없음

console.log(test1(3, 4));
console.log(test2(3, 4));
console.log(test3(3, 4));
console.log(test4(3, 4));
console.log(test5(3, 4)); // undefined // 이유: return 값이 없음
