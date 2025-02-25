package BuilderDesignPattern;

import BuilderDesignPattern.Builder.EngineeringStudentBuilder;
import BuilderDesignPattern.Builder.MBAStudentBuilder;

public class Main {
    public static void main(String[] args) {
        Director director1 = new Director(new EngineeringStudentBuilder());
        Director director2 = new Director(new MBAStudentBuilder());

        Student engineeringStudent = director1.createStudent();
        Student MBAStudent = director2.createStudent();

        System.out.println(engineeringStudent.toString());
        System.out.println(MBAStudent.toString());
    }
}
