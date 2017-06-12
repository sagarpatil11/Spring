package com.bridgeit.spring.Stock.Bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgeit.spring.Stock.Dao.StockDao;
import com.bridgeit.spring.Stock.Model.Stock;

@Service("stockBo")
public class StockBoImpl implements StockBo
{

	@Autowired
	StockDao stockdao;
	
	public void save(Stock stock) 
	{
		// TODO Auto-generated method stub
		stockdao.save(stock);
	}

}
