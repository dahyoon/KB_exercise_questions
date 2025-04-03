const p1 = { name: "john", age: 20 };
p1.age = 22;
console.log(p1);

// p1 = { name: 'lee', age: 25 };
// 오류 안 나는 이유: const는 변수 자체를 재할당할 수 없도록 제한하는 키워드이지만
// 객체나 배열의 경우 안의 내용(속성/요소)은 변경 가능
