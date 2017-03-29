package kulilovaTest;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 01.03.2017.
 */


public class ResultForEachScaleCounter {
    public int countSumForScale(int numberOfFirstQuestion, int numberOfLastQuestion, String dataAboutPerson) {
        int sum = 0;
        String[] answersFromOnPerson = createArrayOfAnswersFromStringData(dataAboutPerson);
        for (int i = numberOfFirstQuestion; i < numberOfLastQuestion + 1; i++) {
            sum += Integer.valueOf(answersFromOnPerson[i]);
        }
        return sum;
    }

    public Map<ScalesOfKulikovaTest, Integer> countResultToScaleForOnePerson(String dataAboutPerson) {
        String[] answersFromOnPerson = createArrayOfAnswersFromStringData(dataAboutPerson);
        Map<ScalesOfKulikovaTest, Integer> valuesOfTestScalesForOnePerson = new HashMap<>();

        valuesOfTestScalesForOnePerson.put(ScalesOfKulikovaTest.G, countSumForScale(1, 10, dataAboutPerson));
        valuesOfTestScalesForOnePerson.put(ScalesOfKulikovaTest.B, countSumForScale(11, 19, dataAboutPerson));
        valuesOfTestScalesForOnePerson.put(ScalesOfKulikovaTest.M, countSumForScale(20, 26, dataAboutPerson));
        valuesOfTestScalesForOnePerson.put(ScalesOfKulikovaTest.S, countSumForScale(27, 35, dataAboutPerson));
        valuesOfTestScalesForOnePerson.put(ScalesOfKulikovaTest.U, countSumForScale(36, 47, dataAboutPerson));

        return valuesOfTestScalesForOnePerson;
    }

    public String[] createArrayOfAnswersFromStringData(String dataAboutOnePerson) {
        String[] arrayOfTestDataForOnePerson = dataAboutOnePerson.split(" ");
        return arrayOfTestDataForOnePerson;
    }


}
