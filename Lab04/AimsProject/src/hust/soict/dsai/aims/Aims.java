package hust.soict.dsai.aims;
import java.util.*;
import hust.soict.dsai.aims.media.*;

public class Aims {

	public static void main(String[] args) {
	    ArrayList<Media> mediae = new ArrayList<>();
	    
	    CompactDisc cd = new CompactDisc();
	    DigitalVideoDisc dvd = new DigitalVideoDisc();
	    Book book = new Book();
	    
	    // Add some media objects to the list
	    mediae.add(cd);
	    mediae.add(dvd);
	    mediae.add(book);
	        
	    for (Media media : mediae) {
	        System.out.println(media.toString());
	    }
	}
	
}
