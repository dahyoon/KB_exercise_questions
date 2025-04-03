// 구조분해 할당 - 파라미터로 사용
// 파라미터 변수는 지역 변수 - let이 들어간 곳과 안 들어간 곳 주의!
function addContact1({ name, phone, email = '이메일 없음', age = 0 }) {
  console.log(name, phone, email, age);
}
addContact1({ name: '안다윤', phone: '010-2345-2345' });

function addContact2(contact) {
  if (!contact.email) contact.email = '이메일 없음';
  if (!contact.age) contact.age = 0;
  let { name, phone, email: email, age: age } = contact;
  console.log(name, phone, email, age);
}

addContact2({ name: '안다윤', phone: '010-2345-2222' });

function addContact3(name, phone, email = '이메일 없음', age = 0) {
  console.log(name, phone, email, age);
}

addContact3('안다윤', '010-2345-3328');
