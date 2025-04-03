// fs (File System) 모듈 불러오기
const fs = require('fs');

let files = fs.readdirSync('./');
console.log(files);
