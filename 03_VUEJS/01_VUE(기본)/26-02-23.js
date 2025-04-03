let obj1 = { name: "안다윤", age: 29 };
let obj2 = obj1; // 앝은 복사 (shallow copy) // 동일한 메모리 주소 복사 // 동일한 객체 참조
let obj3 = { ...obj1 }; // 전개 연산자 사용 // obj1와 obj3은 다른 객체
let obj4 = { ...obj1, email: "w2crosss@gmail.com" }; // 새로운 속성 추가

obj2.age = 19;
console.log("obj1: ", obj1); // obj1:  { name: '안다윤', age: 19 }
console.log("obj2: ", obj2); // obj2:  { name: '안다윤', age: 19 }
console.log("obj3: ", obj3); // obj3:  { name: '안다윤', age: 29 } // age 바뀌지 않은 이유: age를 바꾸기 전 obj1을 obj3에 복사했기 때문
console.log("obj4: ", obj4); // obj4:  { name: '안다윤', age: 29, email: 'w2crosss@gmail.com' }
console.log(obj1 == obj2); // true // 동일한 주소이므로 동일한 객체 참조
console.log(obj3 == obj1); // false // obj3는 obj1의 속성 값을 복사하여 새롭게 만들어진 객체이므로 같지 않음

let arr1 = [100, 200, 300];
let arr2 = ["hello", ...arr1, "world"];
console.log(arr1); // [100, 200, 300]
console.log(arr2); // ['hello', 100, 200, 300, 'world']
