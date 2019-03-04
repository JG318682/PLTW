public class Book
{
       private int pages;
       private int rating;
       private String title; 
       private boolean favorite;
       private double price;
       private static int numBooksInLibrary;
       
    public Book()
    {  
        title = "";
        rating = 0;
        price = 0.0;
        pages = 0;
    }
    public Book(String title, double price, int rating, int pages)
    {
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.pages = pages;
        
        numBooksInLibrary = numBooksInLibrary + 1;
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
    
    public int getPages()
    {
        return pages;
    }
    public void setPages(int d)
    {
        pages = d;
    }
    
        public void addToFavorites()
    {
        favorite = true;
    }
        public int getNumBooksInLibrary()
    {
        return numBooksInLibrary;
    }
}
