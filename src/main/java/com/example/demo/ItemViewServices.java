package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ItemViewServices {
	
	@Autowired
    private ItemViewHelper itemViewHelper;
	
	@Autowired
	private ItemDAO itemDAO;
	
	
	public Product getProduct (String sequence, String sourceId, String logloc) {
		return itemDAO.getProduct(sequence, sourceId, logloc);
		
	}
	
	
	@Value("${walmart.es.service}")
    private String walmartEsService;

    public void showWalmartEsService() {
        // Use the value of walmartEsService variable here
        System.out.println("walmart.es.service = " + walmartEsService);
    }
	

}
