public class MediaLib
{
   public static void main()
    {
        double totalCost = 0.0;
        double totalRating = 0;
        int totalPages = 0;
        
        int numSongs = 0;
        int numBooks = 0;
        double avePages;
        
        int numMovies = 0;
        int aveTime = 0;
        int hours = 0;
        int minutes = 0;
        
        int totalTime = 0;
        double aveCost;
        double aveRating;
        
        System.out.println("Welcome to your Media Library");
        
        Song song1 = new Song("Johnny B. Goode", 1.9, 8);
        numSongs = numSongs + 1;
        totalCost = totalCost + song1.getPrice();
        totalRating = totalRating + song1.getRating();
        
        Song song2 = new Song("Bohemian Rhapsody", 0.0, 0);
        numSongs = numSongs + 1;        
        totalCost = totalCost + song2.getPrice();
        totalRating = totalRating + song2.getRating();
        
        Song song3 = new Song("Guren no Yumiya", 1.00, 3);
        numSongs = numSongs + 1;        
        totalCost = totalCost + song3.getPrice();
        totalRating = totalRating + song3.getRating();
        
        Song song4 = new Song("Iron Man", 500.00, 10);
        numSongs = numSongs + 1;        
        totalCost = totalCost + song4.getPrice();
        totalRating = totalRating + song4.getRating();
        
        Song song5 = new Song("John Cheetham Alto Sax Sonata", 500.00, 1);
        numSongs = numSongs + 1;        
        totalCost = totalCost + song5.getPrice();
        totalRating = totalRating + song5.getRating();
        
        Song song6 = new Song("B**** Lasagna", 69696969.69 , 10);
        numSongs = numSongs + 1;        
        totalCost = totalCost + song6.getPrice();
        totalRating = totalRating + song6.getRating();
        
        Song song7 = new Song("Careless Whispers", 500.00, 6);
        numSongs = numSongs + 1;
        totalCost = totalCost + song7.getPrice();
        totalRating = totalRating + song7.getRating();
        
        
        Movie movie1 = new Movie("Transformers", 50.00, 9, 137);
        numMovies = numMovies + 1;
        totalCost = totalCost + movie1.getPrice();
        totalRating = totalRating + movie1.getRating();
        totalTime = totalTime +  movie1.getMinutes();
        
        
        Movie movie2 = new Movie("Kung Pow", 100.00, 10, 120);
        numMovies = numMovies + 1;
        totalCost = totalCost + movie2.getPrice();
        totalRating = totalRating + movie2.getRating();
        totalTime = totalTime +  movie2.getMinutes();
                
        Movie movie3 = new Movie("Human Centipede", 15.00, 3, 111);
        numMovies = numMovies + 1;
        totalCost = totalCost + movie3.getPrice();
        totalRating = totalRating + movie3.getRating();
        totalTime = totalTime +  movie3.getMinutes();
        
        Movie movie4 = new Movie("Starship Troopers", 20.00, 1, 240);
        numMovies = numMovies + 1;
        totalCost = totalCost + movie4.getPrice();
        totalRating = totalRating + movie4.getRating();
        totalTime = totalTime +  movie4.getMinutes();
        
        Movie movie5 = new Movie("Slender Man", 30.00, 7, 200);
        numMovies = numMovies + 1;
        totalCost = totalCost + movie5.getPrice();
        totalRating = totalRating + movie5.getRating();
        totalTime = totalTime +  movie5.getMinutes();
        
        Book book1 = new Book("Forgotten Realms", 8.99, 9, 250);
        numBooks = numBooks + 1;
        totalPages = totalPages + book1.getPages();
        totalCost = totalCost + book1.getPrice();
        totalRating = totalRating + book1.getRating();
        
        Book book2 = new Book("Metro 2033", 12.99, 6, 150);
        numBooks = numBooks + 1;
        totalPages = totalPages + book2.getPages();
        totalCost = totalCost + book2.getPrice();
        totalRating = totalRating + book2.getRating();
        
        Book book3 = new Book("Full Metal Alchemist", 20.00, 5, 300);
        numBooks = numBooks + 1;
        totalPages = totalPages + book3.getPages();
        totalCost = totalCost + book3.getPrice();
        totalRating = totalRating + book3.getRating();
        
        System.out.println("Number of songs: ");
        System.out.println(numSongs);
        aveCost = totalCost / numSongs;
        System.out.println("Average cost: " + aveCost);
        
        aveRating = totalRating / numSongs;
        System.out.println("Average rating: " + aveRating);
        
        
        System.out.println("Number of movies: ");
        System.out.println(numMovies);
        aveTime = totalTime / numMovies;
        aveCost = totalCost / numMovies;
        System.out.println("Average cost: " + aveCost);
        System.out.println("Average time: " + aveTime + " minutes");
        
        aveRating = totalRating / numMovies;
        System.out.println("Average rating: " + aveRating);
        
        
//hours = movie1.getMinutes() / 60;
//minutes = movie1.getMinutes() % 60;
        
        System.out.println("Number of books: ");
        System.out.println(numBooks);
        aveCost = totalCost / numBooks;
        System.out.println("Average cost: " + aveCost);
        
        aveRating = totalRating / numBooks;
        System.out.println("Average rating: " + aveRating);
        
        avePages = totalPages / numBooks;
        System.out.println("Average amount of pages: " + avePages);
        
        
    }
}
