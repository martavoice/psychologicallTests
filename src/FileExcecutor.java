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
    public File loadResultsForAllRespondentsInFile(ArrayList<String> resultList, String fileName) {
        File resultFile = new File(fileName);


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(resultFile));

          for (String resultDataForOnePerson : resultList) {
                writer.write(resultDataForOnePerson);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return resultFile;

    }
    //data from one person from string transform to list and adds to list of all lists respondents
    public ArrayList<ArrayList> createListOfResultsForOnePerson(ArrayList<String> dataOfAllRespondents) {
        ArrayList<ArrayList> allData = new ArrayList<>();
        for (String dataFromOnePerson : dataOfAllRespondents) {
            ArrayList<String> dataOfOnePerson = new ArrayList<>();
            char[] buffer = dataFromOnePerson.toCharArray();

            for (int i = 0; i < buffer.length; i++) {
                if (buffer[i] != '\t') {
                    Character data = buffer[i];
                    dataOfOnePerson.add((data.toString()));
                }
            }

            allData.add(dataOfOnePerson);
        }
        return allData;
    }
}

