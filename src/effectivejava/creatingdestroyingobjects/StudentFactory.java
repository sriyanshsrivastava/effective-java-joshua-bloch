package effectivejava.creatingdestroyingobjects;

public class StudentFactory {
    private final String name;
    private final int roll;
    private final double marks;

    private StudentFactory(String name,int roll,double marks){
        this.name=name;
        this.roll= roll;
        this.marks= marks;
    }

    @Override
    public String toString() {
        return "StudentFactory{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", marks=" + marks +
                '}';
    }

    public static StudentFactory student(String name, int roll, double marks){
        return new StudentFactory(name,roll,marks);
    }

    public static void main(String[] args) {
        StudentFactory s1 = StudentFactory.student("Satish",2,98.23);
        StudentFactory s2 = StudentFactory.student("Ritesh",5,98);
        System.out.println(s1);
        System.out.println(s2);

    }
}

