package OReilli;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"kind","clever","gorgeous","stupid","simple","ugly","big","beautiful"};
        String[] wordListTwo = {"boy","girl","dog","cat","fox","bear","tiger"};
        String[] wordListThree = {"one","two","three","four"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int)(Math.random() * oneLength);
        int rand2 = (int)(Math.random() * twoLength);
        int rand3 = (int)(Math.random() * threeLength);

        String phrase = wordListThree[rand3] + " " + wordListOne[rand1] + " " + wordListTwo[rand2];

        System.out.println("All we need is " + phrase);
    }
}
