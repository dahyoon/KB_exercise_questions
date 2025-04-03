// 1: 함수 이름 사용 (커피 주문 출력 프로그램)
const order = (coffee, callback) => {
  console.log(`${coffee} 주문 접수`);
  setTimeout(() => {
    callback(coffee);
  }, 3000); // 3000 ms =  3 sec
};

const display = (result) => {
  console.log(`${result} 완료!`);
};

order("아메리카노", display);

// 2: 익명 함수 사용 (단어 출력 프로그램)
function displayLetter() {
  console.log("A");
  setTimeout(() => {
    console.log("B");
    setTimeout(() => {
      console.log("C");
      setTimeout(() => {
        console.log("D");
        setTimeout(() => {
          console.log("stop!");
        }, 1000);
      }, 1000);
    }, 1000);
  }, 1000);
}

displayLetter();
