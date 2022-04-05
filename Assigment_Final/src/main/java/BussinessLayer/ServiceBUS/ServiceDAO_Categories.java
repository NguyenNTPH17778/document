package BussinessLayer.ServiceBUS;

import java.util.List;

import BussinessLayer.Entities.Category;
import BussinessLayer.IServiceBUS.IServiceCategories;

public class ServiceDAO_Categories  implements IServiceCategories{
	DataAccessLayer.ServiceCategories cate;
	@Override
	public Category addCategory(Category entity) throws Exception {
		return cate.addCategory(entity);
	}

	@Override
	public Category UpdateCategory(Category entity) throws Exception {
		// TODO Auto-generated method stub
		return cate.UpdateCategory(entity);
	}

	@Override
	public Category DeleteCategory(Category entity) throws Exception {
		// TODO Auto-generated method stub
		return cate.DeleteCategory(entity);
	}

	@Override
	public List<Category> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return cate.selectAll();
	}

	@Override
	public Category findCategory(int id) {
		// TODO Auto-generated method stub
		return cate.findCategory(id);
	}

}
