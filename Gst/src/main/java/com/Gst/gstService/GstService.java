package com.Gst.gstService;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Gst.gstDao.GstDao;
import com.Gst.gstEntity.Gst;

@Service
public class GstService {
	@Autowired
	GstDao gstDao;
	public String addGst(List<Gst>gst) {
		return gstDao.addGst(gst);
	}
	public int addGst(int hsn){
		return gstDao.addGst(hsn);
	}
	public int getbytax(int hsn) {
		return gstDao.getbytax(hsn);
	}
	public int getbydis(int hsn) {
		return gstDao.getbydis(hsn);
	}
	public List<Gst>getbytax(){
		return gstDao.gettax();
	}

}
