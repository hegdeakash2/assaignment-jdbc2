package com.datapack.repository;

import java.util.List;

import javax.swing.tree.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.datapack.model.DataPack;

import comdatapack.util.DBQueries;


@Repository
public class DataPackRepositoryImpl implements IDataPackRepository {
	private JdbcTemplate jdbctemplate;
	
	@Autowired
	public void setjdbctemplate(jdbcTemplate jdbctemplate) {
		this.jdbctemplate=jdbctemplate;
	}

	@Override
	public void addDatapack(DataPack dataPack) {
	Object[] dataArray= {
			dataPack.getBrand(),dataPack.getId(),dataPack.getDuration(),dataPack.getPrice(),dataPack.getType()
	};
	jdbctemplate.update(DBQueries.INSERTQUERY.dataArray);
		
	}

	@Override
	public void updateDatapack(double price, int id) {
		String sql=DBQueries.UPDATEQUERY;
		jdbctemplate.update(sql,price,id);
		
	}

	@Override
	public void deleteDatapack(int id) {
		String sql=DBQueries.UPDATEQUERY;
		jdbctemplate.update(DBQueries.DELETEQUERY,id);
		
	}

	@Override
	public List<DataPack> findAll() {
		RowMapper<DataPack>mapper=new DataMapper();
		List<DataPack>datapack=jdbctemplate.query(DBQueries.SELECTQUERY,mapper);
		
	}

	@Override
	public List<DataPack> findByBrand(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DataPack> findByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DataPack> findByDuration(int duration) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DataPack> findByPrice(double price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataPack findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
