package natovaBochaver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 01.03.2017.
 */
public class ResultForEachScaleCounter {
    public static Map<ScalesOfNatovaBocharevTest, Integer> valuesOfTestScalesForOnePerson = new HashMap<>();

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

    public int countSumFromArray(String dataAboutPerson, int[] numbersOfQuestions, String answer) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbersOfQuestions.length; i++) {
            list.add(checkAnswer(dataAboutPerson, numbersOfQuestions[i], answer));
        }
        return calculateResultForOneScale(list);
    }

    public int countSumFromAllAnswers(int[] positive, int[] negative, String dataAboutPerson) {
        int sum = 0;
        sum += countSumFromArray(dataAboutPerson, positive, "+");
        sum += countSumFromArray(dataAboutPerson, negative, "-");
        return sum;
    }

    public int checkAnswer(String dataAboutPerson, int numberOfQuestion, String answer) {

        ArrayList<String> answersFromOnPerson = createArrayOfAnswersFromStringData(dataAboutPerson);
        answersFromOnPerson.add(0, " ");
        int sum = 0;
        if (answersFromOnPerson.get(numberOfQuestion).equals(answer)) {
            sum += 1;
        }
        return sum;
    }

    public int calculateResultForOneScale(ArrayList<Integer> listOfAnswerData) {
        int sum = 0;
        for (Integer data : listOfAnswerData) {
            sum += data;
        }
        return sum;
    }

    public void countResultForScaleSFT(String dataAboutPerson) {
        int[] arrayOfPositiveAnswers = {2, 5, 15, 22};
        int[] arrayOfNegativeAnswers = {7, 11, 17, 33, 39, 47, 59, 65, 71, 77};
        int sum = countSumFromAllAnswers(arrayOfPositiveAnswers, arrayOfNegativeAnswers, dataAboutPerson);
        valuesOfTestScalesForOnePerson.put(ScalesOfNatovaBocharevTest.SFT, sum);
    }

    public void countResultForScaleST(String dataAboutPerson) {
        int[] arrayOfPositiveAnswers = {3, 9, 18, 48};
        int[] arrayOfNegativeAnswers = {24, 28, 35, 40, 44, 53, 61, 67, 73, 79};
        int sum = countSumFromAllAnswers(arrayOfPositiveAnswers, arrayOfNegativeAnswers, dataAboutPerson);
        valuesOfTestScalesForOnePerson.put(ScalesOfNatovaBocharevTest.ST, sum);
    }

    public void countResultForScaleSB(String dataAboutPerson) {
        int[] arrayOfPositiveAnswers = {8, 52, 55, 60, 78};
        int[] arrayOfNegativeAnswers = {1, 12, 16, 20, 23, 30, 34, 43, 50, 66, 69, 72};
        int sum = countSumFromAllAnswers(arrayOfPositiveAnswers, arrayOfNegativeAnswers, dataAboutPerson);
        valuesOfTestScalesForOnePerson.put(ScalesOfNatovaBocharevTest.SB, sum);
    }

    public void countResultForScaleSP(String dataAboutPerson) {
        int[] arrayOfPositiveAnswers = {29, 62, 74};
        int[] arrayOfNegativeAnswers = {6, 13, 19, 12, 25, 36, 41, 45, 54, 56, 68};
        int sum = countSumFromAllAnswers(arrayOfPositiveAnswers, arrayOfNegativeAnswers, dataAboutPerson);
        valuesOfTestScalesForOnePerson.put(ScalesOfNatovaBocharevTest.SP, sum);
    }

    public void countResultForScaleSS(String dataAboutPerson) {
        int[] arrayOfPositiveAnswers = {26, 37, 49, 57};
        int[] arrayOfNegativeAnswers = {31, 63, 75};
        int sum = countSumFromAllAnswers(arrayOfPositiveAnswers, arrayOfNegativeAnswers, dataAboutPerson);
        valuesOfTestScalesForOnePerson.put(ScalesOfNatovaBocharevTest.SS, sum);
    }

    public void countResultForScaleSC(String dataAboutPerson) {
        int[] arrayOfPositiveAnswers = {14, 27, 32, 38, 46, 80};
        int[] arrayOfNegativeAnswers = {4, 10, 21, 42, 51, 58, 64, 70, 76};
        int sum = countSumFromAllAnswers(arrayOfPositiveAnswers, arrayOfNegativeAnswers, dataAboutPerson);
        valuesOfTestScalesForOnePerson.put(ScalesOfNatovaBocharevTest.SC, sum);
    }

    public void countResultForScaleSPP(String dataAboutPerson) {

        int[] arrayOfPositiveAnswers = {2, 3, 5, 8, 9, 14, 15, 18, 22, 26, 27, 29, 32, 37, 38, 46, 48, 49, 52, 55, 57, 60, 62, 74, 78, 80};
        int[] arrayOfNegativeAnswers = {1, 4, 6, 7, 10, 11, 12, 13, 16, 17, 19, 20, 21, 23, 24, 25, 28, 30, 31, 33, 34, 35, 36, 39, 40, 41, 42, 43, 44, 45, 47, 50, 51, 53, 54, 56, 58, 59, 61, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 75, 76, 77, 79};

        int sum = countSumFromAllAnswers(arrayOfPositiveAnswers, arrayOfNegativeAnswers, dataAboutPerson);
        valuesOfTestScalesForOnePerson.put(ScalesOfNatovaBocharevTest.SPP, sum);
    }
}
