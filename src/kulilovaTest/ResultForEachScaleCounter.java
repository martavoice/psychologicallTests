package kulilovaTest;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 01.03.2017.
 */


public class ResultForEachScaleCounter {
    public int countSumForScale(int numberOfFirstQuestion, int numberOfLastQuestion, String dataAboutPerson) {
        int sum = 0;
        ArrayList<String> answersFromOnPerson = createArrayOfAnswersFromStringData(dataAboutPerson);
        for (int i = numberOfFirstQuestion; i < numberOfLastQuestion + 1; i++) {
            sum += Integer.valueOf(answersFromOnPerson.get(i));
        }
        return sum;
    }

    public Map<ScalesOfKulikovaTest, Integer> countResultToScaleForOnePerson(String dataAboutPerson) {

        Map<ScalesOfKulikovaTest, Integer> valuesOfTestScalesForOnePerson = new HashMap<>();

        valuesOfTestScalesForOnePerson.put(ScalesOfKulikovaTest.G, countSumForScale(1, 10, dataAboutPerson));
        valuesOfTestScalesForOnePerson.put(ScalesOfKulikovaTest.B, countSumForScale(11, 19, dataAboutPerson));
        valuesOfTestScalesForOnePerson.put(ScalesOfKulikovaTest.M, countSumForScale(20, 26, dataAboutPerson));
        valuesOfTestScalesForOnePerson.put(ScalesOfKulikovaTest.S, countSumForScale(27, 35, dataAboutPerson));
        valuesOfTestScalesForOnePerson.put(ScalesOfKulikovaTest.U, countSumForScale(36, 44, dataAboutPerson));

        return valuesOfTestScalesForOnePerson;
    }

    public ArrayList<String> createArrayOfAnswersFromStringData(String dataAboutOnePerson) {
        ArrayList<String> dataOfOnePerson = new ArrayList<>();
        char[] buffer = dataAboutOnePerson.toCharArray();

        for (int i = 0; i < buffer.length; i++) {
            if (buffer[i] != '\t') {
                Character data = buffer[i];
                dataOfOnePerson.add((data.toString()));
            }
        }

        return dataOfOnePerson;
    }


}
