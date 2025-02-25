package FlyweightDesignPattern.v1;

public class DocumentCharacter implements ILetter{
    private Character character;
    private String fontType;
    private Integer size;
    DocumentCharacter(Character character, String fontType, int size){
        this.character = character;
        this.fontType = fontType;
        this.size = size;
    }

    // only getter methoda (no setter methods)
    @Override
    public void display(int row, int column){
        // display the particular character at a given loacation
    }
}