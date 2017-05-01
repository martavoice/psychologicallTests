import natovaBochaver.ResultOfNatovaBocharovaTestCounter;
import sigelmanTest.ResultOfSigelmanTestCounter;

import javax.print.DocFlavor;
import java.util.ArrayList;

/**
 * Created by Марта on 24.04.2017.
 */
public class Counter {
    private static ResultOfSigelmanTestCounter sigel = new ResultOfSigelmanTestCounter();
    private static ResultOfNatovaBocharovaTestCounter natova = new ResultOfNatovaBocharovaTestCounter();

    public static void main(String[] args) {
        FileExcecutor fileExcecutor = new FileExcecutor();

        //counting results for Sigelman test
        String filename = "C:/Users/Марта/Downloads/new.txt";

        ArrayList<String> data = fileExcecutor.convertFileDataToList(filename);
        ArrayList<ArrayList> allResponsesInList = fileExcecutor.createListOfResultsForOnePerson(data);

        for (ArrayList dataFromOnePerson : allResponsesInList) {

            sigel.fillListsOFData(dataFromOnePerson, sigel.listOfDataForFirstBlock, sigel.listOfDataForSecondBlock);
            ArrayList<String> firstBlockResults = sigel.createListOfResultsForAllRespondentsFromOneBlock(sigel.listOfDataForFirstBlock);
            ArrayList<String> secondBlockResults = sigel.createListOfResultsForAllRespondentsFromOneBlock(sigel.listOfDataForSecondBlock);
            String resultForOnePerson = sigel.appendResultsForBothBlocksInOneLineForOnePerson(firstBlockResults, secondBlockResults);
            sigel.allResults.add(resultForOnePerson);
        }

        fileExcecutor.loadResultsForAllRespondentsInFile(sigel.allResults,"C:/Users/Марта/Downloads/Sofia/resultSigelman.txt");

        //counting results for Natova-Bochaver Test

        String filenameN = "C:/Users/Марта/Downloads/newN.txt";
        ArrayList<String> dataN = fileExcecutor.convertFileDataToList(filenameN);
        ArrayList<String> resultData = natova.createResultListToWriting(dataN);
        fileExcecutor.loadResultsForAllRespondentsInFile(resultData,"C:/Users/Марта/Downloads/Sofia/resultNatova.txt");

        //counting results for

    }
}
