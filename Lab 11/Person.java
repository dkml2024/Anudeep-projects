package anudeep;

public interface Person {


    void speak();
}

class Student implements Person {
    
    public void speak() {
        System.out.println("good morning mam ");
    }
}

class Teacher implements Person {
    
    public void speak() {
        System.out.println(" good morning all ");
    }



    public static void main(String[] args) {
       
        Student student = new Student();
        Teacher teacher = new Teacher();

       
        teacher.speak();
        student.speak();
}
}
