package com.example.demo.sql;

import org.apache.ibatis.jdbc.SQL;

public class ComplicateSql {

	public String select1() {
		return new SQL() {
			{
				SELECT("123");
				FROM("item");
				WHERE("item_id = 1");
			}
		}.toString();
	}
}
