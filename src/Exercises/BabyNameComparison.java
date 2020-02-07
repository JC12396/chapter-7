package Exercises;

import java.util.Scanner;

public class BabyNameComparison
{
    public static void main(String[] args)
    {
        for(int l = 0; l < 3; l++) {
            String name;
            String saveOriginalName;
            int strLength;
            char c;

            Scanner input = new Scanner(System.in);

            System.out.print("Please enter a baby name >>> ");
            name = input.nextLine();



            strLength = name.length();

            for (int i = 0; i < strLength; i++) {
                c = name.charAt(i);
                if (i == 0) {
                    c = Character.toUpperCase(c);
                    name = c + name.substring(1, name.length());

                } else {
                    if (name.charAt(i) == ' ') {
                        ++i;
                        c = name.charAt(i);
                        c = Character.toUpperCase(c);
                        name = name.substring(0, i) + c + name.substring(i + 1, strLength);
                    }
                }
            }
            System.out.println("Baby name: " + name);
        }
    }
}
