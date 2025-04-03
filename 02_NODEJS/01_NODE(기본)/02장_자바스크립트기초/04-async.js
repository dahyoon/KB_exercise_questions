function displayA() {
  console.log('A');
}
function displayB() {
  setTimeout(() => {
    console.log('B');
  }, 2000);
}
function displayC() {
  console.log('C');
}

displayA();
displayB();
displayC();

function displayA2() {
  console.log('A2');
}
function displayB2(callback) {
  setTimeout(() => {
    console.log('B2');
    callback();
  }, 2000);
}
function displayC2() {
  console.log('C2');
}

displayA2();
displayB2(displayC2);
