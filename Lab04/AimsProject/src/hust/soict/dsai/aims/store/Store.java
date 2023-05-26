package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int itemCount;

    public Store() {
        itemsInStore = new DigitalVideoDisc[100];
        itemCount = 0;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (itemCount < itemsInStore.length) {
            itemsInStore[itemCount] = dvd;
            itemCount++;
            System.out.println(dvd + " added to the store.");
        } 
        else {
            System.out.println("The store is full. Cannot add more dvd.");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
	    boolean found = false;
	    for (int i = 0; i < itemCount; i++) {
	        if (itemsInStore[i].equals(dvd)) {
	            found = true;
	            itemsInStore[i] = null;
	            for (int j = i; j < itemCount - 1; j++) {
	                itemsInStore[j] = itemsInStore[j + 1];
	            }
	            itemCount--;
	            System.out.println("The item" + dvd + " has been removed.");
	            break;
	        }
	    }
	    if (!found) {
	        System.out.println("Could not find the item" + dvd + " in the cart.");
	    }
	}
}
