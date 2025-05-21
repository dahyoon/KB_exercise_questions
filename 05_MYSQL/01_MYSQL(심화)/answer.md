## 테스트 DB 구축

### world DB의 각 테이블의 구조

#### 1. city 테이블

| 컬럼명      | 데이터타입 | PK  | NN  | UN  | 기본값 | 설명                   |
| ----------- | ---------- | --- | --- | --- | ------ | ---------------------- |
| ID          | INT        | o   | o   | o   | NULL   | 기본키, AUTO_INCREMENT |
| Name        | CHAR(35)   |     | o   |     | ''     | 이름                   |
| CountryCode | CHAR(3)    |     | o   |     | ''     | 나라 코드, MUL 키      |
| District    | CHAR(20)   |     | o   |     | ''     | 지역                   |
| Population  | INT        |     | o   |     | 0      | 인구                   |

---

#### 2. country 테이블

| 컬럼명         | 데이터타입                                                                            | PK  | NN  | UN  | 기본값 | 설명   |
| -------------- | ------------------------------------------------------------------------------------- | --- | --- | --- | ------ | ------ |
| Code           | CHAR(3)                                                                               | o   | o   | o   | ''     | 기본키 |
| Name           | CHAR(52)                                                                              |     | o   |     | ''     | 국가명 |
| Continent      | ENUM('Asia','Europe','North America','Africa','Oceania','Antarctica','South America') |     | o   |     | 'Asia' |        |
| Region         | CHAR(26)                                                                              |     | o   |     | ''     |        |
| SurfaceArea    | DECIMAL(10,2)                                                                         |     | o   |     | 0.00   |        |
| IndepYear      | SMALLINT                                                                              |     |     |     | NULL   |        |
| Population     | INT                                                                                   |     | o   |     | 0      |        |
| LifeExpectancy | DECIMAL(3,1)                                                                          |     |     |     | NULL   |        |
| GNP            | DECIMAL(10,2)                                                                         |     |     |     | NULL   |        |
| GNPOld         | DECIMAL(10,2)                                                                         |     |     |     | NULL   |        |
| LocalName      | CHAR(45)                                                                              |     | o   |     | ''     |        |
| GovernmentForm | CHAR(45)                                                                              |     | o   |     | ''     |        |
| HeadOfState    | CHAR(60)                                                                              |     |     |     | NULL   |        |
| Capital        | INT                                                                                   |     |     |     | NULL   |        |
| Code2          | CHAR(2)                                                                               |     | o   |     | ''     |        |

---

#### 3. countrylanguage 테이블

| 컬럼명      | 데이터타입     | PK  | NN  | UN  | 기본값 | 설명   |
| ----------- | -------------- | --- | --- | --- | ------ | ------ |
| CountryCode | CHAR(3)        | o   | o   |     | ''     | 기본키 |
| Language    | CHAR(30)       | o   | o   |     | ''     | 기본키 |
| IsOfficial  | ENUM('T', 'F') |     | o   |     | 'F'    |        |
| Percentage  | DECIMAL(4, 1)  |     | o   |     | 0.0    |        |

---

### employees DB의 각 테이블의 구조

#### 1. departments 테이블

| 컬럼명    | 데이터타입  | PK  | NN  | UN  | 기본값 | 설명     |
| --------- | ----------- | --- | --- | --- | ------ | -------- |
| dept_no   | CHAR(4)     | o   | o   | o   | NULL   | 부서번호 |
| dept_name | VARCHAR(40) |     | o   |     | NULL   | 부서명   |

---

#### 2. dept_emp 테이블

| 컬럼명    | 데이터타입 | PK  | NN  | UN  | 기본값 | 설명                     |
| --------- | ---------- | --- | --- | --- | ------ | ------------------------ |
| emp_no    | INT        | o   | o   | o   | NULL   | 사원번호                 |
| dept_no   | CHAR(4)    | o   | o   | o   | NULL   | 부서번호                 |
| from_date | DATE       |     | o   |     | NULL   | 해당 부서에서의 시작일   |
| to_date   | DATE       |     | o   |     | NULL   | 해당 부서에서의 마지막일 |

---

#### 3. dept_manager 테이블

| 컬럼명    | 데이터타입 | PK  | NN  | UN  | 기본값 | 설명                     |
| --------- | ---------- | --- | --- | --- | ------ | ------------------------ |
| dept_no   | CHAR(4)    | o   | o   | o   | NULL   | 부서번호                 |
| emp_no    | INT        | o   | o   | o   | NULL   | 관리자 사원번호          |
| from_date | DATE       |     | o   |     | NULL   | 해당 부서에서의 시작일   |
| to_date   | DATE       |     | o   |     | NULL   | 해당 부서에서의 마지막일 |

---

#### 4. employees 테이블

| 컬럼명     | 데이터타입     | PK  | NN  | UN  | 기본값 | 설명      |
| ---------- | -------------- | --- | --- | --- | ------ | --------- |
| emp_no     | INT            | o   | o   | o   | NULL   | 사원 번호 |
| birth_date | DATE           |     | o   |     | NULL   | 생년월일  |
| first_name | VARCHAR(14)    |     | o   |     | NULL   | 이름      |
| last_name  | VARCHAR(16)    |     | o   |     | NULL   | 성        |
| gender     | ENUM('M', 'F') |     | o   |     | NULL   | 성별      |
| hire_date  | DATE           |     | o   |     | NULL   | 입사일    |

---

#### 5. salaries 테이블

| 컬럼명    | 데이터타입 | PK  | NN  | UN  | 기본값 | 설명               |
| --------- | ---------- | --- | --- | --- | ------ | ------------------ |
| emp_no    | INT        | o   | o   | o   | NULL   | 사원번호           |
| salary    | INT        |     | o   |     | NULL   | 월급               |
| from_date | DATE       | o   | o   | o   | NULL   | 해당 급여 시작일   |
| to_date   | DATE       |     | o   |     | NULL   | 해당 급여 마지막일 |

---

#### 5. titles 테이블

| 컬럼명    | 데이터타입  | PK  | NN  | UN  | 기본값 | 설명   |
| --------- | ----------- | --- | --- | --- | ------ | ------ |
| emp_no    | INT         | o   | o   | o   | NULL   | 기본키 |
| title     | VARCHAR(50) | o   | o   | o   | NULL   | 기본키 |
| from_date | DATE        | o   | o   | o   | NULL   | 기본키 |
| to_date   | DATE        |     |     |     | NULL   |        |
