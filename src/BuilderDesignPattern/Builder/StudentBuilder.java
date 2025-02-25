package BuilderDesignPattern.Builder;

import java.util.List;
import BuilderDesignPattern.Student;

public abstract class StudentBuilder {    
    public int rollNumber;
    public int age;
    public String name;
    public List<String> subjects;

    public StudentBuilder setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
        return this;
    }
    public StudentBuilder setAge(int age){
        this.age = age;
        return this;
    }
    public StudentBuilder setName(String name){
        this.name = name;
        return this;
    }

    public abstract StudentBuilder setSubjects();
    
    public Student build(){
        return new Student(this);
    }
}
