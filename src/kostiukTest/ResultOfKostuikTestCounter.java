package kostiukTest;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by user on 01.03.2017.
 */
public class ResultOfKostuikTestCounter {
    private ResultForEachScale resultForEachScale;
    public String convertResultForOnePersonToString(Map<ScalesOfKostuikTest, Integer> resultValuesForOnePerson) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (Map.Entry<ScalesOfKostuikTest, Integer> pair : resultValuesForOnePerson.entrySet()) {
            String resultOfCount = pair.getValue().toString();
            stringBuilder.append(resultOfCount);
        }
        String allResultFromOnePerson = stringBuilder.toString();
        return allResultFromOnePerson;
    }
    public ArrayList<String> createResultListToWriting(ArrayList<String > listData){
        ArrayList<String> listOfResultData = new ArrayList<>();
        for (String dataAboutOnePerson : listData) {
            String resultDataForOnePerson = convertResultForOnePersonToString(resultForEachScale.countResult(dataAboutOnePerson));
            listOfResultData.add(resultDataForOnePerson);
        }
        return listOfResultData;
    }
}
