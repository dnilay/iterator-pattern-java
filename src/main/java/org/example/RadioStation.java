package org.example;

public class RadioStation {
	
	public static void main(String[] args){
		
		SongIterator songs70s = new SongsOfThe70s();
		SongIterator songs80s = new SongsOfThe80s();
		SongIterator songs90s = new SongsOfThe90s();

		
		DiscJockey madMike = new DiscJockey(songs70s, songs80s, songs90s);
		
		 //madMike.showTheSongs();
		
		madMike.showTheSongs2();
		
	}
	
}