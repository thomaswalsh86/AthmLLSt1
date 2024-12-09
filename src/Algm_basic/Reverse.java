package Algm_basic;
import java.util.Scanner;
public class Reverse {
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many Words");
        int num = Integer.parseInt(scan.nextLine());
        if (num< 1 ||  num > 100 )
		{
			System.out.println("Please input a number between 1 and 1000 digits");
			num = scan.nextInt();
		}
        String [] list = new String[num];
        
        for(int i =0;i<num;i++)
        {
            //System.out.println("Input a word");
            list[i] = scan.nextLine();
        }
        scan.close();
        Sort(list);

        //reverse
        backwards(num,list);


    }

    public static void backwards(int num,String list [])
    {
        System.out.println("");
        for (int i =num-1;i>=0;i--) 
        {
            System.out.print(list[i]+" ");
        }

    }

    public static void Sort(String[] list)
    {
        String temp ="";
        for (int j = 0; j < list.length-1; j++) {
        for (int i = 0; i < list.length-j-1; i++) 
        {
            //System.out.println("1.0 This is the check"+list[i]+"and "+list[i+1]);
            if(list[i].length()>list[i+1].length())
            {
                temp=list[i];
                list[i]=list[i+1];
                list[i+1]=temp;
                
            }

            if(list[i].length()==list[i+1].length())
            {
                for (int k = 0; k < list[i].length(); k++) 
                {
                    char letterWord1 = list[i].charAt(k);
                    char letterWord2 = list[i+1].charAt(k);
                    if(letterWord1 >letterWord2)
                    {
                        temp=list[i];
                        list[i]=list[i+1];
                        list[i+1]=temp;
                        break;
                    }
                    

                }
            }
        }
        }
        for (String i : list) 
        {
            System.out.print(i+" ");
        }
    }
    
}
