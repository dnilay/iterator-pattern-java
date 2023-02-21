package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class SongsOf2000s {
    // ArrayList holds SongInfo objects

    LinkedList<SongInfo> bestSongs;

    public SongsOf2000s() {

        bestSongs = new LinkedList<SongInfo>();

        addSong("Imagine1", "John Lennon1", 2000);
        addSong("American Pie1", "Don McLean1", 2001);
        addSong("I Will Survive1", "Gloria Gaynor1", 2021);

    }

    // Add a SongInfo object to the end of the ArrayList

    public void addSong(String songName, String bandName, int yearReleased){

        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);

        bestSongs.add(songInfo);

    }


    // Get rid of this
    // Return the ArrayList filled with SongInfo Objects

    public LinkedList<SongInfo> getBestSongs(){

        return bestSongs;

    }

	/*// NEW By adding this method I'll be able to treat all
	// collections the same

	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return bestSongs.iterator();
	}*/

}
