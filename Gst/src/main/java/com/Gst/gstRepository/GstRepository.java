package com.Gst.gstRepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Gst.gstEntity.Gst;




public interface GstRepository extends JpaRepository<Gst, Integer>{
	
	@Query(value="select * from prod_gst where hsn = ?",nativeQuery=true)
		public int gatByHsn(int hsn);
	
	@Query(value="select tax from prod_gst where hsn = ?",nativeQuery=true)
	public int getTaxByHsn(int hsn);
	
	@Query(value="select discount from prod_gst where hsn = ?",nativeQuery=true)
	public int getDiscountByHsn(int hsn);

}
