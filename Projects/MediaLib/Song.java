
public class Song {
    private static int numSongsInLibrary;
    private String title;
    private int rating;
    private boolean favorite;
    private double price;

    public Song() {
        this.rating = 0;
        this.title = "";
        this.price = 0.0D;
        ++numSongsInLibrary;
    }

    public Song(String title, double price) {
        this.title = title;
        this.price = price;
        ++numSongsInLibrary;
    }

    public Song(String title, double price, int rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        ++numSongsInLibrary;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int r) {
        this.rating = r;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double p) {
        this.price = p;
    }

    public void addToFavorites() {
        this.favorite = true;
    }

    public int getNumSongsInLibrary() {
        return numSongsInLibrary;
    }
}
