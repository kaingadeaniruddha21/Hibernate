package com.training.onetoonesample;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.training.onetoonesample.dao.StockDao;
import com.training.onetoonesample.model.Stock;
import com.training.onetoonesample.model.Stock_Details;

public class OneToOneSample {
	public static void main(String[] args) {
	String date = "28-01-2022";
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDate listedDate = LocalDate.parse(date,formatter);
	
	Stock st = new Stock("dsds",3443L);
    
    Stock_Details std = new Stock_Details("samsung","samsungcom","bestcompany",listedDate);
    st.setStock_detils(std);
    
    StockDao sdao = new StockDao();
    sdao.stockSave(st);
    
}
	



}