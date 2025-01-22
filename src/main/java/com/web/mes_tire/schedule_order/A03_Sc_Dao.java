package com.web.mes_tire.schedule_order;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;




@Mapper
public interface A03_Sc_Dao {
    
	//schedule total
	
	//1공정 생산량
	@Select("SELECT SUM(CASE WHEN cnt <> 1 THEN cnt ELSE 0 END) AS total_cnt_one\r\n"
			+ "FROM process")
	List<Process_Yel> getYelOne(Process_Yel yel);
   
	//2공정 생산량
	@Select("SELECT SUM(CASE WHEN cnt <> 1 THEN cnt ELSE 0 END) AS total_cnt_two\r\n"
			+ "FROM HARDENING h")
	List<Process_Yel> getYelTwo(Process_Yel yel);
	
	// 불량검출율, 총 생산량
	@Select("SELECT ((v.ERROR1CNT+v.ERROR2CNT+v.ERROR3CNT)/v.TRYCNT+0.02) percentsum,\r\n"
			+ "round((1-(v.ERROR1CNT+v.ERROR2CNT+v.ERROR3CNT)/v.TRYCNT+0.02)*TRYCNT,0) totalyield\r\n"
			+ "FROM VISUALTEST v\r\n"
			+ "ORDER BY orderno")
	List<Process_Yel> getErrorandTotalYel(Process_Yel yel);
	
	//부자재 수량, 종류
	@Select("SELECT mname,total FROM MATERIAL")
	List<Process_Yel> getMaterial(Process_Yel yel);
	
	//invocie 테이블
	@Select("select * from invoice")
	List<Invoice> getInvoiceLists(Invoice ins);
	
	
	@Insert("Insert into invoice(invno, invemail, inv_startdate, inv_enddate, productid,pname,invcnt, invprice,empno)\r\n "
			+ "values(#{invno,jdbcType=VARCHAR},#{invemail,jdbcType=VARCHAR},\r\n"
			+ "#{inv_startdate,jdbcType=DATE},#{inv_enddate,jdbcType=DATE},\r\n"
			+ "#{productid,jdbcType=INTEGER},#{pname,jdbcType=VARCHAR},#{invcnt,jdbcType=INTEGER},\r\n"
			+ "#{invprice,jdbcType=DECIMAL},#{empno,jdbcType=INTEGER})")
	int insertInvoice(Invoice ins);
	
	
	@Select("Select * from invoice where invno=#{invno, jdbcType=VARCHAR}")
	List<Invoice> getInvoiceByInvno(Invoice ins);
	
	
	@Update("UPDATE invoice\r\n"
			+ "SET invemail = #{invemail,jdbcType=VARCHAR},\r\n"
			+ "    inv_startdate = #{inv_startdate,jdbcType=DATE},\r\n"
			+ "    inv_enddate =#{inv_enddate,jdbcType=DATE},\r\n"
			+ "    productid =#{productid,jdbcType=INTEGER},\r\n"
			+ "    pName =#{pname,jdbcType=VARCHAR},\r\n"
			+ "    invcnt = #{invcnt,jdbcType=INTEGER},\r\n"
			+ "    invprice = #{invprice,jdbcType=DECIMAL},\r\n"
			+ "    empno = #{empno,jdbcType=INTEGER}\r\n"
			+ "WHERE invno = #{invno,jdbcType=VARCHAR}")
	int updateInvoice(Invoice ins);
	
	@Delete("DELETE invoice \r\n"
			+ "  WHERE invno=#{invno,jdbcType=VARCHAR}")
	int DeleteInvoice(Invoice ins);
	
	 //purorder 테이블 
	
	
//	private int purno;  //발주번호
//	private String puremail; //이메일
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	private Date purdate;  // 발주일자
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	private Date deaddate;  // 납기일
//	private int purid;   //부자재 아이디
//	private int pursize;  // 부자재 사이즈
//	private int purcnt;   // 수량
//	private int purprice; // 단가
//	private int empno;  // 사원번호
	                                    //purno, puremail, purdate, deaddate, purid, invcnt, pursize,purcnt,purprice,empno
	
	@Select("select * from purorder")
	List<Purorder> getPurorderLists(Purorder order);
	
	@Insert("insert into purorder(purno, puremail, purdate, deaddate, purid,purname ,pursize,purcnt,purprice,empno) values(#{purno,jdbcType=VARCHAR},#{puremail,jdbcType=VARCHAR},#{purdate,jdbcType=DATE},\r\n"
			+ "#{deaddate,jdbcType=DATE},#{purid,jdbcType=INTEGER},#{purname,jdbcType=VARCHAR},#{pursize,jdbcType=INTEGER},#{purcnt,jdbcType=INTEGER},#{purprice,jdbcType=DECIMAL},#{empno,jdbcType=INTEGER})")
	int insertPurorder(Purorder order);
	
	@Select("Select * from purorder where purno=#{purno, jdbcType=VARCHAR}")
	List<Purorder> getPurorderByPurno(Purorder order);
	
	@Update("Update purorder \r\n"
			+ "SET  puremail=#{puremail,jdbcType=VARCHAR},\r\n"
			+ "     purdate=#{purdate,jdbcType=DATE},\r\n"
			+ "	    deaddate=#{deaddate,jdbcType=DATE},\r\n"
			+ "		purid=#{purid,jdbcType=INTEGER},\r\n"
			+ "		purName=#{purname,jdbcType=VARCHAR},\r\n"
			+ "		pursize=#{pursize,jdbcType=INTEGER},\r\n"
			+ "		purcnt=#{purcnt,jdbcType=INTEGER},\r\n"
			+ "		purprice=#{purprice,jdbcType=DECIMAL},\r\n"
			+ "		empno=#{empno,jdbcType=INTEGER}\r\n"
			+ "WHERE purno=#{purno,jdbcType=VARCHAR}")
	int UpdatePurorder(Purorder order);
	
	@Select("select * from mesemp")
	List<Mesemp> getMesempList(Mesemp mes);
	
	@Delete("Delete purorder "
			+ "where purno=#{purno,jdbcType=VARCHAR}")
	int DeletePurno(Purorder order);
	
	/*
	  invno varchar2(10) PRIMARY KEY NOT null,   
 invemail varchar2(50),
 inv_startdate Date,
 inv_enddate Date,
 productid number(10),
 invcnt number(10),
 invprice number(10,2),
 empno number(4) NOT null,
	 */
	
	// calendar
	
	@Select("SELECT id,title,writer,start1 \"start\",end1 \"end\","
			+ "content,backgroundColor,textcolor,allday FROM calendar_schedule")
	List<Calendar> getCalList(Calendar cal);
	
	
	
	 @Select("SELECT invno AS id, pName AS title , empno AS writer,\r\n "
	 		+ "inv_startdate AS \"start\", inv_enddate AS \"end\",\r\n"
	 		+ "'물건명:'||pName||' ,' ||'가격:'|| invprice||'원' ||','||' 갯수:'||invcnt ||'개' AS content, 1 as allday FROM INVOICE")
	 List<Calendar> getCalListByInvoice(Calendar cal); 
	
	 @Insert("INSERT INTO calendar_schedule (id, title, writer, start1, end1, content, backgroundColor, textColor, allDay) "
		        + "VALUES (#{id,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, #{writer,jdbcType=VARCHAR}, #{start,jdbcType=DATE}, #{end,jdbcType=DATE}, #{content,jdbcType=VARCHAR}, #{backgroundColor,jdbcType=VARCHAR}, #{textColor,jdbcType=VARCHAR}, #{allDay,jdbcType=INTEGER})")
		int insertCalendar(Calendar ins);

		
		@Update("UPDATE calendar_schedule \r\n"
				+ " SET title=#{title,jdbcType=VARCHAR},\r\n"
				+ "     writer=#{writer,jdbcType=VARCHAR},\r\n"
				+ "     start1=#{start,jdbcType=DATE},\r\n"
				+ "     end1=#{end,jdbcType=DATE},\r\n"
				+ "     content=#{content,jdbcType=VARCHAR},\r\n"
				+ "     backgroundColor=#{backgroundColor,jdbcType=VARCHAR},\r\n"
				+ "     textColor=#{textColor,jdbcType=VARCHAR},\r\n"
				+ "     allDay=#{allDay,jdbcType=INTEGER}\r\n"
				+ "  WHERE id=#{id,jdbcType=INTEGER}")
		int uptCalendar(Calendar ins);
		
		@Delete("DELETE calendar_schedule\r\n"
				+ "   WHERE id=#{id,jdbcType=INTEGER}")
		int delCal(Calendar ins);

}
