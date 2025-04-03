// Proxy 동작 이해하기
// - Proxy 객체 생성 방법: new Proxy(targetObject, handler)
// - handler에 등록 가능한 함수: get, set 등
let obj = { name: "안다윤", age: 20 };
const proxy = new Proxy(obj, {
  get: function (target, key) {
    console.log("## get " + key);
    if (!target[key]) throw new Error(`존재하지 않는 속성(${key})입니다.`);
    return target[key];
  },
  set: function (target, key, value) {
    console.log("## set " + key);
    if (!target[key]) throw new Error(`존재하지 않는 속성(${key})입니다.`);
    target[key] = value;
  },
});

console.log(proxy.name);
proxy.name = "Pearl";
proxy.age = 30;
proxy.email = "w2crosss@gmail.com";
