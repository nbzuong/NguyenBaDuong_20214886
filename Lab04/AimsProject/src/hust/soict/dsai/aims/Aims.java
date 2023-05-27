package hust.soict.dsai.aims;

import java.util.*;
import hust.soict.dsai.aims.media.*;

public class Aims {

	public static void main(String[] args) {
	    ArrayList<Media> mediae = new ArrayList<>();
	    
	    CompactDisc cd = new CompactDisc();
	    cd.setTitle("superman");
	    cd.setCost(305.5f);
	    DigitalVideoDisc dvd = new DigitalVideoDisc();
	    dvd.setTitle("starWar");
	    dvd.setCost(1563.6f);
	    Book book = new Book();
	    book.setTitle("khonggiadinh");
	    book.setCost(55.6f);
	    
	    
	    // Add some media objects to the list
	    mediae.add(cd);
	    mediae.add(dvd);
	    mediae.add(book);
	    
	    Collections.sort(mediae, Media.COMPARE_BY_TITLE_COST);    
	    
	    for (Media media : mediae) {
	        System.out.println(media.toString());
	    }
	    
	}
	
}
