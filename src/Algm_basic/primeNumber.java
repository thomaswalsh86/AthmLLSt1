package Algm_basic;
import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a Number");
        int n = scan.nextInt();
        scan.close();
        if (n< 1 && n > 1000 )
		{
			System.out.println("Please input a number between 1 and 1000 digits");
			n = scan.nextInt();
		}
//iterate 5 times
int prime=0;
boolean checked=false;
        for (int i = 0; i < n*n*n; i++) 
        {
            if(prime==n&&checked==false)
            {
                System.out.println(i-1);
                checked = true;
                
            }
            if(prime==2*n)
            {
                System.out.println(i-1);
                break;
            }
            if(isPrime(i))
            {
                prime++;
            }
        }
//check all numbers until i gett through 5 times
    }
    public static boolean isPrime(int n)
    {
        if(n<=1){return false;}
        for(int i =2;i<n;i++)
        {
            if(n%i==0){return false;}
        }
        return true;
    }
    
}
