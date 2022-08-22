package com.datapack.repository;

import javax.swing.tree.RowMapper;

public class DataMapper implements RowMapper<DataPack> {
	
	
	String brand=rs.getString("brand");
	String type=rs.getString("type");
	int duration=rs.getInt("");
	double price=rs.getDouble("");
	int id=rs.getInt("");
	
	Datapack datapack=new Datapack();
	datapack.setbrand(name);
	datapack.getType(type);
	datapack.setDuration(duration);
	datapack.setPrice(price);
	datapack.setId(id);
	return datapack;
	

}
