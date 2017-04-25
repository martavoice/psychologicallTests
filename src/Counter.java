import sigelmanTest.ResultOfSigelmanTestCounter;

import java.util.ArrayList;

/**
 * Created by Марта on 24.04.2017.
 */
public class Counter {
    private static ResultOfSigelmanTestCounter sigel = new ResultOfSigelmanTestCounter();

    public static void main(String[] args) {
        FileExcecutor fileExcecutor = new FileExcecutor();
        String filename = "C:/Users/Марта/Downloads/Sofia/sigel.txt";
        ArrayList<String> data = fileExcecutor.convertFileDataToList(filename);

        sigel.fillListsOFData(data, sigel.listOfDataForFirstBlock, sigel.listOfDataForSecondBlock);
        ArrayList<String> firstBlockResults = sigel.createListOfResultsForAllRespondentsFromOneBlock(sigel.listOfDataForFirstBlock);
        ArrayList<String> secondBlockResults = sigel.createListOfResultsForAllRespondentsFromOneBlock(sigel.listOfDataForSecondBlock);
        ArrayList<String> dataResult = sigel.appendResultsForBothBlocks(firstBlockResults, secondBlockResults);

        fileExcecutor.loadResultsForAllRespondentsInFile(dataResult);


    }
}
