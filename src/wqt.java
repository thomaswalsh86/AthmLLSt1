import java.util.Scanner;
public class wqt {
	public static void main(String[]args0)
	{
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		if(Integer.toString(input).length()<2&&Integer.toString(input).length()>10)
		{
			System.out.println("Please input a number between 2 and 10 digits");
			input = scan.nextInt();
		}
		int count=1;
		scan.close();
		System.out.print(input+" ");
		while(input>1)
		{
			if(input%2==0) {input/=2;}
			else
			{
				input*=3;
				input++;
			}
			System.out.print(input+" ");
			count++;
		}
		System.out.println("");
		System.out.println("Number in sequence: "+ count);
	}
}
