CREATE TABLE mesemp(
   empno number(4) PRIMARY KEY NOT null,
   mgr number(4),
   auth varchar2(50),
   job varchar2(50),
   ename varchar2(50),
   pnumber varchar2(100),
   pwd number(4),   
   dept varchar2(50),
   deptno number(10)    
);

UPDATE EMP 
  
SELECT * FROM MESEMP;

DROP TABLE MESEMP;

DROP SEQUENCE mesemp_seq;

CREATE SEQUENCE mesemp_seq
   START WITH 1000
   INCREMENT BY 1;
   
INSERT INTO mesemp values(mesemp_seq.nextval,1000,'관리자','팀장',
'홍길동','010-1234-5642',7777,'생산',1000);

INSERT INTO mesemp values(mesemp_seq.nextval,1003,'일반 사용자','사원',
'홍길동','010-1234-5642',7777,'생산',1000);

INSERT INTO mesemp values(mesemp_seq.nextval,1010,'일반 사용자','대리',
'김대동','010-2234-5642',8888,'생산',1010);

SELECT * FROM mesemp;

SELECT * FROM mesemp WHERE auth LIKE '일반 사용자' AND job LIKE '대리' ;
/*
SELECT * FROM mesemp WHERE mgr LIKE #{mgr} and job like #{job}
 * */
SELECT * FROM mesemp;
SELECT constraint_name, table_name, column_name
FROM user_cons_columns
WHERE constraint_name = 'SYS_C007616';

DELETE FROM PURORDER  WHERE empno=1010;
DROP TABLE PURORDER;

CREATE TABLE purorder(
   purno number(10,0) PRIMARY KEY NOT null,
   puremail varchar2(50),
   purdate date,
   deaddate date,
   purid number(4),
   purName varchar2(50),
   pursize number(20),
   purcnt number(10),
   purprice number(10,2),
   empno number(4) NOT null,
   FOREIGN KEY (empno) REFERENCES mesemp(empno)
);

ALTER TABLE PURORDER DROP CONSTRAINT SYS_C0012345; 

DROP TABLE PURORDER;

SELECT  * FROM PURORDER ;




INSERT INTO PURORDER values('20250110','gdong@gamil.com',
'2024-12-24','2025-01-30',001,'고무A',100,10000,50000,mesemp_seq.currval);

INSERT INTO PURORDER values('20250112','gdong@gamil.com',
'2024-12-24','2025-01-30',001,'고무B',100,6000,25000,mesemp_seq.currval);

INSERT INTO PURORDER values('20250113','gdong@gamil.com',
'2024-12-24','2025-01-30',001,'경화제',50,200,10000,mesemp_seq.currval);

SELECT * FROM invoice;

DROP TABLE invoice;

CREATE TABLE invoice(
   invno number(10,0) PRIMARY KEY NOT null,   
   invemail varchar2(50),
   inv_startdate Date,
   inv_enddate Date,
   productid number(10),
   pName varchar2(50),
   invcnt number(10),
   invprice number(10,2),
   empno number(4) NOT null,
   FOREIGN KEY (empno) REFERENCES mesemp(empno)
);
/*
 @Select("SELECT invno AS id, pName AS title , empno AS writer, inv_startdate AS start1, inv_enddate AS end1,'물건명:'||pName||' ,' ||'가격:'|| invprice ||','||'갯수:'||invcnt  AS content FROM INVOICE ; 
")
  List<calendar> getCalListByInvoice(calendar cal); 
 */

SELECT invno AS id, pName AS title , empno AS writer, inv_startdate AS start1, inv_enddate AS end1,'물건명:'||pName||' ,' ||'가격:'|| invprice ||'원' ||','||' 갯수:'||invcnt ||'개' AS content FROM INVOICE;

INSERT INTO invoice values('20250110','gdong@gamil.com',
sysdate,sysdate,001,100,50000,mesemp_seq.currval);


UPDATE invoice
SET invemail = #{INVEMAIL,jdbcType=VARCHAR},
    inv_startdate = #{inv_startdate,jdbcType=DATE},
    inv_enddate =#{inv_enddate,jdbcType=DATE},
    productid =#{productid,jdbcType=INTEGER},
    invcnt = #{invcnt,jdbcType=INTEGER},
    invprice = #{invprice,jdbcType=INTEGER},
    empno = #{empno,jdbcType=INTEGER},
WHERE invno = #{invno,jdbcType=VARCHAR};


ALTER TABLE invoice MODIFY inv_startdate DATE;
ALTER TABLE invoice MODIFY inv_enddate DATE;

UPDATE invoice
SET inv_startdate = TO_DATE(inv_startdate, 'YYYY-MM-DD'),
    inv_enddate = TO_DATE(inv_enddate, 'YYYY-MM-DD');

SELECT * FROM invoice;

DELETE invoice 
  WHERE invno='11';
/*
 @Insert("INSERT INTO mesemp values(#{empno},
 #{mgr},#{auth},#{job},
 #{ename},#{pnumber},#{id},
 #{pwd},#{dept},#{deptno})")
   int insert Mesemp(Mesemp ins);
 * */

CREATE TABLE calendar_schedule(
        id number(4) primary key,
 		title varchar2(100),
 		writer varchar2(50),
 		start1 Date, 
 		end1 Date,
 		content varchar2(1000),
 		backgroundColor varchar2(50),
 		textcolor varchar2(50),
 		allday number(1)
);

DROP TABLE calendar_schedule;

SELECT * FROM CALENDAR_SCHEDULE;

--2공정 총 생산량
SELECT SUM(CASE WHEN cnt <> 1 THEN cnt ELSE 0 END) AS total_cnt_two
FROM HARDENING h;

--1공정 총 생산량
SELECT SUM(CASE WHEN cnt <> 1 THEN cnt ELSE 0 END) AS total_cnt_one
FROM process;

SELECT * FROM PROCESS;

--불량 검출 갯수,제품 총 생산량
SELECT ((v.ERROR1CNT+v.ERROR2CNT+v.ERROR3CNT)/v.TRYCNT+0.02) percentsum,
round((1-(v.ERROR1CNT+v.ERROR2CNT+v.ERROR3CNT)/v.TRYCNT+0.02)*TRYCNT,0) totalyield
FROM VISUALTEST v
ORDER BY orderno;

--부자재 총 수량
SELECT mname,total FROM MATERIAL;