package kulilovaTest;


import java.util.ArrayList;
import java.util.Map;

/**
 * Created by user on 01.03.2017.
 */
public class ResultOfKulikovaTestCounter {

    public ResultForEachScaleCounter resultForEachScaleCounter = new ResultForEachScaleCounter();
    public static ArrayList<String> listOfDataForFirstBlock = new ArrayList<>();
    public static ArrayList<String> listOfDataForSecondBlock = new ArrayList<>();
    public static ArrayList<String> allResults = new ArrayList<>();

    public void fillListsOFData(ArrayList<String> allDataToDivide, ArrayList<String> listOfDataForFirstBlock, ArrayList<String> listOfDataForSecondBlock) {


        //put number of person to both lists for simplier count of questions(from 1 not 0)
        listOfDataForFirstBlock.add(allDataToDivide.get(0));
        listOfDataForSecondBlock.add(allDataToDivide.get(0));

        //put answers for questions 1-50 of first block to first list and 50 answers to second block
        for (int i = 1; i < 45; i++) {
            listOfDataForFirstBlock.add(allDataToDivide.get(i));
        }
        for (int i = 45; i < allDataToDivide.size(); i++) {
            listOfDataForSecondBlock.add(allDataToDivide.get(i));
        }
    }

    //this method create String from results of count scales for 1 block and 1 person
    public String convertResultForOnePersonToString(Map<ScalesOfKulikovaTest, Integer> resultValuesForOnePerson) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (Map.Entry<ScalesOfKulikovaTest, Integer> pair : resultValuesForOnePerson.entrySet()) {
            String resultOfCount = pair.getValue().toString();
            stringBuilder.append(resultOfCount);
            stringBuilder.append(" ");
        }
        String allResultFromOnePerson = stringBuilder.toString();
        return allResultFromOnePerson;
    }

    public String createStringFromList(ArrayList<String> list) {
        String result = "";
        StringBuilder stringBuilder = new StringBuilder("");
        for (String data : list) {
            stringBuilder.append(data);
            stringBuilder.append("\t");
        }
        result = stringBuilder.toString();
        return result;
    }

    //creating list of String which contains results counting for one block for all respondents
    public ArrayList<String> createListOfResultsForAllRespondentsFromOneBlock(ArrayList<String> listOfDataForBlock) {
        ArrayList<String> listOfResultData = new ArrayList<>();
        String dataAboutPerson = createStringFromList(listOfDataForBlock);
        Map<ScalesOfKulikovaTest, Integer> a = resultForEachScaleCounter.countResultToScaleForOnePerson(dataAboutPerson);
        String resultForOnePerson = convertResultForOnePersonToString(a);
        listOfResultData.add(resultForOnePerson);
        return listOfResultData;
    }

    //appending String result for one person from both block to one and creating list of Strings which must be written
    public String appendResultsForBothBlocks(ArrayList<String> fistBlockResults, ArrayList<String> secondBlockResults) {
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
