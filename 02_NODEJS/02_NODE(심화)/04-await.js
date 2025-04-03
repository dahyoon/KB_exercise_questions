// p.184
// async/await 사용, 현재 디렉토리 항목 읽어서 출력
const fs = require("fs").promises;

async function readDirAsync() {
  try {
    const files = await fs.readdir("./");
    console.log(files);
  } catch {
    console.error(err);
  }
}

readDirAsync();
