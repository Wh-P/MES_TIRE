package com.web.mes_tire.Lot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LotController {
	@Autowired(required=false)
	private LotService service;
	// http://localhost:3333/lot
	@GetMapping("lot")
	public String lot(Model d) {
		d.addAttribute("msg","모델테스트");
		return "lotList.html";
	} 
	@RequestMapping("ajaxMaterialList")
	public ResponseEntity<?> getMaterialList(Material sch){
		return ResponseEntity.ok(service.getMaterialList(sch));
	}
	@RequestMapping("ajaxProtypeList")
	public ResponseEntity<?> getProtypelList(Pro_type sch){
		return ResponseEntity.ok(service.getPtypeList(sch));
	}
	
	@RequestMapping("ajaxProList")
	public ResponseEntity<?> ajaxProList(@RequestParam("ptype") int ptype){
		return ResponseEntity.ok(service.getProductList(ptype));
	}
	
	@RequestMapping("ajaxInboundList")
	public ResponseEntity<?> getInboundList(@RequestParam("id") int id){
		return ResponseEntity.ok(service.getInboundList(id));
	}
	@RequestMapping("ajaxInbList")
	public ResponseEntity<?> getInbList(){
		return ResponseEntity.ok(service.getInbList());
	}
	@RequestMapping("ajaxOutbList")
	public ResponseEntity<?> getOutbList(){
		return ResponseEntity.ok(service.getOutbList());
	}
	
	@RequestMapping("ajaxOutboundList")
	public ResponseEntity<?> getOutboundList(@RequestParam("id") int id){
		return ResponseEntity.ok(service.getOutboundList(id));
	}
	
	@PostMapping("ajaxInsMat")
	public ResponseEntity<?> ajaxInsMat(Material ins){
		return ResponseEntity.ok(service.insMaterial(ins));
	}
	@PostMapping("ajaxInsPtype")
	public ResponseEntity<?> ajaxInsPtype(Pro_type ins){
		return ResponseEntity.ok(service.insPtype(ins));
	}
	// http://localhost:3333/lotDetail
	@GetMapping("lotDetail")
	public String lotDetail() {
		return "lotDetail.html";
	}
	 
	@RequestMapping("ajaxMatDetail")
	public ResponseEntity<?> ajaxMatDetail(@RequestParam("id") int id){
		return ResponseEntity.ok(service.getMaterial(id));
	}
	@RequestMapping("ajaxProDetail") 
	public ResponseEntity<?> ajaxProDetail(@RequestParam("id") int id){
		return ResponseEntity.ok(service.getProduct(id));
	}
	@RequestMapping("ajaxPtypeDetail")
	public ResponseEntity<?> ajaxPtypeDetail(@RequestParam("id") int id){
		return ResponseEntity.ok(service.getPtype(id));
	}
	@RequestMapping("ajaxInbDetail")
	public ResponseEntity<?> ajaxInbDetail(@RequestParam("id") int id){
		return ResponseEntity.ok(service.getInbound(id));
	}
	@RequestMapping("ajaxOutbDetail")
	public ResponseEntity<?> ajaxOutbDetail(@RequestParam("id") int id){
		return ResponseEntity.ok(service.getOutbound(id));
	}
	@GetMapping("deleteMat")
	public ResponseEntity<?> deleteMat(Material id){
		return ResponseEntity.ok(service.deleteMat(id));
	}
	
	@PostMapping("updateMat")
	public ResponseEntity<?> updateMat(Material upt){
		return ResponseEntity.ok(service.updateMat(upt));
	}
	
	// http://localhost:3333/bound
	@GetMapping("bound")
	public String bound() {
		return "boundList.html";
	}
	@PostMapping("ajaxInsInb")
	public ResponseEntity<?> ajaxInsInb(Material ins){
		return ResponseEntity.ok(service.insMaterial(ins));
	}
	@PostMapping("ajaxInsOutb")
	public ResponseEntity<?> ajaxInsOutb(Pro_type ins){
		return ResponseEntity.ok(service.insPtype(ins));
	}
	@RequestMapping("ajaxLog")
	public ResponseEntity<?> ajaxLog(){
		return ResponseEntity.ok(service.getLogList());
	}
}
