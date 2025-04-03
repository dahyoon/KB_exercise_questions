const path = require('path');

// 경로 연결
const fullPath = path.join('some', 'work', 'ex.txt');
console.log(fullPath); // some\work\ex.txt

// 절대 경로
console.log(`파일 절대 경로: ${__filename}`); // C:\fullstack\02_NODEJS\02_NODE(기본)\03장_파일관리하기\01-path.js
// 경로만
console.log(`경로만: ${path.dirname(__filename)}`); // C:\fullstack\02_NODEJS\02_NODE(기본)\03장_파일관리하기

// 파일명 (확장자 포함)
console.log(`파일명 (확장자 포함): ${path.basename(__filename)}`);
// 파일명 (확장자 제거)
console.log(`파일명 (확장자 제거): ${path.basename(__filename, '.js')}`);

// 파일 확장명만
console.log(`파일 확장명만: ${path.extname(__filename)}`);

// 파일 경로 요소 전체
const parsedPath = path.parse(__filename);
console.log('파일 요소 전체: ');
console.log(parsedPath);
// console.log(`파일 요소 전체: ${path.parse(__filename)}`); // 파일 요소 전체: [object Object]
