package BuilderDesignPattern.Builder;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{ 
    @Override   
    public StudentBuilder setSubjects(){
        List<String> subjects = new ArrayList<String>();
        subjects.add("MBA_S1");
        subjects.add("MBA_S2");
        subjects.add("MBA_S3");
        this.subjects = subjects;
        return this;   
    }
}
