package com.hotelapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hotelapp.model.Category;
import com.hotelapp.model.Hotel;
import com.hotelapp.model.Item;

import aj.org.objectweb.asm.Type;

@SpringBootApplication
public class SpringDatajpaOnetomanyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetomanyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Item item1=new Item("Fried Rice",Category.FASTFOOD,"Chinese",Type.VE
		Item item2=new Item("Mushroom Noodles",Category.FASTFOOD,"Chinese",Type.VEG,120);
		Item item3=new Item("Vanilla Shake",Category.FASTFOOD,"Chinese",Type.VEG,200);
		Set<Item> items=new HashSet<>(Arrays.asList(item1,item2,item3));
		
		Hotel hotel=new Hotel("Mainland",Type.Veg,"Hyderbad",4.5,items);
		
		
		Item item4=new Item("Chicken Noodles",Category.FASTFOOD,"Chinese",Type.NONVEG,100);
		Item item5=new Item("Chicken Masala",Category.STARTERS,"NI",Type.VEG,120);
		Item item6=new Item("Chicken Biriyani",Category.MAINCOURSE,"Andra",Type.NONVEG,200);
		Set<Item> itemList1=new HashSet<item>(Arrays.asList(item4,item5,item6));
		
		Hotel hotel=new Hotel("Dragon King",Type.NONVEG,"Hyderbad",3itemsList1);
		
		hotelService.getAll().forEach(System.out::println); 
// @formatter:on
 
// @formatter:on

		
	}

}
