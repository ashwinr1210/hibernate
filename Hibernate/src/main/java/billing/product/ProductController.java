package billing.product;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpRequest;

import com.fasterxml.jackson.annotation.JsonAutoDetect;



import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.ModelAttribute;

@RestController
@RequestMapping("/product")

public class ProductController {
	ProductService service=new ProductService();
	@RequestMapping(method=RequestMethod.GET)
		public JSONObject productList() {
			JSONObject json=new JSONObject();
			json=service.getProductList();
			return json;
		}
	
	@RequestMapping(method=RequestMethod.POST)
	public JSONObject addProductDetails(@ModelAttribute ProductModel productModel) {
		System.out.println("SUCCESSFULLY ENTERED");
		JSONObject json=new JSONObject();
		json=service.addProductDetails(productModel);
		return json;
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE)
	public String deleteBike(@RequestParam Integer productId) {
		String message=service.deleteProduct(productId);
		return message;
	}
	
}
