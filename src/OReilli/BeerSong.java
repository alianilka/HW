package OReilli;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0){

            if (beerNum == 1){
                word = "bottle";
            }
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println("Take one.");
            System.out.println("Run it around.");
            beerNum = beerNum - 1;
            if (beerNum > 0){
            } else {
                System.out.println("There are no bottles on the wall");
            }
        }
    }
}
