public class stack {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public stack(int n)
    {
        maxSize =n;
        stackArray = new String[maxSize];
        top=-1;
    }
    public void push(String j)
    {
        top++;
        stackArray[top]=j;
    }
    public String pop()
    {
        return stackArray[top--];
    }
    public String peek()
    {
        return stackArray[top];
    }
    public boolean isEmpty()
    {
        return (top==-1);
    }

}
