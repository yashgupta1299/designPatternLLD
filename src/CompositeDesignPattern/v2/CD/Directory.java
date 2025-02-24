package CompositeDesignPattern.v2.CD;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String directoryName;
    List<FileSystem> fileSystemList;
    public Directory(String directoryName){
        this.directoryName = directoryName;
        fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystemObj){
        fileSystemList.add(fileSystemObj);
    }

    @Override
    public void ls(){
        System.out.println("directoryName: " + directoryName);
        for (FileSystem fileSystem : fileSystemList) {
            fileSystem.ls();
        }
    }
}
