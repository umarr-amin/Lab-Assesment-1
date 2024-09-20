class Artwork {
    private String title;
    private int year;
    private Artist artist;


    public Artwork(String title, int year, Artist artist) {
        this.title = title;
        this.year = year;
        this.artist = artist;
    }

    public Artwork(String title, int year) {
        this(title, year, new Artist("Unknown Artist"));
    }


    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Artist getArtist() {
        return artist;
    }


    public void displayInformation() {
        System.out.println(String.format("Artwork Title: %s, Year: %d, Artist: %s", title, year, artist.getName()));
    }

    public Artwork shallowCopy() {
        return new Artwork(this.title, this.year, this.artist); 
    }

    public Artwork deepCopy() {
        return new Artwork(this.title, this.year, new Artist(this.artist.getName()));
    }
}
