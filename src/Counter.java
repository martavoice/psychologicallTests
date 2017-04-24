import java.io.File;
import java.util.ArrayList;

/**
 * Created by Марта on 24.04.2017.
 */
public class Counter {

    public static void main(String[] args) {
        FileExcecutor fileExcecutor = new FileExcecutor();
        String filename = "";
        ArrayList<String> data =  fileExcecutor.convertFileDataToList(filename);
        fileExcecutor.loadResultsForAllRespondentsInFile(data);


    }
}
