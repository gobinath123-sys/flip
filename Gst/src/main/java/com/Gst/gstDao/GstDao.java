package com.Gst.gstDao;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Gst.gstEntity.Gst;
import com.Gst.gstRepository.GstRepository;

@Repository
public class GstDao {
	@Autowired
	GstRepository gstRepo;
	public String addGst(List<Gst>gst) {
		gstRepo.saveAll(gst);
		return "saved successfully";
	}
	public int addGst(int hsn){
		return gstRepo.gatByHsn(hsn);
	}
	public int getbytax(int hsn) {
		return gstRepo.getTaxByHsn(hsn);
	}
	public int getbydis(int hsn) {
		return gstRepo.getDiscountByHsn(hsn);
	}
	public List<Gst>gettax(){
		return gstRepo.findAll();
	}

}
