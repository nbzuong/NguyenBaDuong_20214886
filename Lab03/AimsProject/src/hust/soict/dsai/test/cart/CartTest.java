package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {

	public static void main(String[] args) {
		//Create a new cart
		Cart cart = new Cart();
		
		//Create new DVD objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
				"Animation", "Roger Allers", 87, 19.95f);
		cart.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		cart.addDigitalVideoDisc(dvd3);

		//Test the printCart method
		cart.printCart();

        //Test the search methods here
        cart.searchID(0);
        cart.searchID(2);
        cart.searchID(5);
        cart.searchTitle("Galaxy Wars");
        cart.searchTitle("The Lion King");
	}
}
