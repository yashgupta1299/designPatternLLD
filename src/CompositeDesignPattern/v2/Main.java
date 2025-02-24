package CompositeDesignPattern.v2;

import CompositeDesignPattern.v2.CD.Directory;
import CompositeDesignPattern.v2.CD.File;
import CompositeDesignPattern.v2.CD.FileSystem;

/*
 *             Movie
 *    Border         comedyMovieDirectory
 *              hulchul
 * 
 */
public class Main {

    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movie");
        FileSystem border = new File("Border");
        movieDirectory.add(border);

        Directory comedyMovieDirectory = new Directory("comedyMovieDirectory");
        FileSystem hulchul = new File("Hulchul");
        comedyMovieDirectory.add(hulchul);

        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();
    }
}