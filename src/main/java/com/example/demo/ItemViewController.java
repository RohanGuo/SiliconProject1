package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/es-services")
public class ItemViewController {
	
	@Autowired
    private ItemViewServices productService;

    @GetMapping("/{sequence}/search")
    public Product getProductInfo(@PathVariable String sequence, 
            @RequestParam String sourceId, @RequestParam String logloc) {
    	
        return productService.getProduct(sequence, sourceId, logloc);
    }

}
