package hust.soict.dsai.aims;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.cart.*;

public class Aims {

	public static void main(String[] args) {
		//Create a new cart
		Cart anOrder = new Cart();
		
		//Create new DVD objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
				"Animation", "Roger Allers", 87, 19.95f);
		//anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		//anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		//anOrder.addDigitalVideoDisc(dvd3);
		
		//Test the method addDigitalVideoDisc which allows to pass an arbitrary number of arguments for dvd
		anOrder.addDigitalVideoDisc(dvd1, dvd2, dvd3);
		
		//Test setting ID for disc exercise 5
		System.out.println(dvd1.getId());
		System.out.println(dvd2.getId());
		
		//To check if the remove method runs properly
		anOrder.removeDigitalVideoDisc(dvd2);
		anOrder.removeDigitalVideoDisc(dvd2);
		
		//Print total cost of the items in the cart
		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());
		
	}
}
