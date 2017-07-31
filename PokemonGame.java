public class PokemonGame
{
    public static void main (String args[])
    {
	new PokemonGame ();
    }


    public PokemonGame ()
    {
	printFast (" ---Welcome to the World of---- \n");
	System.out.println ("PPPPPPPPPPPPPPPPP                   kkkkkkkk                            ");
	System.out.println ("P::::::::::::::::P                  k::::::k                            ");
	System.out.println ("P::::::PPPPPP:::::P                 k::::::k                            ");
	System.out.println ("PP:::::P     P:::::P                k::::::k                            ");
	System.out.println ("  P::::P     P:::::P  ooooooooooo    k:::::k    kkkkkkk eeeeeeeeeeee       mmmmmmm    mmmmmmm      ooooooooooo   nnnn  nnnnnnnn  ");
	System.out.println ("  P::::P     P:::::Poo:::::::::::oo  k:::::k   k:::::kee::::::::::::ee   mm:::::::m  m:::::::mm  oo:::::::::::oo n:::nn::::::::nn  ");
	System.out.println ("  P::::PPPPPP:::::Po:::::::::::::::o k:::::k  k:::::ke::::::eeeee:::::eem::::::::::mm::::::::::mo:::::::::::::::on::::::::::::::nn ");
	System.out.println ("  P:::::::::::::PP o:::::ooooo:::::o k:::::k k:::::ke::::::e     e:::::em::::::::::::::::::::::mo:::::ooooo:::::onn:::::::::::::::n");
	System.out.println ("  P::::PPPPPPPPP   o::::o     o::::o k::::::k:::::k e:::::::eeeee::::::em:::::mmm::::::mmm:::::mo::::o     o::::o  n:::::nnnn:::::n");
	System.out.println ("  P::::P           o::::o     o::::o k:::::::::::k  e:::::::::::::::::e m::::m   m::::m   m::::mo::::o     o::::o  n::::n    n::::n");
	System.out.println ("  P::::P           o::::o     o::::o k:::::::::::k  e::::::eeeeeeeeeee  m::::m   m::::m   m::::mo::::o     o::::o  n::::n    n::::n");
	System.out.println ("  P::::P           o::::o     o::::o k::::::k:::::k e:::::::e           m::::m   m::::m   m::::mo::::o     o::::o  n::::n    n::::n");
	System.out.println ("PP::::::PP         o:::::ooooo:::::ok::::::k k:::::ke::::::::e          m::::m   m::::m   m::::mo:::::ooooo:::::o  n::::n    n::::n");
	System.out.println ("P::::::::P         o:::::::::::::::ok::::::k  k:::::ke::::::::eeeeeeee  m::::m   m::::m   m::::mo:::::::::::::::o  n::::n    n::::n");
	System.out.println ("P::::::::P          oo:::::::::::oo k::::::k   k:::::kee:::::::::::::e  m::::m   m::::m   m::::m oo:::::::::::oo   n::::n    n::::n");
	System.out.println ("PPPPPPPPPP            ooooooooooo   kkkkkkkk    kkkkkkk eeeeeeeeeeeeee  mmmmmm   mmmmmm   mmmmmm   ooooooooooo     nnnnnn    nnnnnn");
	printSlow ("\nYou hear the beeping of your alarm clock as you slowly open your eyes.");
	printSlow ("You are still sleepy because you stayed up late last night watching Elite Four Pokemon battles.");
	
	int inValid = 0;
	while (inValid != 5)
	{
	String snooze = IBIO.inputString ("Do you hit the snooze button and sleep for another 10 minutes?\n(Yes/ No): ");
	if (snooze.equals ("Yes")) //This decision will decide whether or not you arrive on time for starter pokemon selection!
	    ProfOak ();
	else if (snooze.equals ("No"))
	    ProfOakSnooze ();
	else if (snooze.equals ("Why?")
	    WhySnooze ();
	else
	    {
	    printFast ("Invalid respose.");
	    inValid++
	    }
	}

	public void ProfOak ()
	{
	printFast ("You just realized today is your 10th birthday! Today is the day you can get your first starter Pokemon from Professor Oak!");
	printFast ("You quickly get out of bed, brush your teeth, eat breakfast and head out to Professor Oak's lab");
	printFast ("The question is quick Pokemon you'll choose. You figure you'll decide when you get to the lab and see them all.");
	printFast ("The professor greets you at the door. Welcome! You are the first person to arrive so you get first pick for your starter Pokemon.");
	printFast ("Would you like Charmander, Squirtle, or Bulbasaur?");
	
	}
	public void ProfOakSnooze ()
	{
	}
	
	public void WhySnooze ()
	{
	}

	public void trainerTest ()
	{
	    /*  On this program, your knowledge of
	    various different pokemon types
	    is tested
	    */

	    char type = (randomType ());
	    String uT = IBIO.inputString ("");
	    //uT means the type the user selects

	    public char randomType ()
	    {
		int x = (int) (Math.random () * 17) + 1;
		if (x == 1)
		    return 'n'; //Normal Type
		else if (x == 2)
		    return 'f'; //Fire Type
		else if (x == 3)
		    return 'w'; //Water Type
		else if (x == 4)
		    return 'e'; //Electric Type
		else if (x == 5)
		    return 'g'; //Grass Type
		else if (x == 6)
		    return 'i'; //Ice Type
		else if (x == 7)
		    return 'F'; //Fightnig Type
		else if (x == 8)
		    return 'p'; //Poison Type
		else if (x == 9)
		    return 'G'; //Ground Type
		else if (x == 10)
		    return 'l'; //Fly Type
		else if (x == 11)
		    return 'P'; //Physic Type
		else if (x == 12)
		    return 'b'; //Bug Type
		else if (x == 13)
		    return 'r'; //Rock Type
		else if (x == 14)
		    return 'h'; //Ghost Type
		else if (x == 15)
		    return 'd'; //Dragon Type
		else if (x == 16)
		    return 'D'; //Dark Type
		else
		    return 's'; //Steel Type
	    }

	    public boolean superEffective (char type, String uT)
	    {
		/*  if the type the user picks is super effective
		    agaisnt the type provided this method will
		    return true
		    if the user picks an incorrect type it will
		    return false
		*/
		if ((type == 'n') && (uT.equals ("Fighting")))
		    return true;
		else if ((type == 'f') && (uT.equals ("Water")) || (uT.equals ("Ground")) || (uT.equals ("Rock")))
		    return true;
		else if ((type == 'w') && (uT.equals ("Electric")) || (uT.equals ("Grass")))
		    return true;
		else if ((type == 'e') && (uT.equals ("Ground")))
		    return true;
		else if ((type == 'g') && (uT.equals ("Fire")) || (uT.equals ("Ice")) || (uT.equals ("Poison")) || (uT.equals ("Flying")) || (uT.equals ("Bug")))
		    return true;
		else if ((type == 'i') && (uT.equals ("Fire")) || (uT.equals ("Fighting")) || (uT.equals ("Rock")) || (uT.equals ("Steel")))
		    return true;
		else if ((type == 'F') && (uT.equals ("Flying")) || (uT.equals ("Phychic")))
		    return true;
		else if ((type == 'p') && (uT.equals ("Ground")) || (uT.equals ("Phychic")))
		    return true;
		else if ((type == 'G') && (uT.equals ("Water")) || (uT.equals ("Grass")) || (uT.equals ("Ice")))
		    return true;
		else if ((type == 'l') && (uT.equals ("Electric")) || (uT.equals ("Ice")) || (uT.equals ("Rock")))
		    return true;
		else if ((type == 'P') && (uT.equals ("Bug")) || (uT.equals ("Ghost")) || (uT.equals ("Dark")))
		    return true;
		else if ((type == 'b') && (uT.equals ("Fire")) || (uT.equals ("Flying")) || (uT.equals ("Rock")))
		    return true;
		else if ((type == 'r') && (uT.equals ("Water")) || (uT.equals ("Grass")) || (uT.equals ("Fighting")) || (uT.equals ("Ground")) || (uT.equals ("Steel")))
		    return true;
		else if ((type == 'h') && (uT.equals ("Ghost")) || (uT.equals ("Dark")))
		    return true;
		else if ((type == 'd') && (uT.equals ("Ice")) || (uT.equals ("Dragon")))
		    return true;
		else if ((type == 'D') && (uT.equals ("Fighting")) || (uT.equals ("Bug")))
		    return true;
		else if ((type == 's') && (uT.equals ("Fire")) || (uT.equals ("Fighting")) || (uT.equals ("Ground")))
		    return true;
		else
		    return false;
	    }
	}

    }


    public void printFast (String s)
    {
	for (int i = 0 ; i < s.length () ; i++)
	{
	    System.out.print ("" + s.charAt (i));
	    //sleep for a bit after printing a letter
	    try
	    {
		Thread.sleep (25);
	    }
	    catch (InterruptedException m)
	    {
		;
	    }
	}
	System.out.println ();
    }


    public void printSlow (String s)
    {
	for (int i = 0 ; i < s.length () ; i++)
	{
	    System.out.print ("" + s.charAt (i));
	    //sleep for a bit after printing a letter
	    try
	    {
		Thread.sleep (50);
	    }
	    catch (InterruptedException m)
	    {
		;
	    }
	}
	System.out.println ();
    }
}


