
public class Movie {
    private int rating = 0;
    private String title = "";
    private int duration;

    public Movie() {
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

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int d) {
        this.duration = d;
    }

    public void showHoursMinutes() {
        int hours = this.duration / 60;
        int minutes = this.duration % 60;
        System.out.print("Duration of your movie: ");
        System.out.print(hours);
        System.out.print(" hours and ");
        System.out.print(minutes);
        System.out.println(" minutes.");
    }
}
