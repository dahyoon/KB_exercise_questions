const hi = (name) => {
  console.log(`${name}님, 안녕하세요?`);
};

const goodbye = (name) => {
  console.log(`${name}님, 안녕히 가세요.`);
};

// say 객체 안에 hi, goodbye 함수 그룹화
const say = { hi, goodbye };

// export
export default say;
