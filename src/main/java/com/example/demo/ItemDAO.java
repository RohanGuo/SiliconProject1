package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ItemDAO {

	private Map<Long, Item> itemMap = new HashMap<>();

//	public Item getProduct(String sequence, String sourceId, String logloc) {
//		// TODO Auto-generated method stub
//		return new Item();
//	}

	public ItemDAO() {
		Item item1 = new Item(1L, 102L, "San Fan");
		Item item2 = new Item(2L, 102L, "Chicago");
		Item item3 = new Item(3L, 102L, "New York");
		itemMap.put(item1.getId(), item1);
		itemMap.put(item2.getId(), item2);
		itemMap.put(item3.getId(), item3);
	}

	public List<Item> getAllItems() {
		return new ArrayList<>(itemMap.values());
	}

	public Item getItemById(long id) {
		return itemMap.get(id);
	}

	public void addItem(Item item) {
		item.setId(getNextId());
		itemMap.put(item.getId(), item);
	}

	public void updateItem(long id, Item item) {
		item.setId(id);
		itemMap.put(id, item);
	}

	public void deleteItem(long id) {
		itemMap.remove(id);
	}

	private long getNextId() {
		return itemMap.keySet().stream().max(Long::compare).orElse(0L) + 1;
	}
}
