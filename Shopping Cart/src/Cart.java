import java.util.ArrayList;
import java.util.List;


/**
 * @author Preeti
 *
 */
public class Cart  {
	 List<Product> cartItems = new ArrayList<Product>();
	    
	    /**
	     * @param pid
	     */
	    public void addProductToCartByPID(int pid) throws ShoppingCartException {
	        Product product = getProductByProductID(pid);
	        addToCart(product);
	    }

	    /**
	     * @param pid
	     * @return
	     */
	    private Product getProductByProductID(int pid) throws ShoppingCartException{
	        Product product = null;
	        List<Product> products = new Products().getProducts();
	        for (Product prod: products) {
	            if (prod.getPid() == pid) {
	                product = prod;
	                break;
	            }
	        }
	        return product;
	    }
	    /**
	     * @param product
	     */
	    public void addToCart(Product product) throws ShoppingCartException{
	        cartItems.add(product);
	    }

	    /**
	     * @param pid
	     */
	    public void removeProductByPID(int pid) throws ShoppingCartException{
	        Product prod = getProductByProductID(pid);
	        cartItems.remove(prod);
	    }

	    /**
	     * 
	     */
	    void printCartItems() {
	        for (Product prod: cartItems) {
	            System.out.println(prod.getName());
	        }
	    }
}
