public class Queue{
    private int maxSize;
    private String []queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s)
    {
        maxSize=s;
        queArray=new String[maxSize];
        front=0;
        rear=-1;
        nItems=0;
    }
    public boolean insert(String j)
    {
        if(rear==maxSize-1){return false;}
        if(rear==maxSize-1)
        {
            rear=-1;
        }
        rear++;
        queArray[rear]=j;
        nItems++;
        return true;
    }
    public void display()
    {
        if(front==rear)
        {
            System.out.println("Queue is empty");
        }
        System.out.println("");
        for (int i = front; i <= rear; i++) {
            System.out.println(queArray[i]);
            
        }
    }
    public String remove() {
        if (nItems == 0) {
            return ""; 
        }
        String temp = queArray[front];
        front++;
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }
    
}
