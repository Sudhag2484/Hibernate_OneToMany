package in.sudha.test;

import in.sudha.dao.impl.CategoryDAOImpl;
import in.sudha.entities.CategoryEntity;
import in.sudha.entities.ProductEntity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

import in.sudha.dao.CategoryDAO;

public class Tester {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
	CategoryDAO dao = new CategoryDAOImpl();
	/*
	//to save cat and prod in db
	CategoryEntity categoryEntity=new CategoryEntity();
	categoryEntity.setcId(101);
	categoryEntity.setcName("Electronics");
	
	
	ProductEntity p1=new ProductEntity();
	p1.setpId(201);
	p1.setpName("Mobile");

	File file = new File("C:\\Images\\mobile.jpg");
	byte[] imgBytes=new byte[(int)file.length()];
	
	FileInputStream fis = new FileInputStream(file);
	fis.read(imgBytes);
	p1.setProductImgs(imgBytes);
	
	
	ProductEntity p2=new ProductEntity();
	p2.setpId(202);
	p2.setpName("tv");

	File file2 = new File("C:\\Images\\tv.jpg");
	byte[] imgBytes2=new byte[(int)file2.length()];
	
	FileInputStream fis2 = new FileInputStream(file2);
	fis2.read(imgBytes2);
	p2.setProductImgs(imgBytes2);
	
	
	ProductEntity p3=new ProductEntity();
	p3.setpId(203);
	p3.setpName("Microoven");

	File file3 = new File("C:\\Images\\oven.jpg");
	byte[] imgBytes3=new byte[(int)file3.length()];
	
	FileInputStream fis3 = new FileInputStream(file3);
	fis3.read(imgBytes3);
	p3.setProductImgs(imgBytes3);
	
	//add ProductEntity instances to Collection.
	List<ProductEntity> lstOfProducts = Arrays.asList(p1,p2,p3);
	//set the collection to CategoryEntity instance
	categoryEntity.setLstOfProducts(lstOfProducts);
	
	dao.saveCategory(categoryEntity);
	
	*/
	
	
	/*
	//to get prod based on cId
	CategoryEntity cEntity = dao.fetchCategory(101);
	System.out.println("Category Name  : " + cEntity.getcName());
	List<ProductEntity>  lst = cEntity.getLstOfProducts();
	//read the first element of the list
	ProductEntity pEntity = lst.get(0);
	System.out.println("Product Id : "+ pEntity.getpId());
	System.out.println("Product Name : " + pEntity.getpName());
	byte[] bytesOfImage = pEntity.getProductImgs();
	File f1 = new File("C:\\ImageFromDB\\mobile_from_db.jpg");
	FileOutputStream fos = new FileOutputStream(f1);
	fos.write(bytesOfImage);
	System.out.println("Please check the image at : "+ f1.getAbsolutePath());
	
	*/
	
	dao.deleteCategory(101);
	}
}
