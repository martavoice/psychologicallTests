package kettelsTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by user on 24.02.2017.
 */
public class ResultOfKettelsTestCounter {

    private ResultForEachScaleCounter resultForEachScaleCounter;

    public String convertResultForOnePersonToString(Map<ScalesOfKettelsTest, Integer> resultValuesForOnePerson) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (Map.Entry<ScalesOfKettelsTest, Integer> pair : resultValuesForOnePerson.entrySet()) {
            String resultOfCount = pair.getValue().toString();
            stringBuilder.append(resultOfCount);
        }
        String allResultFromOnePerson = stringBuilder.toString();
        return allResultFromOnePerson;
    }

    public Map<ScalesOfKettelsTest, Integer> countResultInAllScales(String dataAboutOnePerson) {
        resultForEachScaleCounter.countResultToScaleAForOnePerson(dataAboutOnePerson);
        resultForEachScaleCounter.countResultToScaleBForOnePerson(dataAboutOnePerson);
        resultForEachScaleCounter.countResultToScaleCForOnePerson(dataAboutOnePerson);
        resultForEachScaleCounter.countResultToScaleEForOnePerson(dataAboutOnePerson);
        resultForEachScaleCounter.countResultToScaleFForOnePerson(dataAboutOnePerson);
        resultForEachScaleCounter.countResultToScaleGForOnePerson(dataAboutOnePerson);
        resultForEachScaleCounter.countResultToScaleHForOnePerson(dataAboutOnePerson);
        resultForEachScaleCounter.countResultToScaleIForOnePerson(dataAboutOnePerson);
        resultForEachScaleCounter.countResultToScaleLForOnePerson(dataAboutOnePerson);
        resultForEachScaleCounter.countResultToScaleMForOnePerson(dataAboutOnePerson);
        resultForEachScaleCounter.countResultToScaleNForOnePerson(dataAboutOnePerson);
        resultForEachScaleCounter.countResultToScaleOForOnePerson(dataAboutOnePerson);
        resultForEachScaleCounter.countResultToScaleQ1ForOnePerson(dataAboutOnePerson);
        resultForEachScaleCounter.countResultToScaleQ2ForOnePerson(dataAboutOnePerson);
        resultForEachScaleCounter.countResultToScaleQ3ForOnePerson(dataAboutOnePerson);
        resultForEachScaleCounter.countResultToScaleQ4ForOnePerson(dataAboutOnePerson);
        return resultForEachScaleCounter.valuesOfTestScalesForOnePerson;
    }
    public ArrayList<String> createResultListToWriting(ArrayList<String > listData){
        ArrayList<String> listOfResultData = new ArrayList<>();
        for (String dataAboutOnePerson : listData) {
            String resultDataForOnePerson = convertResultForOnePersonToString(countResultInAllScales(dataAboutOnePerson));
            listOfResultData.add(resultDataForOnePerson);
        }
        return listOfResultData;
    }




}
