-- 공정1 : 혼합 테이블
CREATE TABLE process( -- 공정 테이블
	id NUMBER NOT null,--공정 아이디 1
	process_name varchar2(50),--공정명 2
	order_number NUMBER, --발주번호 3
	rubbera NUMBER,-- 고무A 4
	rubberb NUMBER,-- 고무B 5
	rubbera1 NUMBER(5,2),-- 고무A랜덤 범위 6
	rubberb1 NUMBER(5,2),-- 고무B랜덤 범위 7
	STARTDTE varchar2(100), -- 시작일 8
	ENDDTE varchar2(100), -- 종료일 9
	cnt NUMBER, -- 생산량 10
	typeno NUMBER, -- 예외 상황 번호 11
	line NUMBER NOT NULL -- 라인 식별 번호 12
);

DROP TABLE process;
SELECT * FROM PROCESS;
COMMIT;

DROP SEQUENCE cnt_SEQ;
DELETE  PROCESS;
CREATE SEQUENCE cnt_SEQ -- 생산량 시퀀스
START WITH 1
INCREMENT BY 1
NOCACHE;

CREATE SEQUENCE line_SEQ
START WITH 35
INCREMENT BY 1
NOCACHE;

INSERT INTO PROCESS VALUES(1,'혼합',5589,5,20, NULL, NULL,
	'2025-01-01','2025-01-10',cnt_seq.nextval,NULL,line_seq.nextval);

INSERT INTO PROCESS VALUES(2,'혼합',5589,5,20, NULL, NULL,
	'2025-01-02','2025-01-11',cnt_seq.nextval,NULL,line_seq.nextval);

INSERT INTO PROCESS VALUES(3,'혼합',5589,5,20, NULL, NULL,
	'2025-01-02','2025-01-11',cnt_seq.nextval,1,line_seq.nextval);
SELECT * FROM PROCESS;

SELECT SUM(cnt) FROM process;

-----------------------------
SELECT * FROM EXCEPTION_LOG; 
CREATE TABLE EXCEPTION_LOG ( -- 이상 상황 로그 
    ID              NUMBER NOT null,-- 공정아이디
    PROCESS_NAME    VARCHAR2(50) NOT NULL, -- 공정명
    EXCEPTION_TYPE  VARCHAR2(100) NOT NULL, -- 예외 유형
	typeno number
);

DROP TABLE EXCEPTION_LOG;
SELECT * FROM EXCEPTION_LOG;
INSERT INTO EXCEPTION_LOG values(1,'혼합','고무a가 많습니다',1);
INSERT INTO EXCEPTION_LOG values(1,'혼합','고무a가 적습니다',2);
INSERT INTO EXCEPTION_LOG values(1,'혼합','고무b가 많습니다',3);
INSERT INTO EXCEPTION_LOG values(1,'혼합','고무b가 많습니다',4);
INSERT INTO EXCEPTION_LOG values(1,'혼합','정상',5);
------------------------------------------

SELECT * FROM PROCESS p 

-- process의 모든 데이터 출력하고 EXCEPTION_LOG의 EXCEPTION_TYPE만 출력
SELECT p.*, e.EXCEPTION_TYPE
FROM PROCESS p , EXCEPTION_LOG e
WHERE p.TYPENO = e.TYPENO
AND line = 37;

-- 공정 아이디와 시퀀스를 조합하여 일련번호 만들기
SELECT id || '-A-' || TO_CHAR(line_seq.nextval) AS sjd, p.*
FROM process p;

---------------

SELECT * FROM process;
UPDATE PROCESS 
SET cnt = cnt+1
WHERE line = 37;
--------
-- 작업 지시사항 테이블 
SELECT * FROM PROCESS_INSTRUCTION; -

CREATE TABLE PROCESS_INSTRUCTION ( --작업 지시 사항
    ID           	NUMBER NOT null, -- 지시상항 아이디
    PROCESS_NAME    VARCHAR2(50) NOT NULL, -- 공정명 (혼합, 경화)
    INSTRUCTION     VARCHAR2(1000),         -- 작업 지시 사항
    SAFETY_RULES     VARCHAR2(1000),         -- 안전 규칙
    CREATED_BY      VARCHAR2(50)         -- 작성자 
);


CREATE SEQUENCE INS_SEQ
START WITH 1
INCREMENT BY 1
NOCACHE; -- 시퀀스 생성

INSERT INTO PROCESS_INSTRUCTION (ID, PROCESS_NAME, INSTRUCTION, SAFETY_RULES,
 CREATED_BY)
VALUES (INS_SEQ.NEXTVAL,'혼합', '재료 혼합 후 10분 대기', '안전모 착용 필수', '관리자A');

INSERT INTO PROCESS_INSTRUCTION (ID, PROCESS_NAME, INSTRUCTION, SAFETY_RULES,
 CREATED_BY)
VALUES (INS_SEQ.NEXTVAL,'경화', '작업 후 경화기 내부를 청소하고 온도를 안정화합니다',
		'증기가 발생하는 환경에서는 마스크와 보안경을 사용하세요', '관리자C');
SELECT * FROM PROCESS_INSTRUCTION;
COMMIT;

INSERT INTO PROCESS_INSTRUCTION 
values(1,'혼합', '재료 혼합 후 10분 대기', '안전모 착용 필수', '관리자A');

DROP TABLE PROCESS_INSTRUCTION;
--------------------------------------
-- 공정 2 : 경화 테이블 만들기
CREATE TABLE Hardening(
	id NUMBER UNIQUE,
	process_name varchar2(50),   
	order_number NUMBER,
	mass number(5,2),
	radius number(5,2),
	area number(5,2),
	tolerance number(5,2),
	pressure number(5,2),
	pressureRange number(5,2),
	tension number(5,2),
	omega number(5,2),
	cnt NUMBER,
	startdte1 varchar2(50),
	enddte1 varchar2(50),
	typeno NUMBER,
	line number
);
-- 경화
SELECT * FROM Hardening;
DELETE Hardening;
DROP TABLE Hardening;
INSERT INTO Hardening values(
	2,
	'경화',
	5595,
	2.0,
	0.5,
	0.1,
	0.1,
	NULL,
	NULL,
	NULL,
	NULL,
	1,
	'2025-01-04',
	'2025-01-14',
	1,
	line2_seq.nextval
	);
DROP SEQUENCE line2_seq;
CREATE SEQUENCE line2_SEQ
START WITH 90
INCREMENT BY 1
NOCACHE;

--private int id; // 1
--	private int process_name; // 2
--	private int order_number; // 3 발주서 조인
--	private double mass; // 4
--	private double radius; // 5
--	private double area; // 6
--	private double pressure; // 7
--	private double tension; // 8
--	private double omega; // 9
--	private int cnt; // 10 생산계획 조인
--	private String startdte1; // 11
--	private String enddte1; // 12
--	private int typeno; // 13 이상 상황 로그 조인
-- private int line; // 14






