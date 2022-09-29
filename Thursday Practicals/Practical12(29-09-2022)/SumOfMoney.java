
public class SumOfMoney {
	static int count(int coins[],int n,int sum)
	{
		//checking condition
		if(sum==0)
		{
			return 1;
		}
		//checking condition
		if(sum<0)
		{
			return 0;
		}
		//checking condition
		if(n<=0)
		{
			return 0;
		}
		return count(coins,n-1,sum)+count(coins,n,sum-coins[n-1]);// returns the sum of solutions of given coins
	}
    //main method
	public static void main(String[] args) {
		int coins[] = { 1, 2, 3 };
        int n = coins.length;
        System.out.println(count(coins, n, 4));
	}

}
