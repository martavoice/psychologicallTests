package sigelmanTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 28.02.2017.
 */
public class ResultForEachScaleCounter {
    private Map<ScaleOfSingelmanTest, int[]> keysToTest = new HashMap<>();


    public void createMapOfKeysToTest() {

        int[] numbersOfQuestionForScaleLove = {1, 6, 11, 16, 21, 26, 31, 36, 41, 46};
        int[] numbersOfQuestionForScaleRequirements = {2, 7, 12, 17, 22, 27, 32, 37, 42, 47};
        int[] numbersOfQuestionForScaleWard = {3, 8, 13, 18, 23, 28, 33, 38, 43, 48};
        int[] numbersOfQuestionForScaleRejection = {4, 9, 14, 19, 24, 29, 34, 39, 44, 49};
        int[] numbersOfQuestionForScaleLiberality = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        keysToTest.put(ScaleOfSingelmanTest.LOVE, numbersOfQuestionForScaleLove);
        keysToTest.put(ScaleOfSingelmanTest.REQUIREMENTS, numbersOfQuestionForScaleRequirements);
        keysToTest.put(ScaleOfSingelmanTest.WARD, numbersOfQuestionForScaleWard);
        keysToTest.put(ScaleOfSingelmanTest.REJECTION, numbersOfQuestionForScaleRejection);
        keysToTest.put(ScaleOfSingelmanTest.lIBERALITY, numbersOfQuestionForScaleLiberality);

    }

    public String[] createArrayOfAnswersFromStringData(String dataAboutOnePerson) {

        String[] arrayOfTestDataForOnePerson = dataAboutOnePerson.split(" ");
        return arrayOfTestDataForOnePerson;
    }

    public int countResultForOneScaleForOnePerson(int[] numbersOfQuestion, String[] answersFromPerson) {
        int sum = 0;

        for (int i = 0; i < numbersOfQuestion.length; i++) {
            switch (Integer.valueOf(answersFromPerson[numbersOfQuestion[i]])) {
                case 4:
                    sum += 4;
                case 3:
                    sum += 3;
                case 2:
                    sum += 2;
                case 1:
                    sum += 1;
            }
        }
        return sum;
    }

    public Map<ScaleOfSingelmanTest, Integer> countResultToScaleForOnePerson(String dataAboutPerson) {
        String[] answersFromOnPerson = createArrayOfAnswersFromStringData(dataAboutPerson);
        Map<ScaleOfSingelmanTest, Integer> valuesOfTestScalesForOnePerson = new HashMap<>();

        for (Map.Entry<ScaleOfSingelmanTest, int[]> pair : keysToTest.entrySet()) {
               int[] numbersOfQuestion = pair.getValue();
               int sumForScale = countResultForOneScaleForOnePerson(numbersOfQuestion,answersFromOnPerson);

               valuesOfTestScalesForOnePerson.put(pair.getKey(),sumForScale);
        }
        return valuesOfTestScalesForOnePerson;
    }

}
