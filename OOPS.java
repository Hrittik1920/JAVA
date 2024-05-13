// import bank.*;

class Shape {
    String name;
    public void printName() {
        System.out.println(this.name);
    }
    Shape() {
        System.out.println("shape constructor");
    }
}

class Triangle extends Shape {
    int sidelen;
    public void printsidelenght() {
        System.out.println(this.sidelen);
    }
    Triangle() {
        System.out.println("Triangle constructor");
    }
}

class EqualateralTriangle extends Triangle {
    EqualateralTriangle() {
        System.out.println("Equalateral Traigle contructor");
    }
    public int area() {
        return 3 * this.sidelen;
    }
    public void info() {
        System.out.println(this.name);
        System.out.println(this.sidelen);
        System.out.println(this.area());
    }
}

class Circle extends Shape {
    int radius;
    public void area() {
        System.out.println(3.14 * this.radius * this.radius);
    }
    public void info() {
        System.out.println(this.name);
        System.out.println(this.radius);
        this.area();
    }
}

class Students {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name,int age) {
        System.out.println(name + " " + age);
    }

    Students() {

    }

    Students(String name,int age) {
        this.name = name;
        this.age = age;
    }

    Students(Students s) {
        this.name = s.name;
        this.age = s.age;
    }
}

class list {
    int data;
    list next;
    
    public void traverselinkedlist(list head) {
        list ptr = head;
        while(ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
    }
}



public class OOPS {
    // public static void traverseList(list head) {
    //     list ptr = head;
    //     while(ptr != null) {
    //         System.out.print(ptr.data + " ");
    //         ptr = ptr.next;
    //     }
    // }
    public static void main(String[] args) {
        
        EqualateralTriangle et1 = new EqualateralTriangle();
        et1.name = "Equalateral Triangle";
        et1.sidelen = 5;
        et1.printName();
        et1.printsidelenght();
        et1.info();
        Circle c1 = new Circle();
        c1.name = "Circle";
        c1.radius = 5;
        c1.info();
        // Students s1 = new Students();
        // s1.name = "hrittik";
        // s1.age = 21;
        // s1.printInfo(s1.name,s1.age);
        // Students s2 = new Students("Singh",21);
        // Students s3 = new Students(s2);
        // s2.printInfo();
        // s3.printInfo();

        // list first = new list();
        // list second = new list();
        // list third = new list();
        // list fourth = new list();
        // first.data = 3;
        // second.data = 4;
        // third.data = 5;
        // fourth.data = 6;
        // first.next = second;
        // second.next = third;
        // third.next = fourth;
        // fourth.next = null;
        // traverseList(first);
        // System.out.println();
        // second.traverselinkedlist(first);
        
    }
}
