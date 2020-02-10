package Exercises;

import java.util.Scanner;

public class PigLatin
{
    public static void main(String[] args)
    {
        String userWord;
        int wordLength;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word to be converged. >>> ");

        userWord = input.nextLine();

        wordLength = userWord.length();

        if( userWord.charAt(0) == 'a' ||  userWord.charAt(0) == 'o' ||userWord.charAt(0) == 'i' ||userWord.charAt(0) == 'o' ||userWord.charAt(0) == 'u' ||userWord.charAt(0) == 'y')
        {
            String newWord = userWord.substring(1) + userWord.charAt(0);
            System.out.println(newWord + "ay");
        }
        else if ( userWord.charAt(0) == 'b' ||  userWord.charAt(0) == 'c' ||userWord.charAt(0) == 'd' ||userWord.charAt(0) == 'f' ||userWord.charAt(0) == 'g' ||userWord.charAt(0) == 'h' ||userWord.charAt(0) == 'j' ||userWord.charAt(0) == 'k' ||userWord.charAt(0) == 'l' ||userWord.charAt(0) == 'm' ||userWord.charAt(0) == 'n' ||userWord.charAt(0) == 'p' ||userWord.charAt(0) == 'q' ||userWord.charAt(0) == 'r' ||userWord.charAt(0) == 's' ||userWord.charAt(0) == 't' ||userWord.charAt(0) == 'v' ||userWord.charAt(0) == 'w' ||userWord.charAt(0) == 'x' ||userWord.charAt(0) == 'z' && userWord.charAt(1) == 'b' ||  userWord.charAt(1) == 'c' ||userWord.charAt(1) == 'd' ||userWord.charAt(1) == 'f' ||userWord.charAt(1) == 'g' ||userWord.charAt(1) == 'h' ||userWord.charAt(1) == 'j' ||userWord.charAt(1) == 'k' ||userWord.charAt(1) == 'l' ||userWord.charAt(1) == 'm' ||userWord.charAt(1) == 'n' ||userWord.charAt(1) == 'p' ||userWord.charAt(1) == 'q' ||userWord.charAt(1) == 'r' ||userWord.charAt(1) == 's' ||userWord.charAt(1) == 't' ||userWord.charAt(1) == 'v' ||userWord.charAt(1) == 'w' ||userWord.charAt(1) == 'x' ||userWord.charAt(1) == 'z')
        {
            String newWord = userWord.substring(1) + userWord.charAt(0) + userWord.charAt(1);
            System.out.println(newWord + "ay");
        }
        else if (userWord.charAt(0) == 'b' ||  userWord.charAt(0) == 'c' ||userWord.charAt(0) == 'd' ||userWord.charAt(0) == 'f' ||userWord.charAt(0) == 'g' ||userWord.charAt(0) == 'h' ||userWord.charAt(0) == 'j' ||userWord.charAt(0) == 'k' ||userWord.charAt(0) == 'l' ||userWord.charAt(0) == 'm' ||userWord.charAt(0) == 'n' ||userWord.charAt(0) == 'p' ||userWord.charAt(0) == 'q' ||userWord.charAt(0) == 'r' ||userWord.charAt(0) == 's' ||userWord.charAt(0) == 't' ||userWord.charAt(0) == 'v' ||userWord.charAt(0) == 'w' ||userWord.charAt(0) == 'x' ||userWord.charAt(0) == 'z')
        {
            String newWord = userWord.substring(1) + userWord.charAt(0);
            System.out.println(newWord + "ay");
        }
    }


}
