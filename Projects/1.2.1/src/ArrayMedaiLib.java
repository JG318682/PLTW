public class ArrayMedaiLib {

    public static void main(String args[]) {

        String[] sharingFriends = {"Jamal", "Emily", "Destiny", "Mateo", "Sofia"};
        for (int i = 0; i < 5; ++i) {
            System.out.println(sharingFriends[i]);
        }

        //Part III
        int[] daysBetweenPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
        int total = 0;
        for (int val : daysBetweenPurchase) {
            total = total + val;
        }
        //Complete math on your own

        //Part IV
        //Initialize
        Song[] topTenSongs = {
                new Song("Smooth"),
                new Song("Mack the Knife"),
                new Song("The Twist"),
                new Song("How Do I Live"),
                new Song("Party Rock Anthem"),
                new Song("I Gotta Feeling"),
                new Song("Macaren"),
                new Song("Physical"),
                new Song("You Light Up My Life"),
                new Song("Hey Jude")
        };
        for (Song s : topTenSongs) {
            System.out.println(s.getTitle());
        }

        int count = 0;
        for (Song s : topTenSongs){
            if(count % 3 == 0){
                s.setPrice(.99);
                System.out.println(s.getTitle() + " Price: " + s.getPrice());
            }
            else{
                s.setPrice(1.29);
                System.out.println(s.getTitle() + " Price: " + s.getPrice());
            }
            count++;
        }

    }
}
