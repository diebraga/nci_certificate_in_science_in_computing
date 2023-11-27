package softwareDevelopment.week6Lab.BottleLyricsApp;

public class BottleLyricsApp {
    public static void main(String[] args) {
        int totalCounts = 99;
        int limit = 0;

        for (int i = totalCounts; i > limit; i--) {
            if (i == 1) {
                System.out.println("1 bottle of beer on the wall, 1 bottle of beer");
                System.out.println("Take one down and pass it around, no more bottles of beer on the wall");
                System.out.println();
            } else {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer");
                System.out.println("Take one down and pass it around, " + (i - 1)
                        + (i - 1 == 1 ? " bottle" : " bottles") + " of beer on the wall");
                System.out.println();
            }
        }
        System.out.println("No more bottles of beer on the wall, no more bottles of beer");
        System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall");
    }
}
