fetch("https://jsonplaceholder.typicode.com/users")
  .then((response) => {
    if (!response.ok) {
      throw new Error("네트워크 응답 문제"); // 에러 처리
    }
    return response.json(); // json 응답 파싱
  })
  .then((data) => {
    console.log(data); // 응답 출력
  })
  .catch((error) => {
    console.error("에러 발생:", error); // 에러 처리
  });
