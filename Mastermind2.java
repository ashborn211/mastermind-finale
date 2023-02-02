package master;

import java.util.Scanner;

public class Mastermind2
{

    public static void main(String[] args)
    {
	int[] getal = new int[4];
	int[] raadpin = new int[4];
	int wittepinnen;
	int zwartepinnen;
	int attempt;
	boolean geraden = false;
	boolean game = true;
	boolean check = true;
	Scanner invoer = new Scanner(System.in);
	Functions spel = new Functions();

	while (game)
	{
	    // je geeft een hele array terug dus je kunt array de warden geven van een
	    // andere
	    getal = spel.maakcode();

	    attempt = 0;
	    // uitleg over het spel
	    System.out.println("elke getal is van 1 tot 10");
	    System.out.println("je hebt 10 kansen om de code te raden");
	    System.out.println("je schijft te code zo: 1 1 1 1");
	    System.out.println("je schrijft ze niet aan elkaar vast");
	    System.out.println("maar je kan ze wel onder elkaar schrjven");
	    //dit is de loop voor het spel
	    for (int x = 0; x < 10; x++)
	    {
		wittepinnen = 0;
		zwartepinnen = 0;
		attempt++;
		System.out.println("raad de code");
		System.out.println("kans " + attempt);
		//hier voer je je raapinnen in
		for (int i = 0; i < 4; i++)
		{
		    raadpin[i] = invoer.nextInt();
		}

		// for loops checked voor de pinnen
		for (int i = 0; i < 4; i++)
		{
		    if (getal[i] == raadpin[i])
		    {
			zwartepinnen = spel.zwart();
		    } else
		    {
			for (int j = 0; j < 4; j++)
			{
			    if (getal[i] == raadpin[j])
			    {
				wittepinnen = spel.wit(getal, raadpin);
			    }
			}
		    }
		}

		System.out.println("Aantal witte pinnen: " + wittepinnen);
		System.out.println("Aantal zwarte pinnen: " + zwartepinnen);
		if (zwartepinnen == 4)
		{
		    System.out.println("Je hebt gewonnen!");
		    geraden = true;
		    break;
		} else
		{
		    System.out.println("Probeer het opnieuw.");
		}
	    }
	    if (geraden == false)
	    {
		System.out.println("Je hebt verloren.");
		System.out.println("volgende keer beter");
		System.out.println("De code was: " + getal[0] + getal[1] + getal[2] + getal[3]);
	    }
	    // dit zorgt er voor dat de game op nieuw can beginnen
	    while (check)
	    {
		System.out.println("wil je het opnieuw proberen yes of no");
		String option = invoer.next();
		if (option.equalsIgnoreCase("no"))
		{
		    game = false;
		    break;
		} else if (!option.equalsIgnoreCase("yes"))
		{
		    System.out.println("that is not a option");
		} else
		{
		    break;
		}
	    }
	}
	invoer.close();
    }
}