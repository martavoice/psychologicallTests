import sigelmanTest.ResultOfSigelmanTestCounter;

import javax.print.DocFlavor;
import java.util.ArrayList;

/**
 * Created by Марта on 24.04.2017.
 */
public class Counter {
    private static ResultOfSigelmanTestCounter sigel = new ResultOfSigelmanTestCounter();

    public static void main(String[] args) {
        FileExcecutor fileExcecutor = new FileExcecutor();

        //conting results for Sigelman test
        String filename = "C:/Users/Марта/Downloads/new.txt";

        ArrayList<String> data = fileExcecutor.convertFileDataToList(filename);
        ArrayList<ArrayList> allResponsesInList = sigel.createListOfResultsForOnePerson(data);

        for (ArrayList dataFromOnePerson : allResponsesInList) {

            sigel.fillListsOFData(dataFromOnePerson, sigel.listOfDataForFirstBlock, sigel.listOfDataForSecondBlock);
            ArrayList<String> firstBlockResults = sigel.createListOfResultsForAllRespondentsFromOneBlock(sigel.listOfDataForFirstBlock);
            ArrayList<String> secondBlockResults = sigel.createListOfResultsForAllRespondentsFromOneBlock(sigel.listOfDataForSecondBlock);
            String resultForOnePerson = sigel.appendResultsForBothBlocksInOneLineForOnePerson(firstBlockResults, secondBlockResults);
            sigel.allResults.add(resultForOnePerson);
        }
        System.out.println(sigel.allResults.size());
        for (String a : sigel.allResults){
            System.out.println(a);
        }
        fileExcecutor.loadResultsForAllRespondentsInFile(sigel.allResults,"C:/Users/Марта/Downloads/Sofia/resultSigelman.txt");


    }
}
