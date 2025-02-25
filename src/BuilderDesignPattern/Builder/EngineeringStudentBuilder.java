package BuilderDesignPattern.Builder;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{    
    @Override
    public StudentBuilder setSubjects(){
        List<String> subjects = new ArrayList<String>();
        subjects.add("E_S1");
        subjects.add("E_S2");
        subjects.add("E_S3");
        this.subjects = subjects;
        return this;   
    }
}
