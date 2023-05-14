-- 과일로 만든 아이스크림 고르기

SELECT f.FLAVOR
from FIRST_HALF as f
         left JOIN ICECREAM_INFO as i on f.FLAVOR = i.FLAVOR
where TOTAL_ORDER > 3000
  and INGREDIENT_TYPE = 'fruit_based'
order by TOTAL_ORDER desc;