package BussinessLayer.ServiceBUS;

import java.util.List;

import BussinessLayer.Entities.Product;
import BussinessLayer.IServiceBUS.IServiceProduct;

public class ServiceDAO_Product implements IServiceProduct{
	DataAccessLayer.ServiceProduct pro;
	@Override
	public Product addProduct(Product entity) throws Exception {
		// TODO Auto-generated method stub
		return pro.addProduct(entity);
	}

	@Override
	public Product UpdateProduct(Product entity) throws Exception {
		// TODO Auto-generated method stub
		return pro.UpdateProduct(entity);
	}

	@Override
	public Product DeleteCategory(Product entity) throws Exception {
		// TODO Auto-generated method stub
		return pro.DeleteCategory(entity);
	}

	@Override
	public List<Product> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return pro.selectAll();
	}

	@Override
	public Product findProduct(int id) {
		// TODO Auto-generated method stub
		return pro.findProduct(id);
	}

}
