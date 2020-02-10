package GameZone;

import java.util.Random;

public class Card
{
    public static void main(String[] args)
    {
        Random r = new Random();
        CardInfo suit1 = new CardInfo();
        CardInfo num1 = new CardInfo();


        String [] suit = {"Hearts", "Spades", "Clubs", "Diamonds"};

        for(int i = 0; i < 2; i++)
        {
            int answer1 = r.nextInt(13) + 1;
            String s = suit[((int) (Math.random() * 4))];
            num1.setNum(answer1);
            suit1.setForm(s);

            if(answer1 >= 2 && answer1 <= 10)
            {
                System.out.println(num1.getNum() + " of " + suit1.getForm());
            }
            else if(answer1 == 1)
            {
                System.out.println("Ace of " + suit1.getForm());
            }
            else if(answer1 == 11)
            {
                System.out.println("Jack of " + suit1.getForm());
            }
            else if(answer1 == 12)
            {
                System.out.println("Queen of " + suit1.getForm());
            }
            else if(answer1 == 13)
            {
                System.out.println("King of " + suit1.getForm());
            }
        }
    }
}


