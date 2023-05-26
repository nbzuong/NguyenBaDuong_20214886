package hust.soict.dsai.aims.media;

public class Track extends CompactDisc implements Playable {
	private String title;
	private int length;
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}

}