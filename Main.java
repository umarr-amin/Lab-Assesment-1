public class Main {
    public static void main(String[] args) {

        Artist artist = new Artist("M Umar Amin");

 
        Artwork artwork1 = new Artwork("Chemistry", 2024, artist);
        Artwork artwork2 = new Artwork("Physics", 2024); // Uses default artist


        artwork1.displayInformation();
        artwork2.displayInformation();

        artwork2 = new Artwork("Physics", 2024); 
        artwork2.displayInformation();


        Artwork shallowCopy = artwork1.shallowCopy();
        Artwork deepCopy = artwork1.deepCopy();

        System.out.println("\nOriginal Artwork:");
        artwork1.displayInformation();
        System.out.println("\nShallow Copy:");
        shallowCopy.displayInformation();
        System.out.println("\nDeep Copy:");
        deepCopy.displayInformation();

     
        artist = new Artist("Ali HAssan");
        artwork1 = new Artwork(artwork1.getTitle(), artwork1.getYear(), artist);

        System.out.println("\nAfter modifying the original artist:");
        System.out.println("\nOriginal Artwork:");
        artwork1.displayInformation();
        System.out.println("\nShallow Copy:");
        shallowCopy.displayInformation();
        System.out.println("\nDeep Copy:");
        deepCopy.displayInformation();
    }
}
