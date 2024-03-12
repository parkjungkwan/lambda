SELECT * FROM player;
SELECT * FROM team;
-- 001. 전체 축구팀 목록을 팀이름 오름차순으로 출력하시오
SELECT * FROM TEAM ORDER BY team_name;
-- 002. 플레이어의 포지션 종류를 나열하시오.
단 중복은 제거하고, 포지션이 없으면 빈공간으로 두시오
SELECT DISTINCT POSITION FROM player;
-- 003. 플레이어의 포지션 종류를 나열하시오.
단 중복은 제거하고, 포지션이 없으면 '신입' 으로 기재하시오
 SELECT DISTINCT IFNULL(NULLIF(POSITION, ''), '신입') FROM player;
-- 004. 수원팀에서 골키퍼(GK)의 이름을 모두 출력하시오.
단 수원팀 ID는 K02 입니다.
SELECT * FROM player
WHERE POSITION = 'GK' AND team_id = 'K02';
-- 004-1. 수원팀에서 골키퍼(GK)의 이름을 모두 출력하시오. (ID 모를 경우)
SELECT * FROM player
WHERE POSITION = 'GK'
      AND team_id = (SELECT team_id
		               FROM team
							WHERE  region_name = '수원');
-- 005. 수원팀에서 성이 고씨이고 키가 170 이상인 선수를 출력하시오.
-- 단 수원팀 ID는 K02 입니다.
SELECT * FROM player
WHERE height >= 170 AND team_id = 'k02'
	AND player_name LIKE '고%';
-- 005-1. 수원팀에서 성이 고씨이고
-- 키가 170 이상인 선수를 출력하시오. (ID 모를 경우)
