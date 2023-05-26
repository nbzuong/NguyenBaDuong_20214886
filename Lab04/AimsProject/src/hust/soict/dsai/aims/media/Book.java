package hust.soict.dsai.aims.media;

import java.util.*;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		super();
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
	    if (!authors.contains(authorName)) {
	        authors.add(authorName);
	        System.out.println(authorName+" has been added to the list");
	    }
	    System.out.println(authorName+" is already in the list");
	}
	
	public void removeAuthor(String authorName) {
		if (!authors.contains(authorName)) {
			System.out.println(authorName+" is not in the list");
		}
		else {
			authors.remove(authorName);
			System.out.println(authorName+" has been removed from the list");
		}
	}
	
	public String toString() {
		return "ID - "+ getId()+ ". Book - " + getTitle() + " - " + getCategory() + " - " + getAuthors() + " - $" + getCost();
	}
}
