package com.fastfood.fastfood.services;

import com.fastfood.fastfood.entities.Category;
import com.fastfood.fastfood.entities.Item;
import com.fastfood.fastfood.entities.SubCategory;
import com.fastfood.fastfood.entities.User;

import java.util.List;

public interface AdminService {

	//void addItem(MultipartFile file, String user_name,int subCategory, Item item) throws IOException;

	Item addItem(String user_name, int subCategory, Item item);
	
	User getUserDetails(String username);

	SubCategory getSubCategory(int subCategory);

	Category addCategory(String admin, Category category);

	SubCategory addSubCategory(int category, SubCategory subCategory);

	boolean editCategory(String adminId, Category category);

	boolean deleteCategory(int categoryId);

	boolean deleteSubCategory(int subCategoryId);

	boolean editItem(Item item);

	boolean deleteItem(int itemId);

	boolean editSubCategory( SubCategory subCategory);

	Item getItem(int itemId);
	
	Category getCategory(int category);

	void updateOrderStatus(int orderId, String orderStatus);

	List<Item> getAllSearchItems(String adminId, String searchText);

//	void sendEmail(String emailId);

	List<SubCategory> getSubCategories(String adminId);

	List<Category> getCategories(String username);

	List<Item> getItems(String adminId);


	boolean updateActiveStatus(int itemId, String status);

}














//
//
//Item getImageDetails(String imageName);
//
//void uploadImage(MultipartFile file) throws IOException;
//
//
//int getRecentItemId();
