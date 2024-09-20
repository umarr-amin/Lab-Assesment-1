class Artist {
    private String name;


    public Artist(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void displayInformation() {
        System.out.println("Artist Name: " + name);
    }
}
