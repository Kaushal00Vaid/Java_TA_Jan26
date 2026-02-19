class Employee {
    private String name;
    int age;
    private String[] departments;

    Employee(String name_, String[] dept) {
        name = name_;
        departments = dept;
    }

    // getters --> get some value
    // setters --> set the value

    // define functions
    // 1 --> to return name
    // 2 --> to rewrite name
    
    // 2 --> set some value to name
    public void setName(String n) {
        name = n;
    }

    // 1 --> get the name
    public String getName() {
        return name;
    }

    // getters and setters for age
    public void setNameAndAge(String name, int a) {
        this.name = name;
        age = a;
    }

    public int getAge() {
        return age;
    }

}



public class GettersSetters {
    public static void main(String[] args) {

        String[] dept  = new String[]{"dept1", "dept2"};

        Employee obj = new Employee("kaushal", dept);

        System.out.println(obj.getName());

        obj.setName("Random");

        System.out.println();

        System.out.println(obj.getName());
    }
}
