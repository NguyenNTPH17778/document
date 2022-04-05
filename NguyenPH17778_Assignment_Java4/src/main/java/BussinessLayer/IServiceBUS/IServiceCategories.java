package BussinessLayer.IServiceBUS;

import java.util.List;

import BussinessLayer.Entities.Category;

public interface IServiceCategories {
	public Category addCategory(Category entity) throws Exception;
	public Category UpdateCategory(Category entity) throws Exception;
	public Category DeleteCategory(Category entity) throws Exception;
	public List<Category> selectAll()throws Exception;
	public Category findCategory(int id);


}