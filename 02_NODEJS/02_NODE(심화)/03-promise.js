// p.183
// Promise 사용, 현재 디렉토리 항목 읽어서 출력
const fs = require("fs").promises;

fs.readdir("./")
  .then((result) => console.log(result))
  .catch((err) => console.error(err));
