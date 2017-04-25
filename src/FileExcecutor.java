import java.io.*;
import java.util.ArrayList;

/**
 * Created by user on 28.02.2017.
 */
public class FileExcecutor {

    public ArrayList<String> convertFileDataToList(String fileName) {
        ArrayList<String> listOfDataFromFile = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            while (reader.ready()) {
                String dataFromOnePerson = reader.readLine();
                listOfDataFromFile.add(dataFromOnePerson);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return listOfDataFromFile;
    }
    public File loadResultsForAllRespondentsInFile(ArrayList<String> resultList) {
        File resultFile = new File("C:/Users/Марта/Downloads/Sofia/result.txt");

         /*
        try {
            //BufferedWriter writer = new BufferedWriter(new FileWriter(resultFile));

          for (String resultDataForOnePerson : resultList) {
                writer.write(resultDataForOnePerson);
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return resultFile;
        */
        for (String a : resultList){
            System.out.println(a);
        }

         return resultFile;

    }
}
