
public class MediaLib {
    public MediaLib() {
    }

    public static void main() {
        double totalCost = 0.0D;
        double totalRating = 0.0D;
        int numSongs = 0;
        
        System.out.println("Welcome to your Media Library");
        
        Song song1 = new Song("The Twist", 1.29D, 10);
        ++numSongs;
        totalCost += song1.getPrice();
        totalRating += (double)song1.getRating();
        
        Song song2 = new Song("Smooth", 0.99D, 9);
        ++numSongs;
        totalCost += song2.getPrice();
        totalRating += (double)song2.getRating();
        
        Song song3 = new Song("Mack the Knife", 1.29D, 8);
        ++numSongs;
        totalCost += song3.getPrice();
        totalRating += (double)song3.getRating();
        
        Song song4 = new Song("How Do I Live", 99.0D, 7);
        ++numSongs;
        totalCost += song4.getPrice();
        totalRating += (double)song4.getRating();
        
        Song song5 = new Song("Party Rock Anthem", 1.29D, 6);
        ++numSongs;
        totalCost += song5.getPrice();
        totalRating += (double)song5.getRating();
        
        Song song6 = new Song("I Gotta Feeling", 0.99D, 7);
        ++numSongs;
        totalCost += song6.getPrice();
        totalRating += (double)song6.getRating();
        
        Song song7 = new Song("Macaren", 1.29D, 8);
        ++numSongs;
        totalCost += song7.getPrice();
        totalRating += (double)song7.getRating();
        
        Song song8 = new Song("Physical", 0.99D, 9);
        ++numSongs;
        totalCost += song8.getPrice();
        totalRating += (double)song8.getRating();
        
        Song song9 = new Song("You Light Up My Life", 1.29D, 10);
        ++numSongs;
        totalCost += song9.getPrice();
        totalRating += (double)song9.getRating();
        
        Song song10 = new Song("Hey Jude", 0.99D, 9);
        ++numSongs;
        totalCost += song10.getPrice();
        totalRating += (double)song10.getRating();
        
        System.out.println("Number of songs:");
        System.out.println(numSongs);
        System.out.println("Total cost:");
        System.out.println(totalCost);
        
        double aveCost = totalCost / (double)numSongs;
        System.out.println("Average cost:");
        System.out.println(aveCost);
        
        double aveRating = totalRating / (double)numSongs;
        System.out.println("Average rating:");
        System.out.println(aveRating);
        
        Movie movie1 = new Movie();
        movie1.setTitle("Young Frankenstein");
        System.out.println(movie1.getTitle());
        movie1.setDuration(134);
        movie1.showHoursMinutes();
        
        System.out.println("NumSongsInLibrary " + song10.getNumSongsInLibrary() + " should equal " + numSongs);
        MySong mine = new MySong();
        System.out.println("MINE: " + mine.showSong());
    }
}
