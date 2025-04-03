// fs (File System) 모듈 불러오기
const fs = require('fs');

// 현재 작업 디렉토리 파일 목록 출력 (비동기 함수 사용)
// fs.readdir('./', { withFileTypes: true }, (err, files) => { // withFileTypes 옵션 true 추가 (기본값=false)
fs.readdir('./', (err, files) => {
  if (err) {
    console.error(err);
  }
  console.log(files); // [ '01-path.js', '02-list-1.js', '03-list-2.js' ]
});

/* {withFileTypes: true} 옵션 추가 시 출력: [
  Dirent {
    name: '01-path.js',
    parentPath: './',
    path: './',
    [Symbol(type)]: 1
  },
  Dirent {
    name: '02-list-1.js',
    parentPath: './',
    path: './',
    [Symbol(type)]: 1
  },
  Dirent {
    name: '03-list-2.js',
    parentPath: './',
    path: './',
    [Symbol(type)]: 1
  }
]
  */
