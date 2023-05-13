package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	
	public void updateID() {
		this.id = DigitalVideoDisc.nbDigitalVideoDiscs;
		DigitalVideoDisc.nbDigitalVideoDiscs++;
	}
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	
	//Temporary method to set title for exercise 3
	public void setTitle(String title) {
		this.title = title;
	}
	
	//Create a DVD object by title
	public DigitalVideoDisc (String title) {
		super();
		this.title = title;
		updateID();
	}
	
	//Create a DVD object by category, title and cost
	public DigitalVideoDisc (String category, String title, float cost) {
		super();
		this.category = category;
		this.title = title;
		this.cost = cost;
		updateID();
	}
	
	
	//Create a DVD object by director, category, title and cost
	public DigitalVideoDisc (String director, String category, String title, float cost) {
		super();
		this.director = director;
		this.category = category;
		this.title = title;
		this.cost = cost;
		updateID();
	}
	
	//Create a DVD by all attributes: title, category, director, length and cost
	public DigitalVideoDisc (String title, String category, String director, int length, float cost){
		super();
		this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        updateID();
	}

	public int getId() {
		return id;
	}
	
	//toString method
	public String toString() {
		return ". DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + "$";
	}
}


