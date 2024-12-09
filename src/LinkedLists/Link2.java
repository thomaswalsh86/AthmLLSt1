package LinkedLists;
public class Link2 {
    String name;
    int age;
    String degree;
    int yearOfStudy;
    Link2 next;
    Link2 prev;

    public Link2(String name, int age, String degree, int yearOfStudy) {
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.yearOfStudy = yearOfStudy;
        this.next = null;
        this.prev=null;
    }

    public void displayLink2() {
        System.out.println(name + ", " + age + ", " + degree + ", " + yearOfStudy);
    }
}
