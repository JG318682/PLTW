public class Movie
{
       private int minutes;
       
       private int rating;
       private String title; 
       private boolean favorite;
       private double price;
       private static int numMoviesInLibrary;
       
    public Movie()
    {  
        title = "";
        rating = 0;
        price = 0.0;
        minutes = 0;
    }
    public Movie(String title, double price, int rating, int minutes)
    {
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.minutes = minutes;
        
        numMoviesInLibrary = numMoviesInLibrary + 1;
    }
    
    public int getMinutes()
    {
        return minutes;
    }
    public void setMinutes(int m)
    {
        minutes = m;
    }
    
    public String getTitle()
    {
        return title; 
    }
    public void setTitle(String t) 
    {
        title = t;
    }
    
    public int getRating() {
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
        public int getNumMoviesInLibrary()
    {
        return numMoviesInLibrary;
    }
}
