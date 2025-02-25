package BuilderDesignPattern;

import BuilderDesignPattern.Builder.EngineeringStudentBuilder;
import BuilderDesignPattern.Builder.MBAStudentBuilder;
import BuilderDesignPattern.Builder.StudentBuilder;

public class Director {
    StudentBuilder studentBuilder;
    public Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if(this.studentBuilder instanceof EngineeringStudentBuilder){
            return engineeringStudent();
        }else if(this.studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }
        return null;
    }

    public Student engineeringStudent(){
        return  this.studentBuilder
                    .setAge(20)
                    .setName("ES_1")
                    .setRollNumber(22)
                    .setSubjects()
                    .build();
    }
    public Student createMBAStudent(){
        return  this.studentBuilder
                    .setAge(25)
                    .setName("MS_1")
                    .setRollNumber(24)
                    .setSubjects()
                    .build();
    }
}
