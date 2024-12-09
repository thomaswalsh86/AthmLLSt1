package LinkedLists;
public class doubleQueueReg {
    private Link2 first;
    private Link2 tail;
    private Link2 newLink2;

    public doubleQueueReg() {
        first = null;
        tail=null;
    }

    public void insertHead(String name, int age, String degree, int yearOfStudy) {
        Link2 newLink2 = new Link2(name, age, degree, yearOfStudy);
        if(first==null)
        {
            first=newLink2;
            tail=newLink2;
        }
        else{
            newLink2.next=first;
            first.prev= newLink2;
            first=newLink2;
        }
        /*Link2 newLink2 = new Link2(name, age, degree, yearOfStudy);
        newLink2.next = first;
        first = newLink2;*/
    }


    public Link2 deleteHead() {
        if (first == null) {
            System.out.println("List is empty. Nothing to delete.");
            return null;
        }
        Link2 temp = first;
        first = first.next;
        return temp;
    }
    public void andBeyond()
    {
        Link2 current = tail;
        Link2 start = tail;
        while(true)
        {
            if(current!=null)
            {
                //current.displayLink2();
                current = current.next;
            }
            else
            {   
                current=start;
                current.displayLink2();
            }

        }
        
    }

    public void display() {
        Link2 current = first;
        while (current != null) {
            current.displayLink2();
            current = current.next;
        }
        System.out.println("null");
    }

    public void attribute(String attribute, String value, String action) {
        Link2 current = first;
        boolean found = false;

        while (current != null) {
            if ((attribute.equalsIgnoreCase("name") && current.name.equalsIgnoreCase(value)) ||
                (attribute.equalsIgnoreCase("age") && Integer.toString(current.age).equals(value)) ||
                (attribute.equalsIgnoreCase("degree") && current.degree.equalsIgnoreCase(value)) ||
                (attribute.equalsIgnoreCase("yearofstudy") && Integer.toString(current.yearOfStudy).equals(value))) {
                
                found = true;
                if (action.equalsIgnoreCase("print")) {
                    current.displayLink2();
                } else if (action.equalsIgnoreCase("remove")) {
                    delete(current);
                }
                break;
            }
            current = current.next;
        }

        if (!found) {
            System.out.println("No match found for " + attribute + ": " + value);
        }
    }

    public void linkPos(String name, int age, String degree, int yearOfStudy,int listPos)//iterate through a new link at a user specifed pos,
    {
        Link2 current = first;
        Link2 previous = null;
        int count=0;
        while(count>listPos-1 && current != null)
        {
                previous = current;
                current = current.next;
                count++;
        }
        if (previous == null) {  // Insert at the beginning if list is empty or smallest
            insertHead(name, age, degree, yearOfStudy);;
        } else {                 // Insert between previous and current
            previous.next = newLink2;
        }
    }

    private void delete(Link2 toDelete) {
        if (first == null) return;

        if (first == toDelete) {
            first = first.next;
            return;
        }

        Link2 current = first;
        while (current.next != null && current.next != toDelete) {
            current = current.next;
        }

        if (current.next == toDelete) {
            current.next = toDelete.next;
        }
    }
}

