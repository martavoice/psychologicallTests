package sigelmanTest;

import kettelsTest.ScalesOfKettelsTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by user on 28.02.2017.
 */
public class ResultOfSigelmanTestCounter {
    public ArrayList<String> listOfDataForFirstBlock = new ArrayList<>();
    public ArrayList<String> listOfDataForSecondBlock = new ArrayList<>();
    public ArrayList<String> allResults = new ArrayList<>();

    private String fileName;
    private ResultForEachScaleCounter resultForEachScaleCounter;

    //data from one person from string transform to list and adds to list of all lists respondents
    public ArrayList<ArrayList> createListOfResultsForOnePerson(ArrayList<String> dataOfAllRespondents) {
        ArrayList<ArrayList> allData = new ArrayList<>();
        for (String dataFromOnePerson : dataOfAllRespondents) {
            ArrayList<String> dataOfOnePerson = new ArrayList<>();
            char[] buffer = dataFromOnePerson.toCharArray();

            for (int i = 0; i < buffer.length; i++) {
                if (buffer[i] != ' ') {
                    Character data = buffer[i];
                    dataOfOnePerson.add((data.toString()));
                }
            }
            allData.add(dataOfOnePerson);
        }
        return allData;
    }

    public void fillListsOFData(ArrayList<String> allDataToDivide, ArrayList<String> listOfDataForFirstBlock, ArrayList<String> listOfDataForSecondBlock) {

        listOfDataForFirstBlock.clear();
        listOfDataForSecondBlock.clear();
        //put number of person to both lists for simplier count of questions(from 1 not 0)
        listOfDataForFirstBlock.add(allDataToDivide.get(0));
        listOfDataForSecondBlock.add(allDataToDivide.get(0));

        //put answers for questions 1-50 of first block to first list and 50 answers to second block
        for (int i = 1; i < 51; i++) {
            listOfDataForFirstBlock.add(allDataToDivide.get(i));
        }
        for (int i = 51; i < allDataToDivide.size(); i++) {
            listOfDataForSecondBlock.add(allDataToDivide.get(i));
        }
    }

    //this method create String from results of count scales for 1 block and 1 person
    public String convertResultForOnePersonToString(Map<ScaleOfSingelmanTest, Integer> resultValuesForOnePerson) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (Map.Entry<ScaleOfSingelmanTest, Integer> pair : resultValuesForOnePerson.entrySet()) {
            String resultOfCount = pair.getValue().toString();
            stringBuilder.append(resultOfCount);
        }
        String allResultFromOnePerson = stringBuilder.toString();
        return allResultFromOnePerson;
    }

    //creating list of String which contains results counting for one block for 1 person
    public ArrayList<String> createListOfResultsForAllRespondentsFromOneBlock(ArrayList<String> listOfDataForBlock) {
        ArrayList<String> listOfResultData = new ArrayList<>();
        for (String dataAboutOnePerson : listOfDataForBlock) {
            try {
                resultForEachScaleCounter.createArrayOfAnswersFromStringData(dataAboutOnePerson);
            }catch (NullPointerException e){

            }
            Map<ScaleOfSingelmanTest, Integer> a = resultForEachScaleCounter.countResultToScaleForOnePerson(dataAboutOnePerson);

            String resultForOnePerson = convertResultForOnePersonToString(a);
            listOfResultData.add(resultForOnePerson);
        }
        return listOfResultData;
    }


    //appending String result for one person from both block to one and creating string which must be written as result for one person
    public String appendResultsForBothBlocksInOneLineForOnePerson(ArrayList<String> fistBlockResults, ArrayList<String> secondBlockResults) {
        String appendString = "";
        for (String dataFromFirstBlock : fistBlockResults) {
            for (String dataFromSecondBlock : secondBlockResults) {
                StringBuilder stringBuilder = new StringBuilder("");
                stringBuilder.append(dataFromFirstBlock);
                stringBuilder.append(dataFromSecondBlock);
                appendString = stringBuilder.toString();

            }
        }
        return appendString;
    }


}
