package LinkedLists;
import java.util.Scanner;
public class DblLinkStudentProfile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        doubleQueueReg queue = new doubleQueueReg();
        queue.insertHead("Steve", 18, "compSci", 12);
        queue.insertHead("john", 42, "buissness", 2);
        queue.insertHead("lebron", 40, "sportsci", 10);
        queue.insertHead("ronaldo", 42, "buissness", 2);
        queue.insertHead("Kvaratskhelia", 12, "goatness", 90);
        queue.insertHead("roberto", 2, "buissness", 2);
        boolean run=true;
        while (run) {
            System.out.println("Enter 'add', 'ToInfinity' , 'remove', 'attribute' , 'printList', 'new link', or 'end':");
            String action = scan.nextLine();

            switch (action.toLowerCase()) {
                case "end":
                    run=false;
                    break;
                    
                case "attribute":
                System.out.println("Enter attribute and value to find (e.g., 'name John'):");
                String[] addInput = scan.nextLine().split(" ");
                queue.attribute(addInput[0], addInput[1], "print");
                break;
/* 
                case "new link":
                queue.insertHead();
                queue.linkPos(n, a, d, yos,lp);
                break;
*/
                case "toinfinity":
                    queue.andBeyond();
                    break;
                
                case "remove":
                    System.out.println("Enter attribute and value to remove (e.g., 'name John'):");
                    String[] removeInput = scan.nextLine().split(" ");
                    queue.attribute(removeInput[0], removeInput[1], "remove");
                    break;

                case "printlist":
                    queue.display();
                    break;

                default:
                    System.out.println("Invalid input.");
            }
        }
        scan.close();
    }
}
