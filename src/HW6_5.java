//Write a Java program to read a string and an int from console, return a string without the character with described index
//The initial strings is: Hello buddy
//The numbers is: 3
//The new string is: Helo buddy

public class HW6_5 {

    public static void main(String[] args) {
        String str = "Hello buddy";
        StringBuilder sb = new StringBuilder();

        sb.append(str);
        sb.deleteCharAt(3);
        str = sb.toString();
        System.out.println(str);
    }
}