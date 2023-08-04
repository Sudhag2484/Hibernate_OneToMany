package in.sudha.dao;

import in.sudha.entities.CategoryEntity;

public interface CategoryDAO {

	void saveCategory(CategoryEntity entity);
	CategoryEntity fetchCategory(Integer cId);
	void deleteCategory(Integer cId);
}
