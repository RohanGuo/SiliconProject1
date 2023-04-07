package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ItemViewServices {

	@Autowired
	private ItemViewHelper itemViewHelper;

	@Autowired
	private ItemDAO itemDAO;

	public List<Item> getAllItems() {
		return itemDAO.getAllItems();
	}

	public Item getItemById(long id) {
		return itemDAO.getItemById(id);
	}

	public void addItem(Item item) {
		itemDAO.addItem(item);
	}

	public void updateItem(long id, Item item) {
		itemDAO.updateItem(id, item);
	}

	public void deleteItem(long id) {
		itemDAO.deleteItem(id);
	}

	@Value("${walmart.es.service}")
	private String walmartEsService;

	public void showWalmartEsService() {
		// Use the value of walmartEsService variable here
		System.out.println("walmart.es.service = " + walmartEsService);
	}

}
