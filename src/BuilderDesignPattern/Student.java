package BuilderDesignPattern;
import java.util.List;

import BuilderDesignPattern.Builder.StudentBuilder;

public class Student {
    int rollNumber;
    int age;
    String name;
    List<String> subjects;

    public Student(StudentBuilder studentBuilder){
        this.rollNumber = studentBuilder.rollNumber;
        this.age = studentBuilder.age;
        this.name = studentBuilder.name;
        this.subjects = studentBuilder.subjects;
    }

    public String toString(){
        StringBuilder subList = new StringBuilder();
        for (String sub : subjects) {
            subList.append(sub);
            subList.append(" ");
        }

        return ""   + "rollNumber:" + this.rollNumber + '\n'
                    + "age:" +this.age + '\n'
                    + "name:" +this.name + '\n'
                    + "subjects: "+subList;
    }
}