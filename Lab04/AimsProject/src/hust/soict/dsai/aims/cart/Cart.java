package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	private int qtyOrdered = 0;
	public static final int MAX_NUMBER_ORDERED = 20;
	
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	
	//Add disc 
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBER_ORDERED) {
            System.out.println("The cart is full. Cannot add another item.");
            return;
        }
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("The disc has been added.");
    }
	
	/*public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		if (qtyOrdered + dvdList.length > MAX_NUMBER_ORDERED) {
			System.out.println("Total number of disc is more than capacity of the cart!");
		}
		for (int i = 0; i < dvdList.length;i++) {
			itemsOrdered[qtyOrdered] = dvdList[i];
			qtyOrdered++;
			System.out.println("The disc has been added.");
		}
	}*/
	
	//Try to add a method addDigitalVideoDisc which allows to pass an arbitrary number of arguments for dvd
	public void addDigitalVideoDisc(DigitalVideoDisc... discs) {
	    for (DigitalVideoDisc disc : discs) {
	        itemsOrdered[qtyOrdered] = disc;
	        qtyOrdered++;
	        System.out.println("The disc has been added.");
	    }
	}
	
	//2.2. Overloading by differing the number of parameters
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		itemsOrdered[qtyOrdered] = dvd1;
		System.out.println("The disc has been added.");
		qtyOrdered++;
		itemsOrdered[qtyOrdered] = dvd2;
		System.out.println("The disc has been added.");
		qtyOrdered++;
	}

	//Remove disc
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
	    boolean found = false;
	    for (int i = 0; i < qtyOrdered; i++) {
	        if (itemsOrdered[i].equals(disc)) {
	            found = true;
	            itemsOrdered[i] = null;
	            for (int j = i; j < qtyOrdered - 1; j++) {
	                itemsOrdered[j] = itemsOrdered[j + 1];
	            }
	            qtyOrdered--;
	            System.out.println("The disc has been removed.");
	            break;
	        }
	    }
	    if (!found) {
	        System.out.println("The disc was not found in the cart.");
	    }
	}
	
	//Get total cost
	public float totalCost() {
        float total = 0.0f;
        
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

	//Print cart method
	public void printCart() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i = 0 ; i < qtyOrdered; i++) {
			System.out.println((i+1) + itemsOrdered[i].toString());
		}
		System.out.println("Total cost: $" + totalCost());
		System.out.println("***************************************************");
	}

	//Search for DVDs in the cart by ID and display them
	//Notify to user if no match is found
	public void searchID(int id){
		boolean found = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].getId() == id) {
				found = true;
				System.out.println("DVD found: ");
				System.out.println(itemsOrdered[i].toString());
				break;
			}
		}
		if (!found) {
			System.out.println("No match is found!");
		}
	}

	//Search for DVDs in the cart by title and display them
	//Notify to user if no match is found
	public void searchTitle(String title){
		boolean found = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].getTitle().equals(title)) {
				found = true;
				System.out.println("DVD found: ");
				System.out.println(itemsOrdered[i].toString());
				break;
			}
		}
		if (!found) {
			System.out.println("No match is found!");
		}
	}
}
