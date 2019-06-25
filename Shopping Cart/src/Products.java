import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Preeti
 *
 */
public class Products {
	
	private final List<Product> products=new ArrayList<Product>();
	public Products()
	{
		this.initialiStore();
	}
	
	public List<Product> getProducts() {
        return products;
    }
	
	public void initialiStore() {
        String [] productNames = {"Bananas", "Oranges", "Apples", "Lemons","Peaches"};
        Double [] productPrice = {40.00d, 60.00d, 100.00d,4.00d,60.0d};
        Integer [] stock = {10, 6, 10,15,20};
        
        for (int i=0; i < productNames.length; i++) {
            this.products.add(new Product(i+1, productNames[i], productPrice[i], stock[i]));
        }
    }
}
