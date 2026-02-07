public class Students {
    private int id;
    private String name;
    private int age;
    private int marks;

    // Constructor for Stream.java compatibility
    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor for Prac1.java
    public Students(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getMarks() {
        return marks;
    }
    
    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }
}
