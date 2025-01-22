package com.web.mes_tire.Lot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LotService {
	@Autowired(required=false)
	private LotDao dao;
	public List<Material> getMaterialList(Material sch){
		if(sch.getMname()==null) sch.setMname("");
		sch.setMname("%"+sch.getMname()+"%");
		return dao.getMaterialList(sch);
	}
	
	public List<Inbound> getInboundList(int id){
		return dao.getInboundList(id);
	}
	public List<Inbound> getInbList(){
		return dao.getInbList();
	}
	public List<Outbound> getOutbList(){
		return dao.getOutbList();
	}
	
	public List<Outbound> getOutboundList(int id){
		return dao.getOutboundList(id);
	}
	
	public String insMaterial(Material ins) {
		return dao.insertMaterial(ins)>0?"등록성공":"등록실패";
	}
	
	public String insPtype(Pro_type ins) {
		return dao.insertPtype(ins)>0?"등록성공":"등록실패";
	}
	
	public List<Pro_type> getPtypeList(Pro_type sch){
		if(sch.getPname()==null) sch.setPname("");
		sch.setPname("%"+sch.getPname()+"%");
		return dao.getPtypeList(sch);
	}
	
	public List<Product> getProductList(int ptype){
		return dao.getProductList(ptype);
	}
	
	public Material getMaterial(int id) {
		return dao.getMaterial(id);
	}
	public Product getProduct(int id) {
		return dao.getProduct(id);
	}
	public Pro_type getPtype(int id) {
		return dao.getPtype(id);
	}
	public Inbound getInbound(int id) {
		return dao.getInbound(id);
	}
	public Outbound getOutbound(int id) {
		return dao.getOutbound(id);
	}
	
	public String deleteMat(Material id) {
		return dao.deleteMaterial(id)>0?"삭제성공":"삭제실패";
	}
	public String updateMat(Material upt) {
		return dao.updateMaterial(upt)>0?"수정성공":"수정실패";
	}
	
	public List<Lot_log> getLogList(){
      return dao.getLogList();
   }
	
}
