## 샘플 데이터베이스 설치

### 1. 기본 제공 DB (sakila, world)

- `sakila` 및 `world` 데이터베이스는 **MySQL 설치 시 같이 다운로드 받음**

---

### 2. employees 데이터베이스 설치

- `employees` DB는 아래 웹사이트에서 직접 다운로드 받음
  [http://download.hanbit.co.kr/mariadb/10.3/employees.zip](http://download.hanbit.co.kr/mariadb/10.3/employees.zip)

- 다운로드 후 압축을 풀고, 다음 명령어를 차례대로 실행함:

```bash
$ cd employees
$ mysql -u root -p
mysql> source employees.sql;
mysql> use employees;
mysql> exit;
```
