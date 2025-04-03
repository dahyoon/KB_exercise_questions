const fs = require('fs');

const data1 = fs.readFileSync('./example.txt');
console.log(data1);
// 출력: <Buffer 4e 6f 64 65 2e 6a 73 20 69 73 20 61 6e 20 6f 70 65 6e 2d 73 6f 75 72 63 65 2c 20 63 72 6f 73 73 2d 70 6c 61 74 66 6f 72 6d 20 4a 61 76 61 53 63 72 69 ... 110 more bytes>
// 인코딩 지정 필요

const data2 = fs.readFileSync('./example.txt', 'utf-8');
console.log(data2);
/* 출력: Node.js is an open-source, cross-platform JavaScript runtime environment.
Node.js는 Chrome v8 JavaScript 엔진으로 빌드된 JavaScript 런타임입니다.
*/
