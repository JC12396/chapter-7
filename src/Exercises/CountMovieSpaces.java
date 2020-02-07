package Exercises;

import java.util.Scanner;

public class CountMovieSpaces
{
    public static void main(String[] args)
    {
        String movieQuote;
        int movieQuoteLength;
        int spaces = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your favorite quote. >>> ");

        movieQuote = input.nextLine();

        movieQuoteLength = movieQuote.length();

        for(int i = 0; i < movieQuoteLength; i++)
        {
            if (movieQuote.charAt(i) == ' ')
            {
                spaces++;
                ++i;
            }
        }
        System.out.println(movieQuote + " That quote had " + spaces + " spaces");
    }
}
