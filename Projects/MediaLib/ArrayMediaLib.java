
int index = SongFinder.findTitle(topTenSongs, "Mack the Knife");
if (index >=0 ) {
    System.out.println("Found " + topTenSongs[index].getTitle());
}
else  {
    System.out.println("Song not found!");
}