package kostiukTest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 01.03.2017.
 */
public class ResultForEachScale {
    public int countResultForOneScaleForOnePerson(int[] numbersOfQuestion, String[] answersFromPerson) {
        int sum = 0;
        for (int i = 0; i < numbersOfQuestion.length; i++) {
            switch (Integer.valueOf(answersFromPerson[numbersOfQuestion[i]])) {
                case -3:
                    sum += -3;
                case -2:
                    sum += -2;
                case -1:
                    sum += -1;
                case 0:
                    sum += 0;
                case 1:
                    sum += 1;
                case 2:
                    sum += 2;
                case 3:
                    sum += 3;
            }
        }
        return sum;
    }
    public String[] createArrayOfAnswersFromStringData(String dataAboutOnePerson) {
        String[] arrayOfTestDataForOnePerson = dataAboutOnePerson.split(" ");
        return arrayOfTestDataForOnePerson;
    }
    public Map<ScalesOfKostuikTest,Integer> countResult(String dataAboutPerson){
        String[] answers = createArrayOfAnswersFromStringData(dataAboutPerson);
        Map<ScalesOfKostuikTest,Integer> results = new HashMap<>();
        int[] numbersOfQuestionsForScaleRight = {1,3,5,7,9,10,12,13};
        int[] numbersOfQuestionsForScaleDemocracy = {2,4,6,8,11};
        results.put(ScalesOfKostuikTest.RIGHT_LEFT,countResultForOneScaleForOnePerson(numbersOfQuestionsForScaleRight,answers));
        results.put(ScalesOfKostuikTest.AUTORITARIZM_DEMOCRACY,countResultForOneScaleForOnePerson(numbersOfQuestionsForScaleDemocracy,answers));
        return results;
    }

}
