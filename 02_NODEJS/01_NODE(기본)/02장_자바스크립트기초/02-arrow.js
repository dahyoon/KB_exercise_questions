// 함수 표현식
const getTriangle = function (base, height) {
  return (base * height) / 2;
};
console.log("삼각형의 면적:" + getTriangle(5, 2));

// 화살표 함수
const getTriangle2 = (base, height) => (base * height) / 2;
console.log("삼각형의 면적:" + getTriangle2(6, 2));
