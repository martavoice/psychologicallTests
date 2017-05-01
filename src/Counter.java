import sigelmanTest.ResultOfSigelmanTestCounter;

import java.util.ArrayList;

/**
 * Created by Марта on 24.04.2017.
 */
public class Counter {
    private static ResultOfSigelmanTestCounter sigel = new ResultOfSigelmanTestCounter();

    public static void main(String[] args) {
        FileExcecutor fileExcecutor = new FileExcecutor();
        String filename = "C:/Users/Марта/Downloads/new.txt";

        ArrayList<String> data = fileExcecutor.convertFileDataToList(filename);
        ArrayList<ArrayList> allResponsesInList = sigel.createListOfResultsForOnePerson(data);

        for (ArrayList dataFromOnePerson : allResponsesInList) {

            sigel.fillListsOFData(dataFromOnePerson, sigel.listOfDataForFirstBlock, sigel.listOfDataForSecondBlock);
            for (String s : sigel.listOfDataForFirstBlock){
                System.out.println("6" + s);
            }
            for (String s : sigel.listOfDataForSecondBlock){
                System.out.println("7" + s);
            }
            ArrayList<String> firstBlockResults = sigel.createListOfResultsForAllRespondentsFromOneBlock(sigel.listOfDataForFirstBlock);
            ArrayList<String> secondBlockResults = sigel.createListOfResultsForAllRespondentsFromOneBlock(sigel.listOfDataForSecondBlock);
            String resultForOnePerson = sigel.appendResultsForBothBlocksInOneLineForOnePerson(firstBlockResults, secondBlockResults);
            sigel.allResults.add(resultForOnePerson);
        }


        fileExcecutor.loadResultsForAllRespondentsInFile(sigel.allResults);


    }
}
