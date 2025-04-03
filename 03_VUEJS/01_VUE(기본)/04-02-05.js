function addContact(
  name,
  mobile,
  home = '없음',
  address = '없음',
  email = '없음'
) {
  let str = `name=${name}, mobile=${mobile}, home=${home}, address=${address}, email=${email}`;
  console.log(str);
}

addContact('안다윤', '010-1234-5678');
addContact('김민지', '010-1002-2321', '02-4334-0029', '서울시');

// 실행: # node 04-02-05.js
// 출력:
// name=안다윤, mobile=010-1234-5678, home=없음, address=없음, email=없음
// name=김민지, mobile=010-1002-2321, home=02-4334-0029, address=서울시, email=없음
