package kostiukTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 01.03.2017.
 */
public class ResultForEachScale {
    public int countResultForOneScaleForOnePerson(int[] numbersOfQuestion, ArrayList<String> answersFromPerson) {
        int sum = 0;

        for (int i = 0; i < numbersOfQuestion.length; i++) {
            switch (Integer.valueOf(answersFromPerson.get(numbersOfQuestion[i]))) {
                case -3:
                    sum += -3;
                    break;
                case -2:
                    sum += -2;
                    break;
                case -1:
                    sum += -1;
                    break;
                case 0:
                    sum += 0;
                    break;
                case 1:
                    sum += 1;
                    break;
                case 2:
                    sum += 2;
                    break;
                case 3:
                    sum += 3;
                    break;
            }
        }
        return sum;
    }

    public ArrayList<String> createArrayOfAnswersFromStringData(String dataAboutOnePerson) {
        ArrayList<String> dataOfOnePerson = new ArrayList<>();
        dataOfOnePerson.add(" ");
        String[] data = dataAboutOnePerson.split("\t");
        for (int i = 0; i < data.length; i++) {
            dataOfOnePerson.add(data[i]);
        }
      /*   char[] buffer = dataAboutOnePerson.toCharArray();

        for (int i = 0; i < buffer.length; i++) {
            if (buffer[i] != '\t') {
                Character data = buffer[i];
                dataOfOnePerson.add((data.toString()));
            }
        }
        */

        return dataOfOnePerson;
    }

    public Map<ScalesOfKostuikTest, Integer> countResult(String dataAboutPerson) {
        ArrayList<String> answers = createArrayOfAnswersFromStringData(dataAboutPerson);
        Map<ScalesOfKostuikTest, Integer> results = new HashMap<>();
        int[] numbersOfQuestionsForScaleRight = {1, 3, 5, 7, 9, 10, 12, 13};
        int[] numbersOfQuestionsForScaleDemocracy = {2, 4, 6, 8, 11};
        results.put(ScalesOfKostuikTest.RIGHT_LEFT, countResultForOneScaleForOnePerson(numbersOfQuestionsForScaleRight, answers));
        results.put(ScalesOfKostuikTest.AUTORITARIZM_DEMOCRACY, countResultForOneScaleForOnePerson(numbersOfQuestionsForScaleDemocracy, answers));
        return results;
    }

}
