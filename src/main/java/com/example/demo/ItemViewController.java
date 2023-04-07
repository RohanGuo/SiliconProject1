package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;


@RestController
@RequestMapping("/es-services")
public class ItemViewController {
	
	@Autowired
    private ItemViewServices itemService;

//    @GetMapping("/{sequence}/search")
//    public Item getProductInfo(@PathVariable String sequence, 
//            @RequestParam String sourceId, @RequestParam String logloc) {
//    	
//        return itemService.getProduct(sequence, sourceId, logloc);
//    }
    
    @GetMapping
    public List<Item> getAllItems() {
      return itemService.getAllItems();
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable long id) {
    	return itemService.getItemById(id);
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addItem(@RequestBody Item item) {
    	itemService.addItem(item);
    }
    
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateItem(@PathVariable long id, @RequestBody Item item) {
    	itemService.updateItem(id, item);
    }
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteItem(@PathVariable long id) {
    	itemService.deleteItem(id);
    }

}
