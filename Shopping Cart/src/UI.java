

import java.util.List;
import java.util.Scanner;


/**
 * @author Preeti
 *
 */
public class UI {

    Cart cart = new Cart();
    private int ch = 0;
    
    public UI () throws ShoppingCartException{
        menu();
    }
    
    public void startScreen () {
        System.out.println("1. Display Store Products");
        System.out.println("2. Display Cart");
        System.out.println("0. Exit");
    }
    
    public void storeProductsMenu() {
        System.out.println("1. Add to Cart");
        System.out.println("2. Remove From Cart");
        System.out.println("0. Exit");
    }
    
    public void menu () throws ShoppingCartException{
        do {
            startScreen();
            getUserInput();
            
            switch (ch) {
                case 1: 
                    displayStoreProducts();
                    storeProductsMenu();
                    getUserInput();
                    innerChoice1();
                    break;
                case 2:
                    showCart();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    
                    break;
            }
        } while (ch != 0);
    }

    public void innerChoice1() throws ShoppingCartException{
        switch (ch) {
            case 1:
                addProductToCart();
                showCart();
                break;
            case 2:
                removeProductFromCart();
                break;
            default:
                
                break;
        }
    }

    public int getUserInput() throws NumberFormatException {
        Scanner in = new Scanner (System.in);
        try
        {
        	ch = Integer.parseInt(in.nextLine());	
        }
        catch(NullPointerException ex)
        {
        	System.out.print("Null Pointer Exception been thrown");
        }
        catch(NumberFormatException ex){
        	System.out.print("Number Format Exception Caught");
        }
        
        return ch;
    }

    public void displayStoreProducts() {
        List<Product> products = new Products().getProducts();
        for (Product prod: products) {
            System.out.println(
                    prod.getPid() + "- " +
                            prod.getName() + " " +
                            prod.getPrice() + " " +
                            prod.getStock()
            );
        }
    }

    public void addProductToCart() throws ShoppingCartException {
        int pid = getUserInput();
        cart.addProductToCartByPID(pid);      
    }

    public void showCart() {
        cart.printCartItems();
    }

    public void removeProductFromCart() throws ShoppingCartException{
        int pid = getUserInput();
        cart.removeProductByPID(pid);
    }
}