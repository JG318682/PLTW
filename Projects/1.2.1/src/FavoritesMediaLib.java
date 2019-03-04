public class FavoritesMediaLib
{
    public static void main (String args[])
    {
        String songInfo = MediaFile.readString();

        System.out.println("My Favorite Songs In Order");
        System.out.println("---------------------------");

        int index = songInfo.indexOf("|");
        while (index > 0) {
            String titleofSong = songInfo.substring(0, index);
            songInfo = songInfo.substring(index +1); //generate a new string starting at songs rating
            index = songInfo.indexOf("|");// get the rating string
            String ratingString = songInfo.substring(0, index);

//             convert to a integer

            int rating = Integer.valueOf(ratingString);

            titleofSong = songInfo.substring(0, rating);
            songInfo = songInfo.substring(rating + 1); //generate a new string starting at songs rating
            rating = songInfo.indexOf("|");// get the rating string
            ratingString = songInfo.substring(0, rating);

            if(rating > 7) {

                System.out.println(titleofSong + rating);

            }

            songInfo = songInfo.substring(index + 1);
            index = songInfo.indexOf("|");
        }
    }

}
