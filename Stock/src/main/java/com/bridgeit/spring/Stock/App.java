package com.bridgeit.spring.Stock;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.spring.Stock.Bo.StockBo;
import com.bridgeit.spring.Stock.Model.Stock;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	
    	StockBo stockBo=(StockBo) context.getBean("stockBo");
    	
    	Stock stock=new Stock();
    	stock.setS_name("Tata");
    	stock.setS_code("T01");
    	
    	stockBo.save(stock);
    	System.out.println("Done");
    }
}
