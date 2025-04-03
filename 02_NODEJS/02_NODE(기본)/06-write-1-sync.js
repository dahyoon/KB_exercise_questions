const fs = require("fs");

// 파일 읽어와 다른 파일에 쓰기 (동기 함수 사용)
const data1 = fs.readFileSync("./example.txt", "utf-8");
fs.writeFileSync("./text-1.txt", data1);

// 파일 존재 여부 확인, 있으면 파일 안 씀, 없으면 씀
const data2 = fs.readFileSync("./example.txt", "utf-8");
if (fs.existsSync("text-1.txt")) {
  console.log("file 존재함");
} else {
  fs.writeFileSync("text-1.txt", data2);
}
