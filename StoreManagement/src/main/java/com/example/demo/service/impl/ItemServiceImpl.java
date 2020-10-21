package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ItemMapper;
import com.example.demo.domain.Item;
import com.example.demo.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemMapper itemMapper;

	@Override
	public int insert(Item item) {
		return itemMapper.insert(item);
	}

	@Override
	public List<Item> findAll() {
		return itemMapper.findAll();
	}

	@Override
	public List<Item> findByItemName(String itemName) {
		System.out.println("itemName in service: " + itemName);
		return itemMapper.findByItemName(itemName);
	}

	@Override
	public List<Item> findByItemId(Integer itemId) {
		return itemMapper.findByItemId(itemId);
	}

}
