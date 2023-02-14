

public class Fliprace 
{
	

	public static void main(String[] args) 
	{
		//make new coin objects
		Coin coin1, coin2;
		coin1 = new Coin();
		coin2 = new Coin();
		
		//make heads flip counters for coins
		int coinCount1 = 0;
		int coinCount2 = 0;
		int flipcount1 = 0;
		int flipcount2 = 0;
		
		//while neither of them have gotten 10 heads in a row
		while (coinCount1 != 10 && coinCount2 != 10)
		{
			coin1.flip();
			coin2.flip();
			
			
			//change coin counts +1 if heads, reset to 0 if tails to check for 10 heads in a row
			if (coin1.isHeads())
			{
				
				coinCount1++;
				
			}
			else 
			{
				
				coinCount1 = 0;
				
			}
			
			
			if (coin2.isHeads())
			{
				
				coinCount2++;
				
			}
			else
			{
				
				coinCount2 = 0;
				
			}
			
			//add to flip count to track flips
			flipcount1++;
			flipcount2++;
			
			
		}
		
		if (coinCount1 == 10 && coinCount2 != 10)
		{
			System.out.println("Coin1 won and got 10 heads in: " + flipcount1 + " flips");
			
		}
		else if (coinCount2 == 10 && coinCount1 != 10)
		{
			System.out.println("Coin2 won and got 10 heads in: " + flipcount2 + " flips");
			
		}
		else if (coinCount1 == 10 && coinCount2 == 10)
		{
			System.out.println("Coin1 AND Coin2 won and got 10 heads in: " + flipcount2 + " flips");
			
		}
		
		
		

	}

}
