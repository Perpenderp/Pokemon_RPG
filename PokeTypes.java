public class PokeTypes
{
    public static void main (String args[])
    {
	new PokeTypes ();
    }


    /*  On this program, your knowledge of
	various different pokemon types
	is tested
    */

    public PokeTypes ()
    {
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


