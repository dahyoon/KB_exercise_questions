const fs = require("fs");

const readStream = fs.createReadStream("./readMe.txt", "utf-8");
const writeStream = fs.createWriteStream("./writeMe.txt");

readStream.pipe(writeStream);
