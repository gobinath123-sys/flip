package com.Gst.gstControler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Gst.gstEntity.Gst;
import com.Gst.gstService.GstService;

@RestController
public class GstControler {
	@Autowired
	GstService gstSer;

	@PostMapping(value = "/addGst")
	public String addgst(@RequestBody List<Gst> gst) {
		return gstSer.addGst(gst);
	}

	@GetMapping(value = "/addGstdet/{hsn}")
	public int addGst(@PathVariable int hsn) {
		return gstSer.addGst(hsn);
	}

	@GetMapping(value = "/getTaxByHsn/{hsn}")
	public int getbytax(@PathVariable int hsn) {
		return gstSer.getbytax(hsn);
	}

	@GetMapping(value = "/getbydiscount/{hsn}")
	public int getbydis(@PathVariable int hsn) {
		return gstSer.getbydis(hsn);
	}

	@GetMapping(value = "/hi")
	public String hi() {
		return "HelloWorld";
	}
	@GetMapping(value = "/getbytax")
	public List<Gst> getbytax() {
		return gstSer.getbytax();
	}
}
