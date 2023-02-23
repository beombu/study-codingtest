## 상위 n개 레코드

### 문제에서 사용되는 문법
- order by 컬럼명 asc
- limit 1//상위 1개의 데이터를 가져온다

### sql 코드

SELECT name 

from animal_ins 

order by datetime asc limit 1;