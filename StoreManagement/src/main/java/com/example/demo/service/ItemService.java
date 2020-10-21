package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Item;

public interface ItemService {

	public int insert(Item item);

	public List<Item> findAll();

	public List<Item> findByItemName(String itemName);

	public List<Item> findByItemId(Integer itemId);

}
