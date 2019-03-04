public class Song
{
       private int rating;
       private String title;
       private boolean favorite;
       private double price;
       private static int numSongsInLibrary;
    
    public Song()
    {  
        title = "";
        rating = 0;
        price = 0.0;
    }
    public Song(String title, double price, int rating)
    {
        this.title = title;
        this.price = price;
        this.rating = rating;
        
        numSongsInLibrary = numSongsInLibrary + 1;
    }
    public String getTitle() 
    {
        return title; 
    }
    public void setTitle(String t) 
    {
        title = t;
    }
    
    public int getRating() 
    {
        return rating;
    }
    public void setRating(int r) 
    {
        rating = r;
    }

    public Double getPrice()
    {
        return price;
    }
    public void setPrice(double p)
    {
        price = p;
    }
    
    public void addToFavorites()
    {
        favorite = true;
    }
    public int getNumSongsInLibrary()
    {
        return numSongsInLibrary;
    }
}

