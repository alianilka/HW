public class HW6_3 {

    //3. Write a Java program to reverse a string using recursion
    //The given string is: The quick brown fox jumps
    //The string in reverse order is: spmuj xof nworb kciuq ehT

    public static void main(String[] args) {
        String str = "The quick brown fox jumps";
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
    }

    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}

