- sakila 및 world DB는 MySQL 설치 시 같이 다운로드 받음
- employees는 책에 나온 웹사이트(http://download.hanbit.co.kr/mariadb/10.3/employees.zip)에 들어가 
다운로드 및 압축 풀기를 진행한 후 다음 명령어들로 데이터베이스를 다운로드 받음

bash
$ cd employees
$ mysql -u root -p
mysql> source employees.sql;
mysql> use employees;
mysql> exit;