import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of queue");
        int n = Integer.parseInt(scan.nextLine());
        priorityQueue queue = new priorityQueue();

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            if(input.equals("Remove"))
            {
                queue.lastAdd();
            }
            else{queue.insertOrdered(Integer.valueOf(input));}
        }
        scan.close();
        queue.display();
    }
}
