// 화살표 함수로 변환 bind()
var obj = { result: 0 };
obj.add = function (x, y) {
  const inner = () => {
    // 화살표 함수 사용
    this.result = x + y;
  };
  inner();
};
obj.add(3, 4);

console.log(obj); // { result: 7, add: [Function (anonymous)] }
