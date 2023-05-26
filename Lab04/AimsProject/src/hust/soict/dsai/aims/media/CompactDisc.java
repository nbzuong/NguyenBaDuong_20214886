package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc {
	private String artist;
	private ArrayList<String> tracks = new ArrayList<String>();
	
	public CompactDisc() {
		super();
	}
	
	public CompactDisc(String artist, ArrayList<String> tracks) {
		super();
		this.artist = artist;
		this.tracks = tracks;
	}
	
	public void addTrack(String track) {
		if(!tracks.contains(track)) {
			tracks.add(track);
			System.out.println(track+" has been added");
		}
		System.out.println(track+" is already in the track list");
	}
	
	public void removeTrack(String track) {
		if(!tracks.contains(track)) {
			System.out.println(track+" is not in the track list");
		}
		else{
			tracks.remove(track);
			System.out.println(track+" has been removed from the track list");
		}
	}
	
	public int getLength() {
		int length = 0;
		for (int i=0; i< tracks.size();i++) {
			length += tracks[i].getLength();
		}
		return length;
	}
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}

}
