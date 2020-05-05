package billing.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="product_details")	

public class ProductModel {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
private  int productId;
	
	@Column(name = "product_name")	
private String productName;
	
	@Column(name = "product_price")
private int productPrice;
	
	@Column(name = "product_quantity")
private int productQuantity;
	
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getProductPrice() {
	return productPrice;
}
public void setProductPrice(int productPrice) {
	this.productPrice = productPrice;
}
public int getProductQuantity() {
	return productQuantity;
}
public void setProductQuantity(int productQuantity) {
	this.productQuantity = productQuantity;
}



}