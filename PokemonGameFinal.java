// Pranay Kotian
// April 7th 2016
// Interactive Game

/*
Pokemon ASCII Art used from: http://www.fiikus.net/?pokedex
ASCII titles used from: http://www.network-science.de/ascii/
ASCII birthday used from: http://www.chris.com/ascii/index.php?art=events/birthday
ASCII lock used from: http://ascii.co.uk/art/lock
*/

import javax.swing.*;
import java.util.*;
import java.text.*;
import java.applet.*;
import java.awt.*;

public class PokemonGameFinal
{
    public static void main (String args[])
    {
	new PokemonGameFinal ();
    }


    //Global variable
    String Poke = "Pikachu";
    int points = 0;



    public PokemonGameFinal ()
    {
	Date now = new Date ();
	DateFormat df = DateFormat.getDateInstance ();
	String s = df.format (now);
	System.out.println ("                                                                   Today is " + s);
	PokemonGame ();
    }


    public void PokemonGame ()
    {
	System.out.println ("\n                          _ _ _ ____ _    ____ ____ _  _ ____    ___ ____    ___ _  _ ____   _ _ _ ____ ____ _    ___     ____ ____ ");
	System.out.println ("                          | | | |___ |    |    |  | |\\/| |___     |  |  |     |  |__| |___   | | | |  | |__/ |    |  \\    |  | |___ ");
	System.out.println ("                          |_|_| |___ |___ |___ |__| |  | |___     |  |__|     |  |  | |___   |_|_| |__| |  \\ |___ |__/    |__| |    ");
	System.out.println ("\n");
	System.out.println ("           PPPPPPPPPPPPPPPPP                   kkkkkkkk                            ");
	System.out.println ("           P::::::::::::::::P                  k::::::k                            ");
	System.out.println ("           P::::::PPPPPP:::::P                 k::::::k                            ");
	System.out.println ("           PP:::::P     P:::::P                k::::::k                            ");
	System.out.println ("             P::::P     P:::::P  ooooooooooo    k:::::k    kkkkkkk eeeeeeeeeeee       mmmmmmm    mmmmmmm      ooooooooooo   nnnn  nnnnnnnn  ");
	System.out.println ("             P::::P     P:::::Poo:::::::::::oo  k:::::k   k:::::kee::::::::::::ee   mm:::::::m  m:::::::mm  oo:::::::::::oo n:::nn::::::::nn  ");
	System.out.println ("             P::::PPPPPP:::::Po:::::::::::::::o k:::::k  k:::::ke::::::eeeee:::::eem::::::::::mm::::::::::mo:::::::::::::::on::::::::::::::nn ");
	System.out.println ("             P:::::::::::::PP o:::::ooooo:::::o k:::::k k:::::ke::::::e     e:::::em::::::::::::::::::::::mo:::::ooooo:::::onn:::::::::::::::n");
	System.out.println ("             P::::PPPPPPPPP   o::::o     o::::o k::::::k:::::k e:::::::eeeee::::::em:::::mmm::::::mmm:::::mo::::o     o::::o  n:::::nnnn:::::n");
	System.out.println ("             P::::P           o::::o     o::::o k:::::::::::k  e:::::::::::::::::e m::::m   m::::m   m::::mo::::o     o::::o  n::::n    n::::n");
	System.out.println ("             P::::P           o::::o     o::::o k:::::::::::k  e::::::eeeeeeeeeee  m::::m   m::::m   m::::mo::::o     o::::o  n::::n    n::::n");
	System.out.println ("             P::::P           o::::o     o::::o k::::::k:::::k e:::::::e           m::::m   m::::m   m::::mo::::o     o::::o  n::::n    n::::n");
	System.out.println ("           PP::::::PP         o:::::ooooo:::::ok::::::k k:::::ke::::::::e          m::::m   m::::m   m::::mo:::::ooooo:::::o  n::::n    n::::n");
	System.out.println ("           P::::::::P         o:::::::::::::::ok::::::k  k:::::ke::::::::eeeeeeee  m::::m   m::::m   m::::mo:::::::::::::::o  n::::n    n::::n");
	System.out.println ("           P::::::::P          oo:::::::::::oo k::::::k   k:::::kee:::::::::::::e  m::::m   m::::m   m::::m oo:::::::::::oo   n::::n    n::::n");
	System.out.println ("           PPPPPPPPPP            ooooooooooo   kkkkkkkk    kkkkkkk eeeeeeeeeeeeee  mmmmmm   mmmmmm   mmmmmm   ooooooooooo     nnnnnn    nnnnnn");
	//Get the user's name
	String username = JOptionPane.showInputDialog ("What is your name? "); //Using Pranay as the name allows me to individually test each task (I can skip previous tasks)
	if (username.equals ("Pranay"))
	{
	    char task = IBIO.inputChar ("\nWhat task would you like? (a) ProfOak, (b) ProfOakSnooze, (c) trainerTest, (d) PokeBattle, (e) RiddleDoor, (f) Password>> ");
	    if (task == 'a')
		ProfOak ();
	    else if (task == 'b')
		ProfOakSnooze ();
	    else if (task == 'c')
		trainerTest ();
	    else if (task == 'd')
		PokeBattle ();
	    else if (task == 'e')
		RiddleDoor ();
	    else
		Password ();

	}
	printFast ("\n\nIn this game decisions matter! Every choice or mistake you make can impact the ending of the game! Good luck!\n");
	printFast ("Hi " + username + "! You hear the beeping of your alarm clock as you slowly open your eyes.");
	printFast ("You are still sleepy because you stayed up late last night watching Elite Four Pokemon battles.");

	int failed = 0;
	String snooze = ("");
	while (failed != 5)
	{
	    snooze = IBIO.inputString ("Do you hit the snooze button and sleep for another 10 minutes?\n(Yes/ No): ");
	    if (snooze.equalsIgnoreCase ("no") || snooze.equalsIgnoreCase ("n")) //This decision will decide whether or not you arrive on time for starter pokemon selection!
		ProfOak ();
	    else if (snooze.equalsIgnoreCase ("yes") || snooze.equalsIgnoreCase ("y")) //This decision won't negatively impact the end result of the game, it will just impact some tasks.
		ProfOakSnooze ();
	    else
	    {
		failed++;
		printFast ("Invalid respose.\n");
	    }
	}
	if (failed == 5)
	    printFast ("Ok. Goodbye."); //Just something random I wanted to add.
    }


    public void ProfOak ()
    {
	printFast ("\nYou just realized today is your 10th birthday! Today is the day you can get your first starter Pokemon from Professor Oak!\n");
	birthday ();
	printFast ("\nYou quickly get out of bed, brush your teeth, eat breakfast and head out to Professor Oak's lab");
	printFast ("The question is which Pokemon you'll choose. You figure you'll decide when you get to the lab and see them all.");
	printFast ("The professor greets you at the door. Welcome! You are the first person to arrive so you get first pick for your starter Pokemon.\n");
	StarterPokeASCII ();

	String StarterPoke = ("");
	while (StarterPoke.equals (""))
	{
	    StarterPoke = IBIO.inputString ("\nWould you like Bulbasaur, Charmander, or Squirtle? "); //Poke is the global variable I use that will allow me to modify the other tasks based on this decision.
	    if (StarterPoke.equalsIgnoreCase ("Bulbasaur"))
		Poke = "Bulbasaur";
	    else if (StarterPoke.equalsIgnoreCase ("Charmander"))
		Poke = "Charmander";
	    else if (!StarterPoke.equalsIgnoreCase ("Squirtle"))
	    {
		StarterPoke = ("");
		System.out.println ("Invalid response.");
	    }
	    else
		Poke = "Squirtle";
	}

	printFast ("\n\nWith your starter Pokemon and Pokedex at hand you decide you should now go learn more about Pokemon at the Pokemon Trainers School.\n");
	trainerTest ();
    }


    public void ProfOakSnooze ()
    {
	printFast ("\nYou wake up feeling refreshed but your refreshment is shortlived as you realize what time it is.");
	printFast ("11PM? You must have turned your alarm clock off instead of hitting the snooze button. ");
	printFast ("Today is your 10th birthday! Today is the day you can get your first starter Pokemon from Professor Oak! You are going to be late for selection!\n");
	birthday ();
	printFast ("\nYou quickly get out of bed, brush your teeth, eat breakfast and head out to Professor Oak's lab");
	printFast ("The question is which Pokemon you'll choose. You figure you'll decide when you get to the lab and see them all.");
	printFast ("The professor greets you at the door. Are you here for a starter Pokemon? I'm afraid we've given them all out.");
	printFast ("There is one other Pokemon, but other trainers have run into problems with it. You take the Pokemon anyways and inside the Pokeball is a Pikachu.\n");
	Pikachu ();

	printFast ("\n\nWith your starter Pokemon and Pokedex at hand you decide you should now go learn more about Pokemon at the Pokemon Trainers School.\n");
	Poke = "Pikachu";
	trainerTest ();

    }


    public void StarterPokeASCII ()
    {
	Bulbasaur ();
	try
	{
	    Thread.sleep (2000);                //1000 milliseconds is one second.
	}
	catch (InterruptedException ex)
	{
	    Thread.currentThread ().interrupt ();
	}
	Squirtle ();
	try
	{
	    Thread.sleep (2000);                //1000 milliseconds is one second.
	}
	catch (InterruptedException ex)
	{
	    Thread.currentThread ().interrupt ();
	}
	Charmander ();
	try
	{
	    Thread.sleep (2000);                //1000 milliseconds is one second.
	}
	catch (InterruptedException ex)
	{
	    Thread.currentThread ().interrupt ();
	}
    }


    public void trainerTest ()
    {
	/*  On this program, your knowledge of
	various different pokemon types
	is tested
	*/
	printFast ("You have arrived at the Pokemon Trainer School.");
	printFast ("You need to take a test on Pokemon types to pass this course.\n");

	//String uT = ("");
	int wrong = 0;
	int right = 0;
	while ((wrong < 7) && (right < 7))
	{
	    String type = (randomType ());

	    //uT means the type the user selects

	    String uT = IBIO.inputString ("What is super effective against " + type + "? "); //Questions can be repeated.
	    if (superEffective (type, uT) == true)
	    {
		printFast ("Correct!\n");
		right++;
	    }
	    else
	    {
		printFast ("Wrong. This type is not super effective agaisnt " + type + ".\n");
		wrong++;
	    }
	}
	char replay = '\0';
	if (right > 5)
	{
	    printFast ("You have passed the test. Congratulations! You can now move on to a real Pokemon battle!");
	    PokeBattle ();
	}

	else
	{
	    printFast ("You have failed the test. You can retake the test as many times as you would like.");
	    points -= 2;
	    char retry = IBIO.inputChar ("Would you like to retake the test(y/n)? ");
	    if (retry == 'y')
		trainerTest ();
	    else
		replay = IBIO.inputChar ("Would you like to replay the game(y/n)? ");
	    if (replay == 'y')
		PokemonGame ();
	    if (replay == 'n')
		printFast ("Hope you enjoyed playing! Goodbye!");
	}
    }


    public String randomType ()
    {
	int x = (int) (Math.random () * 17);
	String[] type = {"Normal", "Fire", "Water", "Electric", "Grass", "Ice", "Fighting", "Poison", "Ground", "Flying", "Psychic", "Bug", "Rock", "Ghost", "Dragon", "Dark", "Steel"};
	return type [x];
    }


    public boolean superEffective (String type, String uT)
    {
	/*  if the type the user picks is super effective
	    agaisnt the type provided this method will
	    return true
	    if the user picks an incorrect type it will
	    return false
	*/
	if ((type.equalsIgnoreCase ("Normal")) && (uT.equalsIgnoreCase ("Fighting")))
	    return true;
	else if ((type.equalsIgnoreCase ("Fire")) && ((uT.equalsIgnoreCase ("Water")) || (uT.equalsIgnoreCase ("Ground")) || (uT.equalsIgnoreCase ("Rock"))))
	    return true;
	else if ((type.equalsIgnoreCase ("Water")) && ((uT.equalsIgnoreCase ("Electric")) || (uT.equalsIgnoreCase ("Grass"))))
	    return true;
	else if ((type.equalsIgnoreCase ("Electric")) && (uT.equalsIgnoreCase ("Ground")))
	    return true;
	else if ((type.equalsIgnoreCase ("Grass")) && ((uT.equalsIgnoreCase ("Fire")) || (uT.equalsIgnoreCase ("Ice")) || (uT.equalsIgnoreCase ("Poison")) || (uT.equalsIgnoreCase ("Flying")) || (uT.equalsIgnoreCase ("Bug"))))
	    return true;
	else if ((type.equalsIgnoreCase ("Ice")) && ((uT.equalsIgnoreCase ("Fire")) || (uT.equalsIgnoreCase ("Fighting")) || (uT.equalsIgnoreCase ("Rock")) || (uT.equalsIgnoreCase ("Steel"))))
	    return true;
	else if ((type.equalsIgnoreCase ("Fighting")) && ((uT.equalsIgnoreCase ("Flying")) || (uT.equalsIgnoreCase ("Psychic"))))
	    return true;
	else if ((type.equalsIgnoreCase ("Poison")) && ((uT.equalsIgnoreCase ("Ground")) || (uT.equalsIgnoreCase ("Psychic"))))
	    return true;
	else if ((type.equalsIgnoreCase ("Ground")) && ((uT.equalsIgnoreCase ("Water")) || (uT.equalsIgnoreCase ("Grass")) || (uT.equalsIgnoreCase ("Ice"))))
	    return true;
	else if ((type.equalsIgnoreCase ("Flying")) && ((uT.equalsIgnoreCase ("Electric")) || (uT.equalsIgnoreCase ("Ice")) || (uT.equalsIgnoreCase ("Rock"))))
	    return true;
	else if ((type.equalsIgnoreCase ("Psychic")) && ((uT.equalsIgnoreCase ("Bug")) || (uT.equalsIgnoreCase ("Ghost")) || (uT.equalsIgnoreCase ("Dark"))))
	    return true;
	else if ((type.equalsIgnoreCase ("Bug")) && ((uT.equalsIgnoreCase ("Fire")) || (uT.equalsIgnoreCase ("Flying")) || (uT.equalsIgnoreCase ("Rock"))))
	    return true;
	else if ((type.equalsIgnoreCase ("Rock")) && ((uT.equalsIgnoreCase ("Water")) || (uT.equalsIgnoreCase ("Grass")) || (uT.equalsIgnoreCase ("Fighting")) || (uT.equalsIgnoreCase ("Ground")) || (uT.equalsIgnoreCase ("Steel"))))
	    return true;
	else if ((type.equalsIgnoreCase ("Ghost")) && ((uT.equalsIgnoreCase ("Ghost")) || (uT.equalsIgnoreCase ("Dark"))))
	    return true;
	else if ((type.equalsIgnoreCase ("Dragon")) && ((uT.equalsIgnoreCase ("Ice")) || (uT.equalsIgnoreCase ("Dragon"))))
	    return true;
	else if ((type.equalsIgnoreCase ("Dark")) && ((uT.equalsIgnoreCase ("Fighting")) || (uT.equalsIgnoreCase ("Bug"))))
	    return true;
	else if ((type.equalsIgnoreCase ("Steel")) && ((uT.equalsIgnoreCase ("Fire")) || (uT.equalsIgnoreCase ("Fighting")) || (uT.equalsIgnoreCase ("Ground"))))
	    return true;
	else
	    return false;
    }


    public void PokeBattle ()
    { // Since this method is completely based on chance it has less of an impact on the final ending. You can lose this method a bunch and still get the best ending.
	int cPoint = 0;
	int uPoint = 0;
	int game = 1;

	printFast ("\nOh no! Team Rocket is stealing Pokemon from the Pokemon Center!");
	printFast ("Someone has to do something to stop them!");
	printFast ("You follow them back to their hideout.");
	printFast ("You try to enter but Team Rocket grunt stops you and challenges you to a Pokemon battle! ");
	printFast ("Team Rocket grunt sends out his Weezing!\n");
	Weezing ();
	try
	{
	    Thread.sleep (2000);                //1000 milliseconds is one second.
	}
	catch (InterruptedException ex)
	{
	    Thread.currentThread ().interrupt ();
	}
	printFast ("You send out your " + Poke + "!");
	if (Poke == "Bulbasaur")
	    Bulbasaur ();
	if (Poke == "Charmander")
	    Charmander ();
	if (Poke == "Squirtle")
	    Squirtle ();
	if (Poke == "Pikachu")
	    Pikachu ();

	String userstring = "";
	String compstring = "";
	while (cPoint < 6 && uPoint < 5)
	{
	    char user = userChoice ();
	    if (user == 'a') // My entire "Pikachu not listening to you" mecahnic doesn't actually impact the game at all because the computer's choice is still randomized
	    {
		if (Poke == "Charmander")
		    userstring = "Fire Fang";
		else if (Poke == "Bulbasaur")
		    userstring = "Vine Whip";
		else if (Poke == "Pikachu")
		{
		    userstring = "Light Screen";
		    user = 'b';
		}
		else
		    userstring = "Hydro Pump";
	    }
	    else if (user == 'b')
	    {
		if (Poke == "Charmander")
		    userstring = "Smokescreen";
		else if (Poke == "Bulbasaur")
		    userstring = "Sleep Powder";
		else if (Poke == "Pikachu")
		{
		    userstring = "Thunder";
		    user = 'c';
		}
		else
		    userstring = "Protect";
	    }
	    else
	    {
		if (Poke == "Charmander")
		    userstring = "Inferno";
		else if (Poke == "Bulbasaur")
		    userstring = "Synthesis";
		else if (Poke == "Pikachu")
		{
		    userstring = "Quick Attack";
		    user = 'a';
		}
		else
		    userstring = "Rapid Spin";
	    }

	    if (Poke != "Pikachu")
		printFast (Poke + " uses " + userstring + "!");
	    else
		printFast ("Pikachu didn't obey your command! He uses " + userstring + " instead!");

	    char comp = compChoice ();
	    if (compChoice () == 'a')
		compstring = "Poison Gas";
	    else if (compChoice () == 'b')
		compstring = "Gyro Ball";
	    else
		compstring = "Sludge";

	    System.out.println ("Weezing uses " + compstring);
	    char win = winner (user, comp);
	    if (win == 'c')
	    {
		cPoint++;
		System.out.println ("\nWeezing has the stronger attack!");
	    }
	    else if (win == 'u')
	    {
		uPoint++;
		System.out.println ("\nYou have the stronger attack!");

	    }
	    else
		System.out.println ("\nThere is a tie!");
	    System.out.println ("Successful attacks: You: " + uPoint + " Computer: " + cPoint);
	}

	if (uPoint == 5)
	{
	    printFast ("\nYou won the battle with more successful attacks! Team Rocket Grunt dropped a keycard to the Team Rocket secret base!");
	    printFast ("It reads: TEWOMH. You probably have to unscramble this to find the password");
	    RiddleDoor ();
	}
	else
	{
	    points--;
	    printFast ("\nYou lost the battle! Weezing got more successful attacks!\n");
	    char retry = IBIO.inputChar ("Would you like to retry the battle (y/n)? ");
	    if (retry == 'n' || retry == 'N')
	    {
		char replay = IBIO.inputChar ("Would you like to replay the game (y/n)? ");
		if (replay == 'n' || replay == 'N')
		    printFast ("Hope you enjoyed playing! Goodbye!");
		else
		    PokemonGame ();
	    }
	    else
		PokeBattle ();


	}

    }


    public boolean isValid (char x)
    {
	if (x == 'a' || x == 'A')
	    return false;
	else if (x == 'b' || x == 'B')
	    return false;
	else if (x == 'c' || x == 'C')
	    return false;
	else
	    return true;
    }


    public char userChoice ()
    {
	if (Poke == "Bulbasaur") //Different moves depending on the user's starter Pokemon.
	{
	    System.out.println ("\nYou can either choose Vine Whip, Sleep Powder or Synthesis.");
	    System.out.println ("(a) Vine Whip defeats Weezing's Gyro Ball.");
	    System.out.println ("(b) Sleep Powder defeats Weezing's Sludge.");
	    System.out.println ("(c) Synthesis defeats Weezing's Poison Gas.");
	}
	else if (Poke == "Charmander")
	{
	    System.out.println ("\nYou can either choose Fire Fang, Smokescreen or Inferno.");
	    System.out.println ("(a) Fire Fang defeats Weezing's Gyro Ball.");
	    System.out.println ("(b) Smokescreen defeats Weezing's Sludge.");
	    System.out.println ("(c) Inferno defeats Weezing's Poison Gas.");
	}
	else if (Poke == "Pikachu")
	{
	    System.out.println ("\nYou can either choose Quick Attack, Light Screen or Thunder.");
	    System.out.println ("(a) Quick Attack defeats Weezing's Gyro Ball.");
	    System.out.println ("(b) Light Screen defeats Weezing's Sludge.");
	    System.out.println ("(c) Thunder defeats Weezing's Poison Gas.");
	}
	else
	{
	    System.out.println ("\nYou can either choose Hydro Pump, Protect, or Rapid Spin.");
	    System.out.println ("(a) Hydro Pump defeats Weezing's Gyro Ball.");
	    System.out.println ("(b) Protect defeats Weezing's Sludge.");
	    System.out.println ("(c) Rapid Spin defeats Weezing's Poison Gas.");
	}

	boolean a = true;
	char x = 'z';
	while (a == true)
	{
	    x = IBIO.inputChar ("\nWhat move do you want to use? ");
	    a = isValid (x);
	    if (isValid (x) == true)
		printFast ("Invald move. Reselect.");
	}

	if (x == 'a' || x == 'A')
	    return 'a';
	else if (x == 'b' || x == 'B')
	    return 'b';
	else
	    return 'c';
    }


    public char compChoice ()
    {
	int x = (int) (Math.random () * 3) + 1;
	switch (x)
	{
	    case 1:
		return 'a';

	    case 2:
		return 'b';

	    case 3:
		return 'c';
	}
	return 'c';
    }


    public char winner (char comp, char user)
    { //comp and user both hold a, b, c
	//returns c for computer, u for user and b for both
	if (user == 'a' && comp == 'b')
	    return 'u';
	else if (user == 'a' && comp == 'c')
	    return 'c';
	else if (user == 'b' && comp == 'a')
	    return 'c';
	else if (user == 'b' && comp == 'c')
	    return 'u';
	else if (user == 'c' && comp == 'a')
	    return 'u';
	else if (user == 'c' && comp == 'b')
	    return 'c';
	else
	    return 'b';
    }


    public void RiddleDoor ()
    {
	lock ();
	printFast ("\nThe door is locked and it seems you must answer a series of riddles to open the door and enter.");
	String rid1 = "";
	do
	{
	    rid1 = IBIO.inputString ("\nCatch me and a pearl has a chance of being yours.\nNo need for a stone.\nWho am I? ");
	    if (rid1.equalsIgnoreCase ("cloyster"))
		printFast ("Correct!");
	    else
	    {
		printFast ("Inncorrect! Try Again.");
		points--;
	    }
	}
	while (!rid1.equalsIgnoreCase ("cloyster"));

	String rid2 = "";
	do
	{
	    rid2 = IBIO.inputString ("\nI use what is stored in my cheekpouch to survive, very cautiously.\nWho am I? ");
	    if (rid2.equalsIgnoreCase ("patrat"))
		printFast ("Correct!");
	    else
	    {
		printFast ("Inncorrect! Try Again.");
		points--;
	    }
	}
	while (!rid2.equalsIgnoreCase ("patrat"));

	String rid3 = "";
	do
	{
	    rid3 = IBIO.inputString ("\nI am half... water? Gained ability to fly and two solid legs.\nWho am I? ");
	    if (rid3.equalsIgnoreCase ("dragonite"))
		printFast ("Correct!");
	    else
	    {
		printFast ("Inncorrect! Try Again.");
		points--;
	    }
	}
	while (!rid3.equalsIgnoreCase ("dragonite"));

	String rid4 = "";
	do
	{
	    rid4 = IBIO.inputString ("\nAn angry larva that shan't ever grow to be productively crowned.\nWho am I? ");
	    if (rid4.equalsIgnoreCase ("polywrath"))
		printFast ("Correct!");
	    else
	    {
		printFast ("Inncorrect! Try Again.");
		points--;
	    }
	}
	while (!rid4.equalsIgnoreCase ("polywrath"));

	String rid5 = "";
	do
	{
	    rid5 = IBIO.inputString ("\nI was Giovanni's, as was shown in file 3, a long time ago.\nWho am I? ");
	    if (rid5.equalsIgnoreCase ("charmander"))
		printFast ("Correct!");
	    else
	    {
		printFast ("Inncorrect! Try Again.");
		points--;
	    }
	}
	while (!rid5.equalsIgnoreCase ("charmander"));

	printFast ("\nYou have completed all the riddles but there is still one final password required to open the door!");
	Password ();
    }


    public void Password ()
    {
	String secret = "MEOWTH";
	String guess = "";

	//while they haven't got the password yet
	while (!guess.equals (secret))
	{
	    guess = IBIO.inputString ("Enter the password: ");
	    if (!guess.equals (secret))
		System.out.println ("Sorry please try again.");
	}
	//if they are out of the loop, they got the password
	System.out.println ("Correct! Please continue.");
	Ending ();
    }


    public void Ending ()
    {
	if (points == 0)
	{
	    printFast ("\nYou bypass the riddles and password with ease. The door opens and you see a machine that is meant to transport the stolen Pokeballs to another location.");
	    printFast ("If the pokeballs gets transported you dont be able to find them!");
	    printFast ("You quickly shut down the machine and alert the police of the Team Rocket facility.");
	    printFast ("With your help, all of the Pokeballs are returned to their respective trainers and Team Rocket members are arrested before they can escape!");
	    PokePic ();
	    printFast ("The End.\n");
	}
	else if (points > -6)
	{
	    printFast ("\nYou bypass the riddles and password quickly. The door opens and you see a machine that is meant to transport the stolen Pokeballs to another location.");
	    printFast ("If the pokeballs gets transported you dont be able to find them!");
	    printFast ("You quickly shut down the machine and alert the police of the Team Rocket facility.");
	    printFast ("With your help, all of the Pokeballs are returned to their respective trainers but Team Rocket members escape before the police show up.");
	    printFast ("The End.\n");
	}
	else if (points < -10)
	{
	    printFast ("\nIt takes you some time to bypass the riddles and password. The door opens and you see a machine that is meant to transport the stolen Pokeballs to another location.");
	    printFast ("If the pokeballs gets transported you dont be able to find them!");
	    printFast ("You shut down the machine but not before half of the Pokeballs are transported.");
	    printFast ("Some trainers recieve their Pokeballs back but the unlucky trainers lose their Pokemon. Team Rocket escapes with half the stolen Pokemon.");
	    printFast ("The End.\n");
	}
	else if (points < -20)
	{
	    printFast ("\nIt takes you a long time to bypass the riddles and password. The door opens and you see a machine that is meant to transport the stolen Pokeballs to another location.");
	    printFast ("Unfortunately you are too late. All the Pokeballs have already been transported.");
	    printFast ("All of the trainers lost their Pokemon. Team Rocket escapes with all the stolen Pokeballs.");
	    printFast ("The End.\n");
	}
	else
	{
	    printFast ("\nYou bypass the riddles and password fairly quickly. The door opens and you see a machine that is meant to transport the stolen Pokeballs to another location.");
	    printFast ("If the pokeballs gets transported you dont be able to find them!");
	    printFast ("You quickly shut down the machine but a few Pokeballs are transported before you do so.");
	    printFast ("Most trainers got back their Pokemon. Only a few unlucky trainers lost their Pokemon. Team Rocket escapes with the few stolen Pokemon.");
	    printFast ("The End.\n");
	}

	char replay = IBIO.inputChar ("Would you like to replay the game (y/n)? ");
	if (replay == 'n' || replay == 'N')
	    printFast ("Hope you enjoyed playing! Goodbye!\n");
	else
	    PokemonGame ();
    }


    public void Weezing ()
    {
	System.out.println ("                                                                         __....____,'  `-.");
	System.out.println ("                                                                ,\"\"-..-'\"          \"-    |       ..      _.._");
	System.out.println ("                                                                |        _, .,           '._    /  `'\"\"\"'    |");
	System.out.println ("                                                               .'         _____             `.,'     ____     `.");
	System.out.println ("                                                            _,\" _.'      \\  |  '\"--..        '       \\__ `\"-.   `.");
	System.out.println ("                                                           | ,'\"|/        `-.______,'      `     ' |\\_  `'\"\"'  .  \\");
	System.out.println ("                                                           .'---'      _____             . '   `   |,'\"\"\"-._  ' \\  .");
	System.out.println ("                                                          /   __..--\"\"|___/ \"-.._/|         ,'       ___    `. \\ \\ '_");
	System.out.println ("                                                         . .'...-----'\"\"----.._.' |-.      |        | ,.`\".   \\ `'   |");
	System.out.println ("                                                         | `\"                  \"-.'-'      `.        \\`._`.\\   |.  .-'");
	System.out.println ("                                                       .\"        _..._                 .              `._  ,   `.' |");
	System.out.println ("                                                        `.    ,\"'_....`\".               |                \"\"       .");
	System.out.println ("                                                         |    | |     | |             -'   `,                    /");
	System.out.println ("                                                         `,.  `._`---'_,'  ,-.    '        ' `-.             _   |");
	System.out.println ("                                                         ,\\ `._  |___|  _,'  |  `    \\        . /-.__     _.' `-\"");
	System.out.println ("                                                         \\ `.._`-._ _.-'_,.--'        |        `.    |  ,'");
	System.out.println ("                                                          `-\"\\ `-. ' ,'_         `-..'       .-'    /  /");
	System.out.println ("                                                              `._.---._ `\"----.        .   ,'.   _.'  /");
	System.out.println ("                                                                `.     `'-.._/       -\" ,-\" `.`-'      `.");
	System.out.println ("                                                                  `.,       .-\"    _    |     | .     ) |");
	System.out.println ("                                                                    '._  ,\"`----\"\"`.    |     ' `'       .");
	System.out.println ("                                                                       \"\"           `--'       \\`      ,\"'");
	System.out.println ("                                                                                                `-._,-'");
    }


    public void Bulbasaur ()
    {
	System.out.println ("\n                                           /");
	System.out.println ("                        _,.------....___,.' ',.-.");
	System.out.println ("                     ,-'          _,.--\"        |");
	System.out.println ("                   ,'         _.-'              .");
	System.out.println ("                  /   ,     ,'                   `");
	System.out.println ("                 .   /     /                     ``.");
	System.out.println ("                 |  |     .                       \\.\\");
	System.out.println ("       ____      |___._.  |       __               \\ `.");
	System.out.println ("     .'    `---\"\"       ``\"-.--\"'`  \\               .  \\");
	System.out.println ("    .  ,            __               `              |   .");
	System.out.println ("    `,'         ,-\"'  .               \\             |    L");
	System.out.println ("   ,'          '    _.'                -._          /    |");
	System.out.println ("  ,`-.    ,\".   `--'                      >.      ,'     |");
	System.out.println (" . .'\\'   `-'       __    ,  ,-.         /  `.__.-      ,'");
	System.out.println (" ||:, .           ,'  ;  /  / \\ `        `.    .      .'/");
	System.out.println (" j|:D  \\          `--'  ' ,'_  . .         `.__, \\   , /");
	System.out.println ("/ L:_  |                 .  \"' :_;                `.'.'");
	System.out.println (".    \"\"'                  \"\"\"\"\"'                    V");
	System.out.println (" `.                                 .    `.   _,..  `");
	System.out.println ("   `,_   .    .                _,-'/    .. `,'   __  `");
	System.out.println ("    ) \\`._        ___....----\"'  ,'   .'  \\ |   '  \\  .");
	System.out.println ("   /   `. \"`-.--\"'         _,' ,'     `---' |    `./  |");
	System.out.println ("  .   _  `\"\"'--.._____..--\"   ,             '         |");
	System.out.println ("  | .\" `. `-.                /-.           /          ,");
	System.out.println ("  | `._.'    `,_            ;  /         ,'          .");
	System.out.println (" .'          /| `-.        . ,'         ,           ,");
	System.out.println (" '-.__ __ _,','    '`-..___;-...__   ,.'\\ ____.___.'");
	System.out.println (" `\"^--'..'   '-`-^-'\"--    `-^-'`.''\"\"\"\"\"`.,^.`.--'");
	System.out.println ("");
	System.out.println ("       ___  _  _ _    ___  ____ ____ ____ _  _ ____ ");
	System.out.println ("       |__] |  | |    |__] |__| [__  |__| |  | |__/ ");
	System.out.println ("       |__] |__| |___ |__] |  | ___] |  | |__| |  \\ ");
    }


    //ASCII Art of Bulbasaur for starter pokemon selection

    public void Charmander ()
    {
	System.out.println ("\n                                                   _.--\"\"`-..");
	System.out.println ("                                                 ,'          `.");
	System.out.println ("                                               ,'          __  `.");
	System.out.println ("                                              /|          \" __   \\");
	System.out.println ("                                             , |           / |.   .");
	System.out.println ("                                             |,'          !_.'|   |");
	System.out.println ("                                           ,'             '   |   |");
	System.out.println ("                                          /              |`--'|   |");
	System.out.println ("                                         |                `---'   |");
	System.out.println ("                                          .   ,                   |                       ,\".");
	System.out.println ("                                           ._     '           _'  |                    , ' \\ `");
	System.out.println ("                                       `.. `.`-...___,...---\"\"    |       __,.        ,`\"   L,|");
	System.out.println ("                                       |, `- .`._        _,-,.'   .  __.-'-. /        .   ,    \\");
	System.out.println ("                                     -:..     `. `-..--_.,.<       `\"      / `.        `-/ |   .");
	System.out.println ("                                       `,         \"\"\"\"'     `.              ,'         |   |  ',,");
	System.out.println ("                                         `.      '            '            /          '    |'. |/");
	System.out.println ("                                           `.   |              \\       _,-'           |       ''");
	System.out.println ("                                             `._'               \\   '\"\\                .      |");
	System.out.println ("                                                |                '     \\                `._  ,'");
	System.out.println ("                                                |                 '     \\                 .'|");
	System.out.println ("                                                |                 .      \\                | |");
	System.out.println ("                                                |                 |       L              ,' |");
	System.out.println ("                                                `                 |       |             /   '");
	System.out.println ("                                                 \\                |       |           ,'   /");
	System.out.println ("                                               ,' \\               |  _.._ ,-..___,..-'    ,'");
	System.out.println ("                                              /     .             .      `!             ,j'");
	System.out.println ("                                             /       `.          /        .           .'/");
	System.out.println ("                                            .          `.       /         |        _.'.'");
	System.out.println ("                                             `.          7`'---'          |------\"'_.'");
	System.out.println ("                                            _,.`,_     _'                ,''-----\"'");
	System.out.println ("                                        _,-_    '       `.     .'      ,\\");
	System.out.println ("                                        -\" /`.         _,'     | _  _  _.|");
	System.out.println ("                                         \"\"--'---\"\"\"\"\"'        `' '! |! /");
	System.out.println ("                                                                 `\" \" -'");
	System.out.println ("");
	System.out.println ("                                         ____ _  _ ____ ____ _  _ ____ _  _ ___  ____ ____ ");
	System.out.println ("                                         |    |__| |__| |__/ |\\/| |__| |\\ | |  \\ |___ |__/ ");
	System.out.println ("                                         |___ |  | |  | |  \\ |  | |  | | \\| |__/ |___ |  \\ ");
    }


    //ASCII Art of Charmander for starter pokemon selection

    public void Squirtle ()
    {
	System.out.println ("                                                                          _,........__");
	System.out.println ("                                                                       ,-'            \"`-.");
	System.out.println ("                                                                     ,'                   `-.");
	System.out.println ("                                                                   ,'                        \\");
	System.out.println ("                                                                 ,'                           .");
	System.out.println ("                                                                 .'\\               ,\"\".       `");
	System.out.println ("                                                                ._.'|             / |  `       \\");
	System.out.println ("                                                                |   |            `-.'  ||       `.");
	System.out.println ("                                                                |   |            '-._,'||       | \\");
	System.out.println ("                                                                .`.,'             `..,'.'       , |`-.");
	System.out.println ("                                                                l                       .'`.  _/  |   `.");
	System.out.println ("                                                                `-.._'-   ,          _ _'   -\" \\  .     `");
	System.out.println ("                                                           `.\"\"\"\"\"'-.`-...,---------','         `. `....__.");
	System.out.println ("                                                           .'        `\"-..___      __,'\\          \\  \\     \\");
	System.out.println ("                                                           \\_ .          |   `\"\"\"\"'    `.           . \\     \\");
	System.out.println ("                                                             `.          |              `.          |  .     L");
	System.out.println ("                                                               `.        |`--...________.'.        j   |     |");
	System.out.println ("                                                                 `._    .'      |          `.     .|   ,     |");
	System.out.println ("                                                                    `--,\\       .            `7\"\"' |  ,      |");
	System.out.println ("                                                                       ` `      `            /     |  |      |    _,-'\"\"\"`-.");
	System.out.println ("                                                                        \\ `.     .          /      |  '      |  ,'          `.");
	System.out.println ("                                                                         \\  v.__  .        '       .   \\    /| /              \\");
	System.out.println ("                                                                          \\/    `\"\"\\\"\"\"\"\"\"\"`.       \\   \\  /.''                |");
	System.out.println ("                                                                           `        .        `._ ___,j.  `/ .-       ,---.     |");
	System.out.println ("                                                                           ,`-.      \\         .\"     `.  |/        j     `    |");
	System.out.println ("                                                                          /    `.     \\       /         \\ /         |     /    j");
	System.out.println ("                                                                         |       `-.   7-.._ .          |\"          '         /");
	System.out.println ("                                                                         |          `./_    `|          |            .     _,'");
	System.out.println ("                                                                         `.           / `----|          |-............`---'");
	System.out.println ("                                                                           \\          \\      |          |");
	System.out.println ("                                                                          ,'           )     `.         |");
	System.out.println ("                                                                           7____,,..--'      /          |");
	System.out.println ("                                                                                             `---.__,--.'");
	System.out.println ("");
	System.out.println ("                                                                              ____ ____ _  _ _ ____ ___ _    ____ ");
	System.out.println ("                                                                              [__  |  | |  | | |__/  |  |    |___ ");
	System.out.println ("                                                                              ___] |_\\| |__| | |  \\  |  |___ |___ ");
    }


    //ASCII Art of Squirtle for starter pokemon selection

    public void Pikachu ()
    {
	System.out.println ("\n                                                        ,-.");
	System.out.println ("                                                     _.|  '");
	System.out.println ("                                                   .'  | /");
	System.out.println ("                                                 ,'    |'");
	System.out.println ("                                                /      /");
	System.out.println ("                                  _..----\"\"---.'      /");
	System.out.println ("            _.....---------...,-\"\"                  ,'");
	System.out.println ("            `-._  \\                                /");
	System.out.println ("                `-.+_            __           ,--. .");
	System.out.println ("                     `-.._     .:  ).        (`--\"| \\");
	System.out.println ("                          7    | `\" |         `...'  \\");
	System.out.println ("                          |     `--'     '+\"        ,\". ,\"\"-");
	System.out.println ("                          |   _...        .____     | |/    '");
	System.out.println ("                     _.   |  .    `.  '--\"   /      `./     j");
	System.out.println ("                    \\' `-.|  '     |   `.   /        /     /");
	System.out.println ("                    '     `-. `---\"      `-\"        /     /");
	System.out.println ("                     \\       `.                  _,'     /");
	System.out.println ("                      \\        `                        .");
	System.out.println ("                       \\                                j");
	System.out.println ("                        \\                              /");
	System.out.println ("                         `.                           .");
	System.out.println ("                           +                          \\");
	System.out.println ("                           |                           L");
	System.out.println ("                           |                           |");
	System.out.println ("                           |  _ /,                     |");
	System.out.println ("                           | | L)'..                   |");
	System.out.println ("                           | .    | `                  |");
	System.out.println ("                           '  \\'   L                   '");
	System.out.println ("                            \\  \\   |                  j");
	System.out.println ("                             `. `__'                 /");
	System.out.println ("                           _,.--.---........__      /");
	System.out.println ("                          ---.,'---`         |   -j\"");
	System.out.println ("                           .-'  '....__      L    |");
	System.out.println ("                         \"\"--..    _,-'       \\ l||");
	System.out.println ("                             ,-'  .....------. `||'");
	System.out.println ("                          _,'                /");
	System.out.println ("                        ,'                  /");
	System.out.println ("                       '---------+-        /");
	System.out.println ("                                /         /");
	System.out.println ("                              .'         /");
	System.out.println ("                            .'          /");
	System.out.println ("                          ,'           /");
	System.out.println ("                        _'....----\"\"\"\"\"");
	System.out.println ("");
    }


    public void PikachuTitle ()
    {
	System.out.println ("                   ___  _ _  _ ____ ____ _  _ _  _ ");
	System.out.println ("                   |__] | |_/  |__| |    |__| |  | ");
	System.out.println ("                   |    | | \\_ |  | |___ |  | |__| ");
    }


    //ASCII Art of Pikachu for alternate starter pokemon selection

    public void birthday ()
    {
	System.out.println ("                                                                    /^\\");
	System.out.println ("                                                          /         (/^\\)     /");
	System.out.println ("                                                     \\   ( \\         \\ /     ( \\     /^\\");
	System.out.println ("                                                    / )   \\ |        _|_      \\ |   |/^\\|");
	System.out.println ("                                                   | /    _|_        | |      _|_    \\ /");
	System.out.println ("                                                   _|_    | |        | |      | |    _|_");
	System.out.println ("                                                   | |    | |        | |      | |    | |");
	System.out.println ("                                                   | |    | |    ****| |******| |    | |");
	System.out.println ("                                                   | |****| |****    | |      | |****| |");
	System.out.println ("                                                  *| |    | |                 | |    | |*****");
	System.out.println ("                                                *  | |   H  A  P  P  Y               | |      *");
	System.out.println ("                                               *                                               *");
	System.out.println ("                                               | *            B  I  R  T  H  D  A  Y  !      * |");
	System.out.println ("                                               |  *****                                 *****  |");
	System.out.println ("                                               |@      **********             **********      @|");
	System.out.println ("                                               | @   @           *************           @   @ |");
	System.out.println ("                                               |  @@@ @    @                       @    @ @@@  |");
	System.out.println ("                                               |       @@@@ @      @       @      @ @@@@       |");
	System.out.println ("                                                *            @@@@@@ @     @ @@@@@@            *");
	System.out.println ("                                                 *                   @@@@@                   *");
	System.out.println ("                                                  *****                                 *****");
	System.out.println ("                                                       **********             **********");
	System.out.println ("                                                                 *************");
    }


    public void lock ()
    {
	System.out.println ("     .--------.");
	System.out.println ("    / .------. \\");
	System.out.println ("   / /        \\ \\");
	System.out.println ("   | |        | |");
	System.out.println ("  _| |________| |_");
	System.out.println (".' |_|        |_| '.");
	System.out.println ("'._____ ____ _____.'");
	System.out.println ("|     .'____'.     |");
	System.out.println ("'.__.'.'    '.'.__.'");
	System.out.println ("'.__  |      |  __.'");
	System.out.println ("|   '.'.____.'.'   |");
	System.out.println ("'.____'.____.'____.'");
	System.out.println ("'.________________.'");
    }


    public void PokePic ()
    {
	JOptionPane.showMessageDialog (null, createImageIcon ("Pok.gif"), "The Pokemon you saved!", JOptionPane.INFORMATION_MESSAGE);
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


    public void printVFast (String s)
    {
	for (int i = 0 ; i < s.length () ; i++)
	{
	    System.out.print ("" + s.charAt (i));
	    //sleep for a bit after printing a letter
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (InterruptedException m)
	    {
		;
	    }
	}
	System.out.println ();
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = PokemonGameFinal.class.getResource (path);
	if (imgURL != null)
	{
	    return new ImageIcon (imgURL);
	}
	else
	{
	    System.err.println ("Couldn't find file: " + path);
	    return null;
	}
    }
}


