const fs = require("fs");

// 스트림 사용
const readStream = fs.createReadStream("./readMe.txt", "utf-8");
const writeStream = fs.createWriteStream("./writeMe.txt");

// 파이프 사용
readStream.pipe(writeStream);
