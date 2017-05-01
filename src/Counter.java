import kulilovaTest.ResultOfKulikovaTestCounter;
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
    private static ResultOfKulikovaTestCounter kulikov = new ResultOfKulikovaTestCounter();

    public static void main(String[] args) {
        FileExcecutor fileExcecutor = new FileExcecutor();

        //counting results for Sigelman test
        String filename = "C:/Users/Марта/Downloads/Testy/new.txt";

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

        String filenameN = "C:/Users/Марта/Downloads/Testy/newN.txt";
        ArrayList<String> dataN = fileExcecutor.convertFileDataToList(filenameN);
        ArrayList<String> resultData = natova.createResultListToWriting(dataN);
        fileExcecutor.loadResultsForAllRespondentsInFile(resultData,"C:/Users/Марта/Downloads/Sofia/resultNatova.txt");

        //counting results for kulikov test
        String filenameKy = "C:/Users/Марта/Downloads/Testy/newKy.txt";
        ArrayList<String> dataKy = fileExcecutor.convertFileDataToList(filenameKy);
        ArrayList<ArrayList> allResponsesInListKy = fileExcecutor.createListOfResultsForOnePerson(dataKy);
        for (ArrayList dataFromOnePerson : allResponsesInListKy) {

            kulikov.fillListsOFData(dataFromOnePerson, kulikov.listOfDataForFirstBlock, kulikov.listOfDataForSecondBlock);
            ArrayList<String> firstBlockResults = kulikov.createListOfResultsForAllRespondentsFromOneBlock(kulikov.listOfDataForFirstBlock);
            ArrayList<String> secondBlockResults = kulikov.createListOfResultsForAllRespondentsFromOneBlock(kulikov.listOfDataForSecondBlock);
            String resultForOnePerson = kulikov.appendResultsForBothBlocks(firstBlockResults,secondBlockResults);
            kulikov.allResults.add(resultForOnePerson);
        }
        fileExcecutor.loadResultsForAllRespondentsInFile(kulikov.allResults,"C:/Users/Марта/Downloads/Sofia/resultKulikov.txt");
    }
}
