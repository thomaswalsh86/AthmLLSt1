import java.util.Scanner;

public class Merge_Main
{
    public static void main(String[] args) 
    {

       Scanner scan = new Scanner(System.in);
       int len=scan.nextInt();
       long arr []= new long[len];
       long ws []= new long[len];
       Merge_Sort sort = new Merge_Sort();

       for(int i =0;i<len;i++)
       {
           arr[i]=scan.nextInt();
       } 
       scan.close();
       sort.mergeSort(arr, ws, 0, len-1);
       for(long num:arr)
       {
        System.out.print(num+" ");
       }
    }
}