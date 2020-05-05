package billing.product;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class ProductService {
	ProductDao dao= new ProductDao();
	@SuppressWarnings("unchecked")
	public JSONObject getProductList() {
		JSONObject finalObj=new JSONObject();
		try
		{
		List<ProductModel> details=dao.getProductList();
		if(details!=null&&details.size()!=0) {
			JSONObject json=null;
			JSONArray array=new JSONArray();
			for(ProductModel product:details) {
				json=new JSONObject();
				json.put("productId", product.getProductId());
				json.put("productName", product.getProductName());
				json.put("productPrice", product.getProductPrice());
				json.put("productQuantity", product.getProductQuantity());
		
				array.add(json);
			}
			finalObj.put("data", array);
			finalObj.put("status", "success");
		}
		}catch(Exception e) {
			finalObj.put("data", "");
			finalObj.put("status", "failure");
			e.printStackTrace();
		}
		return finalObj;
	}
	@SuppressWarnings("unchecked")
	public JSONObject addProductDetails(ProductModel productModel){
		JSONObject finalObj=new JSONObject();
		Integer value=dao.addProductDetails(productModel);

		if(value!=null&&value!=0) {
			finalObj.put("data","Details added Successfully");
			finalObj.put("status", "success");
		}else {
			finalObj.put("data","Error occured while adding details");
			finalObj.put("status", "success");
		}
			
		return finalObj;
		
	}
	public String deleteProduct(Integer productId) {
		dao.deleteProduct(productId);
		return "Deleted Successfully";
	}
}
