const fs = require("fs");

// 파일 읽어와 다른 파일에 쓰기 (비동기 함수 사용)
fs.readFile("./example.txt", "utf8", (err, data) => {
  if (err) {
    console.log(err);
  }
  fs.writeFile("./text-2.txt", data, (err) => {
    if (err) {
      console.log(err);
    }
    console.log("text-2.txt is saved!");
  });
});
