/**
 * 계절 알아맞추기
 * 3, 4, 5월: 봄
 * 6, 7, 8월: 여름
 * 9, 10, 11월: 가을
 * 12, 1, 2월: 겨울
 */

let curr_month = new Date().getMonth() + 1; // 3 (3월)
let answer = '';
switch (curr_month) {
  case 3:
  case 4:
  case 5:
    answer = '봄';
    break;
  case 6:
  case 7:
  case 8:
    answer = '여름';
    break;
  case 9:
  case 10:
  case 11:
    answer = '가을';
    break;
  case 12:
  case 1:
  case 2:
    answer = '겨울';
    break;
}
console.log('switch 사용:', answer);

if ([3, 4, 5].includes(curr_month)) {
  answer = '봄';
} else if ([6, 7, 8].includes(curr_month)) {
  answer = '여름';
} else if ([9, 10, 11].includes(curr_month)) {
  answer = '가을';
} else if ([12, 1, 2]) {
  answer = '겨울';
}
console.log('ifelseif 사용:', answer);

curr_month = 1;
if (curr_month == 3 || curr_month == 4 || curr_month == 5) {
  answer = '봄';
} else if (curr_month == 6 || curr_month == 7 || curr_month == 8) {
  answer = '여름';
} else if (curr_month == 9 || curr_month == 10 || curr_month == 11) {
  answer = '가을';
} else if (curr_month == 12 || curr_month == 1 || curr_month == 2) {
  answer = '겨울';
}
console.log('ifelseif 사용:', answer);
