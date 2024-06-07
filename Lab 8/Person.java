package Lab8;

import java.util.Scanner;

public class Person {
	
	String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println(name + " is " + age + " years old");
    }

    public class Student {
        int grade;
        Person person;

        public Student(int grade, Person person) {
            this.grade = grade;
            this.person = person;
        }

        public void study() {
            System.out.println(person.name + " is studying for grade " + this.grade);
        }
    }

    public static void main(String[] args) {
        Person person = new Person("maha", 24);
        Student student = person.new Student(17, person);

        person.speak();
        student.study();
    }
}


	
		
	