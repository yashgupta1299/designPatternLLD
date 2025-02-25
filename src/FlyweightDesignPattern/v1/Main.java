package FlyweightDesignPattern.v1;


// Static variables are initialized when a 
// class is loaded. A class is loaded because the JVM decides 
// it's time to load it. Typically, the JVM loads a class 
// because somebody's trying to make a new instance of the 
// class, for the first time, or use a static method or variable of the class.


public class Main {
    public static void main(String[] args) {
        ILetter iLetterObj1 = LetterFactory.createLetter('a');
        iLetterObj1.display(0, 0);
        
        ILetter iLetterObj2 = LetterFactory.createLetter('b');        
        iLetterObj2.display(10, 20);
        
        ILetter iLetterObj3 = LetterFactory.createLetter('a');        
        iLetterObj3.display(10, 30);

    }
}
