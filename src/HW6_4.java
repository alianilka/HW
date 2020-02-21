//Write a Java program to reverse words in a initial string
//The given string is: Reverse text in a string
//The new string after reversed the words: string a in text Reverse

import java.util.regex.Pattern;

public class HW6_4 {
    static String reverseWords(String str)
    {
        Pattern pattern = Pattern.compile("\\s");

        String[] temp = pattern.split(str);
        String result = "";

        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
    }

    public static void main(String[] args)
    {
        String str = "Reverse text in a string";
        System.out.println(reverseWords(str));
    }
}