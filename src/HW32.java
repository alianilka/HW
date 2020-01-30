// 2. Write a program which take string from console and print out
// whether it contains numbers, uppercase symbols, lowercase symbols, special characters (!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~)


import java.util.Scanner;

public class HW32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your statement here:");
        String lines = input.nextLine();

        int length = lines.length();
        String specialCharacters = "(!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~)";
        boolean hasNumbers = false;
        boolean hasUppercaseSymbols = false;
        boolean hasLowercaseSymbol = false;
        boolean hasSpecialCharacters = false;
        for (int a = 0; a < length; a++) {
            char symbol = lines.charAt(a);
            if (symbol >= 'A' && symbol <= 'Z') {
                hasUppercaseSymbols = true;
            }
            if (symbol >= 'a' && symbol <= 'z') {
                hasLowercaseSymbol = true;
            }
            if (symbol >= '0' && symbol <= '9') {
                hasNumbers = true;
            }
            if (specialCharacters.contains(String.valueOf(symbol))) {
                hasSpecialCharacters = true;
            }
        }
        if (hasUppercaseSymbols){
            System.out.println("String contains uppercase symbols");
        }
        if (hasLowercaseSymbol){
            System.out.println("String contains lowercase symbols");
        }
        if (hasNumbers){
            System.out.println("String contains numbers");
        }
        if (hasSpecialCharacters){
            System.out.println("String contains special characters");
        }
    }
}