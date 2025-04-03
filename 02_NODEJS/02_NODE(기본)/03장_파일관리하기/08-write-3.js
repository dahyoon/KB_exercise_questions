const fs = require("fs");

// 비동기 함수로 파일 읽고, text-1.txt 파일이 존재하면 종료, 존재하지 않으면 파일 쓰기
fs.readFile("./example.txt", "utf-8", (err, data) => {
  if (err) {
    console.log(err);
  }
  if (fs.existsSync("./text-1.txt")) {
    console.log("the file (text-1.txt) already exists!");
  } else {
    fs.writeFile("./text-1.txt", data, (err) => {
      if (err) {
        console.log(err);
      }
      console.log("./text-1.txt is saved!");
    });
  }
});
