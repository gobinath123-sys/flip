package com.onesoft.car.Repository;

import java.util.List;   

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onesoft.car.Entity.Bike;


public interface BikeRepository extends JpaRepository<Bike,Integer>{
    @Query(value="select*from bike where brand like ?",nativeQuery=true)
    public List<Bike>getByBrand(String name);
    
    @Query(value="select*from bike where color like ?",nativeQuery=true)
    public List<Bike>getByColor(String color);
    
    @Query(value="select*from bike where cc<=300 and cc>=100",nativeQuery=true)
    public List<Bike>getByCc(int cc);
    
    @Query(value="select brand from bike where cc =?",nativeQuery=true)
    public List<String>getBrands(int cc);

}
