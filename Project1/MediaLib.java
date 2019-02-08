public class MediaLib
{
   public static void main()
    {
        System.out.println("Welcome to your Media Library");
        
        Song song1 = new Song();
        
        song1.setTitle("Johnny B. Goode");
        System.out.println(song1.getTitle());
        
        Song rating1 = new Song();
        
        rating1.setRating(8);  
        System.out.println(rating1.getRating());
        
        
        Movie movie1 = new Movie();
        
        movie1.setTitle("Transformers");
        System.out.println(movie1.getTitle());
        
        Movie movieRating1 = new Movie();
        
        movie1.setRating(9);
        System.out.println(movie1.getRating());
        
        
        Book book1 = new Book();
        
        book1.setTitle("Forgotten Realms");
        System.out.println(book1.getTitle());
        
        Book bookRating1 = new Book();
        
        book1.setRating(5);
        System.out.println(book1.getRating());
        
    }
    
}
