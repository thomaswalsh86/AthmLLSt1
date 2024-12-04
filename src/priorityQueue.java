public class priorityQueue {
    private Link first;  // Reference to the first link
    private Link tail;
    private int total;

    public priorityQueue() {
        first = null;  // Initialize first to null
        tail=null;
        total=0;
    }

    public void insertHead(int number) {
        Link newLink = new Link(number);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteHead() {
        if (first == null) {
            return null;  // No elements to delete
        }
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void display() {
        Link current = first;  // Start with the first link
        while (current != null) {
            current.displayLink();  // Print out the link's data
            current = current.next; // Move to the next link
        }
        System.out.println(); // New line after displaying all links
    }

    public Link delete(int key) {
        Link current = first;
        Link previous = null;
        
        // Search for the link with the given key
        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }
        
        if (current == null) {  // Didn't find the key
            return null;
        }
        
        if (current == first) {  // If it's the first link
            first = first.next;   // Move `first` to the next link
        } else {                 // If not the first link
            previous.next = current.next; // Bypass the current link
        }
        
        return current;  // Return the deleted link
    }
    public void insertOrdered(int data) {
        Link newLink = new Link(data);
        Link previous = null;
        Link current = first;
        total++;

        while (current != null && data > current.data) {
            previous = current;
            current = current.next;
        }

        if (previous == null) {  // Insert at the beginning if list is empty or smallest
            first = newLink;
        } else {                 // Insert between previous and current
            previous.next = newLink;
        }
        if(tail==null)
        {
            tail=newLink;
        }

        newLink.next = current;  // Link newLink to the next item in the list
    }
    public void insert(int data)
    {
        Link newLink = new Link(data);
        Link previous = null;
        Link current = first;

        if (previous == null) {  // Insert at the beginning if list is empty or smallest
            first = newLink;
        } else 
        {
            previous.next = newLink;
        }

        newLink.next = current;  // Link newLink to the next item in the list
        }
    public void lastAdd() {
        if (first == null || first.next == null) {
            return;
        }
        Link current = first;
        while (current.next != null) {
            current = current.next;
        }

        Link temp = first;
        first = first.next;
        current.next = temp;
        temp.next = null;
        temp.data=temp.data+current.data;
    }
    }