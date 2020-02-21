import java.util.HashSet;

public class CW7_3 {

        public static void main(String[] args) {
            String first = "Body_moving".toLowerCase();
            String second = "My body is fat".toLowerCase();

            HashSet<Character> firstUnique = new HashSet<>();
            for (int i = 0; i < first.length(); i++) {
                char char1 = first.charAt(i);

                if (!second.contains(Character.toString(char1))) {
                    firstUnique.add(char1);
                }
            }

            HashSet<Character> secondUnique = new HashSet<>();
            for (int i = 0; i < second.length(); i++) {
                char char2 = second.charAt(i);

                if (!first.contains(Character.toString(char2))) {
                    secondUnique.add(char2);
                }
            }
            if (firstUnique.size() != 0 || secondUnique.size() != 0) {
                System.out.println("Result: Strings contains different symbols");
                System.out.println("1st doesn't contain " + secondUnique.toString());
                System.out.println("2nd doesn't contain " + firstUnique.toString());
            }
        }
    }

