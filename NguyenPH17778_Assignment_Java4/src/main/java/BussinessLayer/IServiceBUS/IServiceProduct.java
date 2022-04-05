package BussinessLayer.IServiceBUS;

import java.util.List;

import BussinessLayer.Entities.Product;


public interface IServiceProduct {
	public Product addProduct(Product entity) throws Exception;
	public Product UpdateProduct(Product entity) throws Exception;
	public Product DeleteCategory(Product entity) throws Exception;
	public List<Product> selectAll()throws Exception;
	public Product findProduct(int id);
	
}