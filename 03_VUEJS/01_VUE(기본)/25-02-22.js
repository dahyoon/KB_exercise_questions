var p = new Promise((resolve, reject) => {
  resolve("first!");
});

p.then((msg) => {
  console.log(msg);
  throw new Error("## 에러!!"); // 에러 강제 발생
  return "second!";
})
  .then((msg) => {
    console.log(msg);
    return "third..!";
  })
  .then((msg) => {
    console.log(msg);
  })
  .catch((error) => {
    console.log("오류 발생 ==> ", error);
  });

// 출력:
// first!
// 오류 발생 ==>  Error: ## 에러!!
//     at /Users/dayoonz/Desktop/fullstack/03_VUEJS/01_VUE/25-02-22.js:7:9
