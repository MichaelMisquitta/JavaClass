import java.util.Scanner;
public class StarBoi {
	public static void main(String[] args)
	{
		System.out.println("Enter a set of nums");
		Scanner scan = new Scanner(System.in);
	
		int[] arr= new int[100];
		int check = scan.nextInt();
		while(check >= 0 && check <= 1000)
		{
			arr[check/10]++;
			check = scan.nextInt();
		}
		int aba = 0;
		int bab = 9;
		for(int i = 0; i < 100; i++)
		{
			System.out.print(aba + "--" + bab + "|");
			for(int a = 0; a < arr[i]; a++ )
			{
				System.out.print("*");
				
			}
			aba = aba + 10;
			bab = bab + 10;
			System.out.println("");
		}
	}	
}
