let msg = "GLOBAL";
function outer() {
  let msg = "OUTER";
  console.log(msg);
  if (true) {
    let msg = "BLOCK";
    console.log(msg);
  }
}
outer();
console.log("---");
console.log(msg);
// 실행: bash에서 # node 02-02-02.js
// 출력:
// OUTER
// BLOCK
// ---
// GLOBAL
