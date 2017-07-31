public class PokemonGameTest
{
    public static void main (String args[])
    {
	new PokemonGameTest ();
    }


    public PokemonGameTest ()
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

	String snooze = ("");
	int inValid = 0;
	while ((inValid != 5) && (!snooze.equals ("Yes")) && (!snooze.equals ("No")))
	{
	    snooze = IBIO.inputString ("Do you hit the snooze button and sleep for another 10 minutes?\n(Yes/ No): ");
	    if (snooze.equals ("No")) //This decision will decide whether or not you arrive on time for starter pokemon selection!
		ProfOak ();
	    else if (snooze.equals ("Yes"))
		ProfOakSnooze ();
	    else
	    {
		printFast ("Invalid respose.");
		inValid++;
	    }
	}

    }


    public void ProfOak ()
    {
	printFast ("\nYou just realized today is your 10th birthday! Today is the day you can get your first starter Pokemon from Professor Oak!");
	printFast ("You quickly get out of bed, brush your teeth, eat breakfast and head out to Professor Oak's lab");
	printFast ("The question is quick Pokemon you'll choose. You figure you'll decide when you get to the lab and see them all.");
	printFast ("The professor greets you at the door. Welcome! You are the first person to arrive so you get first pick for your starter Pokemon.\n");
	StarterPokeASCII ();

	char SP = '0';
	String StarterPoke = (" ");
	while (StarterPoke.equals (" "))
	{
	    StarterPoke = IBIO.inputString ("\nWould you like Bulbasaur, Charmander, or Squirtle? ");
	    if (StarterPoke.equals ("Bulbasaur"))
		SP = '1';
	    else if (StarterPoke.equals ("Charmander"))
		SP = '2';
	    else if (!StarterPoke.equals ("Squirtle"))
	    {
		StarterPoke = (" ");
		System.out.println ("Invalid response.");
	    }
	    else
		SP = '3';
	}
    }


    public void ProfOakSnooze ()
    {
	printFast ("\nYou wake up feeling refreshed until you see the time on your alarm clock.");
	printFast ("11PM? You must have turned your alarm clock off instead of hitting the snooze button. ");
	printFast ("Today is your 10th birthday! Today is the day you can get your first starter Pokemon from Professor Oak! You are going to be late for selection!");
	printFast ("You quickly get out of bed, brush your teeth, eat breakfast and head out to Professor Oak's lab");
	printFast ("The question is which Pokemon you'll choose. You figure you'll decide when you get to the lab and see them all.");
	printFast ("The professor greets you at the door. Are you here for a starter Pokemon? I'm afraid we've given them all out.");
	printFast ("There is one other Pokemon, but other trainers have run into problems with it. You take this Pokemon and inside the Pokeball is a Pikachu.\n");
	PikaASCII ();

    }


    /*public void StarterPokeASCII ()
    {
	System.out.println ("                                                                                     _.--\"\"`-..                                                        _,........__");
	System.out.println ("                                                                                   ,'          `.                                                     ,-'            \"`-.");
	System.out.println ("                                                                                 ,'          __  `.                                                 ,'                   `-.");
	System.out.println ("                                           /                                    /|          \" __   \\                                            ,'                        \\");
	System.out.println ("                        _,.------....___,.' ',.-.                              , |           / |.   .                                           ,'                           .");
	System.out.println ("                     ,-'          _,.--\"        |                             |,'          !_.'|   |                                           .'\\               ,\"\".       `");
	System.out.println ("                   ,'         _.-'              .                            ,'             '   |   |                                          ._.'|             / |  `       \\");
	System.out.println ("                  /   ,     ,'                   `                          /              |`--'|   |                                          |   |            `-.'  ||       `.");
	System.out.println ("                 .   /     /                     ``.                       |                `---'   |                                          |   |            '-._,'||       | \\");
	System.out.println ("                 |  |     .                       \\.\\                     .   ,                   |                       ,\".               .`.,'             `..,'.'       , |`-.");
	System.out.println ("       ____      |___._.  |       __               \\ `.                     ._     '           _'  |                    , ' \\ `              l                       .'`.  _/  |   `.");
	System.out.println ("     .'    `---\"\"       ``\"-.--\"'`  \\               .  \\            `.. `.`-...___,...---\"\"    |       __,.        ,`\"   L,|          `-.._'-   ,          _ _'   -\" \\  .     `");
	System.out.println ("    .  ,            __               `              |   .                |, `- .`._        _,-,.'   .  __.-'-. /        .   ,    \\       `.\"\"\"\"\"'-.`-...,---------','         `. `....__.");
	System.out.println ("    `,'         ,-\"'  .               \\             |    L           -:..     `. `-..--_.,.<       `\"      / `.        `-/ |   .       .'        `\"-..___      __,'\\          \\  \\     \\");
	System.out.println ("   ,'          '    _.'                -._          /    |               `,         \"\"\"\"'     `.              ,'         |   |  ',,   \\_ .          |   `\"\"\"\"'    `.           . \\     \\");
	System.out.println ("  ,`-.    ,\".   `--'                      >.      ,'     |                `.      '            '            /          '    |'. |/         `.          |              `.          |  .     L");
	System.out.println (" . .'\\'   `-'       __    ,  ,-.         /  `.__.-      ,'                  `.   |              \\       _,-'           |       ''           `.        |`--...________.'.        j   |     |");
	System.out.println (" ||:, .           ,'  ;  /  / \\ `        `.    .      .'/                     `._'               \\   '\"\\                .      |            `._    .'      |          `.     .|   ,     |");
	System.out.println (" j|:D  \\          `--'  ' ,'_  . .         `.__, \\   , /                        |                '     \\                `._  ,'                 `--,\\       .            `7\"\"' |  ,      |");
	System.out.println ("/ L:_  |                 .  \"' :_;                `.'.'                          |                 '     \\                 .'|                      ` `      `            /     |  |      |    _,-'\"\"\"`-.");
	System.out.println (".    \"\"'                  \"\"\"\"\"'                 V                         |                 .      \\                | |                       \\ `.     .          /      |  '      |  ,'          `.");
	System.out.println (" `.                                 .    `.   _,..  `                             |                 |       L              ,' |                         \\  v.__  .        '       .   \\    /| /              \\");
	System.out.println ("   `,_   .    .                _,-'/    .. `,'   __  `                            `                 |       |             /   '                          \\/    `\"\"\\\"\"\"\"\"\"\"`.       \\   \\  /.''                |");
	System.out.println ("    ) \\`._        ___....----\"'  ,'   .'  \\ |   '  \\  .                        \\                |       |           ,'   /                           `        .        `._ ___,j.  `/ .-       ,---.     |");
	System.out.println ("   /   `. \"`-.--\"'         _,' ,'     `---' |    `./  |                        ,' \\               |  _.._ ,-..___,..-'    ,'                           ,`-.      \\         .\"     `.  |/        j     `    |");
	System.out.println ("  .   _  `\"\"'--.._____..--\"   ,             '         |                      /     .             .      `!             ,j'                            /    `.     \\       /         \\ /         |     /    j");
	System.out.println ("  | .\" `. `-.                /-.           /          ,                       /       `.          /        .           .'/                             |       `-.   7-.._ .          |\"          '         /");
	System.out.println ("  | `._.'    `,_            ;  /         ,'          .                        .          `.       /         |        _.'.'                              |          `./_    `|          |            .     _,'");
	System.out.println (" .'          /| `-.        . ,'         ,           ,                          `.          7`'---'          |------\"'_.'                               `.           / `----|          |-............`---'");
	System.out.println (" '-.__ __ _,','    '`-..___;-...__   ,.'\\ ____.___.'                         _,.`,_     _'                ,''-----\"'                                    \\          \\      |          |");
	System.out.println (" `\"^--'..'   '-`-^-'\"--    `-^-'`.''\"\"\"\"\"`.,^.`.--'                _,-_    '       `.     .'      ,\\                                             ,'           )     `.         |");
	System.out.println ("                                                                          -\" /`.         _,'     | _  _  _.|                                             7____,,..--'      /          |");
	System.out.println ("                                                                           \"\"--'---\"\"\"\"\"'        `' '! |! /                                          `---.__,--.'");
	System.out.println ("                                                                                                   `\" \" -'                              ");
    }

    This method would not work because copy pasting ASCII art side by side messes with the anything copied after the initial ASCII Art (everything after bulbasaur was distorted)
    */

    public void Bulbasaur ()
    {
	System.out.println ("                                           /");
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
	System.out.println ("                                                             _.--\"\"`-..");
	System.out.println ("                                                           ,'          `.");
	System.out.println ("                                                         ,'          __  `.");
	System.out.println ("                                                        /|          \" __   \\");
	System.out.println ("                                                       , |           / |.   .");
	System.out.println ("                                                       |,'          !_.'|   |");
	System.out.println ("                                                     ,'             '   |   |");
	System.out.println ("                                                    /              |`--'|   |");
	System.out.println ("                                                   |                `---'   |");
	System.out.println ("                                                    .   ,                   |                       ,\".");
	System.out.println ("                                                     ._     '           _'  |                    , ' \\ `");
	System.out.println ("                                                 `.. `.`-...___,...---\"\"    |       __,.        ,`\"   L,|");
	System.out.println ("                                                 |, `- .`._        _,-,.'   .  __.-'-. /        .   ,    \\");
	System.out.println ("                                               -:..     `. `-..--_.,.<       `\"      / `.        `-/ |   .");
	System.out.println ("                                                 `,         \"\"\"\"'     `.              ,'         |   |  ',,");
	System.out.println ("                                                   `.      '            '            /          '    |'. |/");
	System.out.println ("                                                     `.   |              \\       _,-'           |       ''");
	System.out.println ("                                                       `._'               \\   '\"\\                .      |");
	System.out.println ("                                                          |                '     \\                `._  ,'");
	System.out.println ("                                                          |                 '     \\                 .'|");
	System.out.println ("                                                          |                 .      \\                | |");
	System.out.println ("                                                          |                 |       L              ,' |");
	System.out.println ("                                                          `                 |       |             /   '");
	System.out.println ("                                                           \\                |       |           ,'   /");
	System.out.println ("                                                         ,' \\               |  _.._ ,-..___,..-'    ,'");
	System.out.println ("                                                        /     .             .      `!             ,j'");
	System.out.println ("                                                       /       `.          /        .           .'/");
	System.out.println ("                                                      .          `.       /         |        _.'.'");
	System.out.println ("                                                       `.          7`'---'          |------\"'_.'");
	System.out.println ("                                                      _,.`,_     _'                ,''-----\"'");
	System.out.println ("                                                  _,-_    '       `.     .'      ,\\");
	System.out.println ("                                                  -\" /`.         _,'     | _  _  _.|");
	System.out.println ("                                                   \"\"--'---\"\"\"\"\"'        `' '! |! /");
	System.out.println ("                                                                           `\" \" -'");
	System.out.println ("");
	System.out.println ("                                                   ____ _  _ ____ ____ _  _ ____ _  _ ___  ____ ____ ");
	System.out.println ("                                                   |    |__| |__| |__/ |\\/| |__| |\\ | |  \\ |___ |__/ ");
	System.out.println ("                                                   |___ |  | |  | |  \\ |  | |  | | \\| |__/ |___ |  \\ ");
    }
//ASCII Art of Charmander for starter pokemon selection
    
    public void Squirtle ()
    {
    
    }
//ASCII Art of Squirtle for starter pokemon selection
    
    public void PikaASCII ()
    {
	System.out.println ("                                             ,-.");
	System.out.println ("                                          _.|  '");
	System.out.println ("                                        .'  | /");
	System.out.println ("                                      ,'    |'");
	System.out.println ("                                     /      /");
	System.out.println ("                       _..----\"\"---.'      /");
	System.out.println (" _.....---------...,-\"\"                  ,'");
	System.out.println (" `-._  \\                                /");
	System.out.println ("     `-.+_            __           ,--. .");
	System.out.println ("          `-.._     .:  ).        (`--\"| \\");
	System.out.println ("               7    | `\" |         `...'  \\");
	System.out.println ("               |     `--'     '+\"        ,\". ,\"\"-");
	System.out.println ("               |   _...        .____     | |/    '");
	System.out.println ("          _.   |  .    `.  '--\"   /      `./     j");
	System.out.println ("         \\' `-.|  '     |   `.   /        /     /");
	System.out.println ("         '     `-. `---\"      `-\"        /     /");
	System.out.println ("          \\       `.                  _,'     /");
	System.out.println ("           \\        `                        .");
	System.out.println ("            \\                                j");
	System.out.println ("             \\                              /");
	System.out.println ("              `.                           .");
	System.out.println ("                +                          \\");
	System.out.println ("                |                           L");
	System.out.println ("                |                           |");
	System.out.println ("                |  _ /,                     |");
	System.out.println ("                | | L)'..                   |");
	System.out.println ("                | .    | `                  |");
	System.out.println ("                '  \\'   L                   '");
	System.out.println ("                 \\  \\   |                  j");
	System.out.println ("                  `. `__'                 /");
	System.out.println ("                _,.--.---........__      /");
	System.out.println ("               ---.,'---`         |   -j\"");
	System.out.println ("                .-'  '....__      L    |");
	System.out.println ("              \"\"--..    _,-'       \\ l||");
	System.out.println ("                  ,-'  .....------. `||'");
	System.out.println ("               _,'                /");
	System.out.println ("             ,'                  /");
	System.out.println ("            '---------+-        /");
	System.out.println ("                     /         /");
	System.out.println ("                   .'         /");
	System.out.println ("                 .'          /");
	System.out.println ("               ,'           /");
	System.out.println ("             _'....----\"\"\"\"\"");
    }
//ASCII Art of Pikachu for alternate starter pokemon selection

    public void trainerTest ()
    {
	/*  On this program, your knowledge of
	various different pokemon types
	is tested
	*/

	char type = (randomType ());
	String uT = IBIO.inputString ("");
	//uT means the type the user selects


    }


    public char randomType ()
    {
	int x = (int) (Math.random () * 17);
	char[] type = {'n', 'f', 'w', 'e', 'g', 'i', 'F', 'p', 'G', 'l', 'P', 'b', 'r', 'h', 'd', 'D', 's'};
	return type [x];
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


