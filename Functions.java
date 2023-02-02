package master;

import java.util.Random;

public class Functions
{

    public int[] maakcode()
    {
	// dit vult de array met 4 random getallen
	Random random = new Random();
	int[] getal = new int[4];

	for (int i = 0; i < 3;)
	{
	    getal[i] = random.nextInt(9 + 1);
	    i++;
	}
	return getal;
    }

    public int zwart()
    {
	// dit checked voor zwartepinnen
	int[] getal = new int[4];
	int[] raadpin = new int[4];
	int zwartepinnen = 0;
	for (int i = 0; i < 4; i++)
	{
	    if (getal[i] == raadpin[i])
	    {
		zwartepinnen++;
	    }
	}
	return zwartepinnen;
    }

    public int wit(int[] getal, int[] raadpin)
    {
	int wittepinnen = 0;
	for (int i = 0; i < 4; i++)
	{
	    for (int j = 0; j < 4; j++)
	    {
		if (getal[i] == raadpin[j])
		{
		    wittepinnen++;
		}
	    }
	}
	return wittepinnen;
    }

}
