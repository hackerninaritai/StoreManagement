package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Item;

@Mapper
public interface ItemMapper {

	public int insert(Item item);

	public List<Item> findAll();

	public List<Item> findByItemName(String itemName);
}
