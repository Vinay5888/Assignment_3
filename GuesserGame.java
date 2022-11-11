package practice;

import java.util.Scanner;

class Name
{
	String name;
	
	String name()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Plz Enter your name to start the game :");
		name=sc.nextLine();
		for(int i=0; i<3; i++)
		{
			if(name==name.toUpperCase())
			{
				System.out.println("===========================================================");
				System.out.print("Plz Enter the Name in Lower Case :");
				name=sc.nextLine();
			}
		}
		System.out.println("===========================================================");
		return name;
	}
}
class Entering
{
	int num;
	
	int num()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Plz enter 0 to start the game :");
		num=sc.nextInt();
		for( int i=0; i<1; i--) {
			if(num!=0)
			{
				System.out.println("===========================================================");
				System.out.print(" plz eneter valid number to start the game :");
				num=sc.nextInt();
			}
			
		}
		System.out.println("===========================================================");
		System.out.println("Game was Started");
		System.out.println("===========================================================");
		return num;
	}
}

class Guesser
{
	int guesserNum;
	
	int guesserNum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Guesser Guesse the number between 1to100 :");
		guesserNum=sc.nextInt();
		
		for(int i=0; i<1; i--) {
			if(guesserNum>100 || guesserNum<1) {
				System.out.println("===========================================================");
				System.out.print("Plz enter the number between 0 to 100 :");
				guesserNum=sc.nextInt();
			}
		}
		
		System.out.println("===========================================================");
		
		return guesserNum;
	}
}

class Player1
{
	int playerNum;
	
	int playerNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Player 1 plz guesse the one number :");
		playerNum=sc.nextInt();
		
		System.out.println("===========================================================");
		return playerNum;
	}
}

class Player2
{
	int playerNum;
	
	int playerNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Player 2 plz guesse the one number :");
		playerNum=sc.nextInt();
		
		System.out.println("===========================================================");
		return playerNum;
	}
}

class Player3
{
	int playerNum;
	
	int playerNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Player 3 plz guesse the one number :");
		playerNum=sc.nextInt();
		
		System.out.println("===========================================================");
		return playerNum;
	}
}

class Umpire
{
	String nameData;
	int enterData;
	int guesserData;
	int player1Data;
	int player2Data;
	int player3Data;
	
	void nameCollection()
	{
		Name n=new Name();
		nameData=n.name();
	}
	
	void enterCollection()
	{
		Entering e=new Entering();
		enterData=e.num();
	}
	
	void guessercollection()
	{
		Guesser g= new Guesser();
	    guesserData=g.guesserNum();
	}
	void playersCollection()
	{
		Player1 p1=new Player1();
		Player2 p2=new Player2();
		Player3 p3=new Player3();
		
		player1Data=p1.playerNum();
		player2Data=p2.playerNum();
		player3Data=p3.playerNum();
		
	}
	void compare()
	{
		
		
		if(guesserData==player1Data)
		{
			if(guesserData==player2Data && guesserData==player3Data)
			{
				System.out.println(" all players won the game ");
			}
			else if(guesserData==player2Data)
			{
				System.out.println(" player 1 and playe 2 won the game ");
			}
			else if(guesserData==player3Data)
			{
				System.out.println("player 1 and player 3 won the game");
			}
			else
			{
				System.out.println("player 1 won the game ");
			}
		}
		else if(guesserData==player2Data)
		{
			if (guesserData==player3Data )
			{
				System.out.println("player 2 and player 3 won the game");
			}
			else
			{
				System.out.println("player 2 won the game");
			}
		}
		else if(guesserData==player3Data)
		{
			System.out.println("player 3 won the game");
		}
		else
		{
			System.out.println("game lost try again");
		}
	}
}


public class GuesserGame {

	public static void main(String[] args) {
		
		
		Umpire u=new Umpire();
		
		u.nameCollection();
		u.enterCollection();
		u.guessercollection();
		u.playersCollection();
		u.compare();
	}

}
