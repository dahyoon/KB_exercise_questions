// 실행 # node 파일명
function hello(name) {
  console.log(name + "님, 안녕하세요?");
}

hello("안다윤");

// npm install ansi-colors 후 실행
const c = require("ansi-colors");
function d(name) {
  console.log(c.green(name) + "님, 안녕하세요?"); // 초록색
  console.log(c.blue(name) + "님, 안녕!!"); // 파란색
  console.log(c.bgCyanBright(name) + "님, 안녕!!"); // 배경 하늘색
}

d("Pearl2");
