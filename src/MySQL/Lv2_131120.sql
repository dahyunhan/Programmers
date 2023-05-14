-- 3월에 태어난 여성 회원 목록 출력하기

SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE_FORMAT(DATE_OF_BIRTH, '%Y-%m-%d') AS DATE_OF_BIRTH
from MEMBER_PROFILE
where DATE_FORMAT(DATE_OF_BIRTH, '%m') = '03'
  and GENDER = 'w'
  and TLNO!='NULL'
order by MEMBER_ID asc;