async function init() {
  try {
    const response = await fetch("https://jsonplaceholder.typicode.com/users");
    if (!response.ok) {
      throw new Error("네트워크 응답 문제");
    }
    const users = await response.json(); // json 응답 파싱
    console.log(users); // 응답 출력
  } catch (error) {
    console.error("에러 발생:", error); // 에러 처리
  }
}

init();
