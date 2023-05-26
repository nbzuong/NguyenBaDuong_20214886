package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc {
	public DigitalVideoDisc() {
		super();
	}
	//toString method
	public String toString() {
		return ". DVD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + ": " + getCost() + "$";
	}
}


