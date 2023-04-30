
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
}
