// 심화 문제 1 ('01 개발환경 구축, ES6(심화).pdf 파일' p.2)
let obj1 = { name: "박문수", age: 29 };
let obj2 = { ...obj1, email: "mspark@gmail.com" };
console.log(obj2);

// 심화 문제 2 ('01 개발환경 구축, ES6(심화).pdf 파일' p.3)
let arr1 = [100, 200, 300];
let arr2 = ["hello", ...arr1, "world"];

console.log(arr1);
console.log(arr2);
