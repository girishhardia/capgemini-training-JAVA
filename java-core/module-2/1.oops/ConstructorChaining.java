// what is constructor chaining 
// constructor chaining is the process of calling one constructor from another 
// constructor of the same class.
public class ConstructorChaining {
    int id;
    String name;
    int age;
    
    public ConstructorChaining(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public ConstructorChaining(int id, String name) {
        this(id, name, 0);
    }

    public ConstructorChaining(int id) {
        this(id, "", 0);
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ConstructorChaining obj1 = new ConstructorChaining(1, "John", 25);
        ConstructorChaining obj2 = new ConstructorChaining(2, "Jane");
        ConstructorChaining obj3 = new ConstructorChaining(3);
        
        obj1.display();
        obj2.display();
        obj3.display();
    }
}
