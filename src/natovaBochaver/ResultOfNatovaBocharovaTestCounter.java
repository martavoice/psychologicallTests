package natovaBochaver;



import java.util.ArrayList;
import java.util.Map;

/**
 * Created by user on 01.03.2017.
 */
public class ResultOfNatovaBocharovaTestCounter {
    ResultForEachScaleCounter resultForEachScaleCounter;


    public String convertResultForOnePersonToString(Map<ScalesOfNatovaBocharevTest, Integer> resultValuesForOnePerson) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (Map.Entry<ScalesOfNatovaBocharevTest, Integer> pair : resultValuesForOnePerson.entrySet()) {
            String resultOfCount = pair.getValue().toString();
            stringBuilder.append(resultOfCount);
        }
        String allResultFromOnePerson = stringBuilder.toString();
        return allResultFromOnePerson;
    }
    public Map<ScalesOfNatovaBocharevTest, Integer> countResultInAllScales(String dataAboutOnePerson) {
       resultForEachScaleCounter.countResultForScaleSFT(dataAboutOnePerson);
       resultForEachScaleCounter.countResultForScaleST(dataAboutOnePerson);
       resultForEachScaleCounter.countResultForScaleSB(dataAboutOnePerson);
       resultForEachScaleCounter.countResultForScaleSP(dataAboutOnePerson);
       resultForEachScaleCounter.countResultForScaleSS(dataAboutOnePerson);
       resultForEachScaleCounter.countResultForScaleSC(dataAboutOnePerson);
       resultForEachScaleCounter.countResultForScaleSPP(dataAboutOnePerson);
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
