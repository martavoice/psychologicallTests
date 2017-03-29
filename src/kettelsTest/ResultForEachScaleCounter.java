package kettelsTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 24.02.2017.
 */
public class ResultForEachScaleCounter {
    public static Map<ScalesOfKettelsTest, Integer> valuesOfTestScalesForOnePerson = new HashMap<>();

    public int checkAnswerForSeveralOptions(String array[], int numberOfQuestion, String answerVariant) {
        int result = 0;
        if (array[numberOfQuestion].equalsIgnoreCase("b")) {
            result += 1;
        } else if (array[numberOfQuestion].equalsIgnoreCase(answerVariant)) {
            result += 2;
        }
        return result;
    }

    public int countSumFromArrayForSeveralOptions(String dataAboutPerson, int[] numbersOfQuestions, String answer) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbersOfQuestions.length; i++) {
            list.add(checkAnswerForSeveralOptions(createArrayOfAnswersFromStringData(answer), numbersOfQuestions[i], answer));
        }
        return calculateResultForOneScale(list);
    }

    public int countSumFromArrayForOneOption(String dataAboutPerson, int[] numbersOfQuestions, String answer) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbersOfQuestions.length; i++) {
            list.add(checkAnswerForOneOption(createArrayOfAnswersFromStringData(answer), numbersOfQuestions[i], answer));
        }
        return calculateResultForOneScale(list);
    }

    public int countSumFromAllAnswersOf2Options(int[] aOption, int[] COption, String dataAboutPerson) {
        int sum = 0;
        sum += countSumFromArrayForSeveralOptions(dataAboutPerson, aOption, "a");
        sum += countSumFromArrayForSeveralOptions(dataAboutPerson, COption, "c");
        return sum;
    }

    public int countSumFromAllAnswersOf3Options(int[] aOption, int[] cOption, int[] bOption, String dataAboutPerson) {
        int sum = 0;
        sum += countSumFromArrayForOneOption(dataAboutPerson, aOption, "a");
        sum += countSumFromArrayForOneOption(dataAboutPerson, cOption, "c");
        sum += countSumFromArrayForOneOption(dataAboutPerson, bOption, "b");
        return sum;
    }

    public int checkAnswerForOneOption(String array[], int numberOfQuestion, String answerVariant) {
        int result = 0;
        if (array[numberOfQuestion].equalsIgnoreCase(answerVariant)) {
            result += 1;
        }
        return result;
    }

    public String[] createArrayOfAnswersFromStringData(String dataAboutOnePerson) {
        String[] arrayOfTestDataForOnePerson = dataAboutOnePerson.split(" ");
        return arrayOfTestDataForOnePerson;
    }

    public int calculateResultForOneScale(ArrayList<Integer> listOfAnswerData) {
        int sum = 0;
        for (Integer data : listOfAnswerData) {
            sum += data;
        }
        return sum;
    }


    public void countResultToScaleAForOnePerson(String dataAboutOnePerson) {
        int[] questionsWithCOption = {26, 27, 51, 52, 151, 176};
        int[] questionsWithAOption = {3, 101, 126};
        int sum = countSumFromAllAnswersOf2Options(questionsWithAOption, questionsWithCOption, dataAboutOnePerson);
        valuesOfTestScalesForOnePerson.put(ScalesOfKettelsTest.A, sum);
    }

    public void countResultToScaleBForOnePerson(String dataAboutOnePerson) {
        int[] questionsWithCOption = {77, 102, 127, 153};
        int[] questionsWithAOption = {152, 177, 178};
        int[] questionsWithBOption = {28, 53, 78, 103, 128};
        int sum = countSumFromAllAnswersOf3Options(questionsWithAOption, questionsWithCOption, questionsWithBOption, dataAboutOnePerson);
        valuesOfTestScalesForOnePerson.put(ScalesOfKettelsTest.B, sum);
    }

    public void countResultToScaleCForOnePerson(String dataAboutOnePerson) {
        int[] questionsWithCOption = {5, 29, 79, 80, 129, 154};
        int[] questionsWithAOption = {4, 30, 55, 104, 105, 130, 179};
        int sum = countSumFromAllAnswersOf2Options(questionsWithAOption, questionsWithCOption, dataAboutOnePerson);
        valuesOfTestScalesForOnePerson.put(ScalesOfKettelsTest.C, sum);
    }

    public void countResultToScaleEForOnePerson(String dataAboutOnePerson) {
        int[] questionsWithCOption = {6, 31, 32, 57, 81, 106, 154};
        int[] questionsWithAOption = {7, 56, 131, 155, 156, 180, 181};
        int sum = countSumFromAllAnswersOf2Options(questionsWithAOption, questionsWithCOption, dataAboutOnePerson);

        valuesOfTestScalesForOnePerson.put(ScalesOfKettelsTest.E, sum);
    }

    public void countResultToScaleFForOnePerson(String dataAboutOnePerson) {
        int[] questionsWithCOption = {8, 82, 107, 108, 157, 158};
        int[] questionsWithAOption = {33, 58, 83, 132, 133, 182, 183};
        int sum = countSumFromAllAnswersOf2Options(questionsWithAOption, questionsWithCOption, dataAboutOnePerson);
        valuesOfTestScalesForOnePerson.put(ScalesOfKettelsTest.F, sum);
    }

    public void countResultToScaleGForOnePerson(String dataAboutOnePerson) {
        int[] questionsWithCOption = {9, 34, 59, 84, 159};
        int[] questionsWithAOption = {109, 134, 160, 184, 185};
        int sum = countSumFromAllAnswersOf2Options(questionsWithAOption, questionsWithCOption, dataAboutOnePerson);
        valuesOfTestScalesForOnePerson.put(ScalesOfKettelsTest.G, sum);
    }

    public void countResultToScaleHForOnePerson(String dataAboutOnePerson) {
        int[] questionsWithCOption = {35, 60, 61, 85, 86, 161};
        int[] questionsWithAOption = {10, 36, 110, 111, 135, 136, 186};
        int sum = countSumFromAllAnswersOf2Options(questionsWithAOption, questionsWithCOption, dataAboutOnePerson);
        valuesOfTestScalesForOnePerson.put(ScalesOfKettelsTest.H, sum);
    }

    public void countResultToScaleIForOnePerson(String dataAboutOnePerson) {
        int[] questionsWithCOption = {11, 62, 87, 137, 162};
        int[] questionsWithAOption = {12, 37, 112, 138, 163};
        int sum = countSumFromAllAnswersOf2Options(questionsWithAOption, questionsWithCOption, dataAboutOnePerson);
        valuesOfTestScalesForOnePerson.put(ScalesOfKettelsTest.I, sum);
    }

    public void countResultToScaleLForOnePerson(String dataAboutOnePerson) {
        int[] questionsWithCOption = {13, 63, 64, 89, 139};
        int[] questionsWithAOption = {38, 88, 113, 114, 164};
        int sum = countSumFromAllAnswersOf2Options(questionsWithAOption, questionsWithCOption, dataAboutOnePerson);
        valuesOfTestScalesForOnePerson.put(ScalesOfKettelsTest.L, sum);
    }

    public void countResultToScaleMForOnePerson(String dataAboutOnePerson) {
        int[] questionsWithCOption = {14, 15, 90, 141, 165, 166};
        int[] questionsWithAOption = {39, 40, 91, 115, 116, 140};
        int sum = countSumFromAllAnswersOf2Options(questionsWithAOption, questionsWithCOption, dataAboutOnePerson);
        valuesOfTestScalesForOnePerson.put(ScalesOfKettelsTest.M, sum);
    }

    public void countResultToScaleNForOnePerson(String dataAboutOnePerson) {
        int[] questionsWithCOption = {16, 41, 66, 67, 92};
        int[] questionsWithAOption = {17, 42, 117, 142, 167};
        int sum = countSumFromAllAnswersOf2Options(questionsWithAOption, questionsWithCOption, dataAboutOnePerson);
        valuesOfTestScalesForOnePerson.put(ScalesOfKettelsTest.N, sum);
    }

    public void countResultToScaleOForOnePerson(String dataAboutOnePerson) {
        int[] questionsWithCOption = {19, 44, 68, 86, 93, 144, 168};
        int[] questionsWithAOption = {18, 43, 69, 94, 118, 119, 143};
        int sum = countSumFromAllAnswersOf2Options(questionsWithAOption, questionsWithCOption, dataAboutOnePerson);
        valuesOfTestScalesForOnePerson.put(ScalesOfKettelsTest.O, sum);
    }

    public void countResultToScaleQ1ForOnePerson(String dataAboutOnePerson) {
        int[] questionsWithCOption = {21, 45, 95, 120, 170};
        int[] questionsWithAOption = {20, 46, 70, 145, 169};
        int sum = countSumFromAllAnswersOf2Options(questionsWithAOption, questionsWithCOption, dataAboutOnePerson);
        valuesOfTestScalesForOnePerson.put(ScalesOfKettelsTest.Q1, sum);
    }

    public void countResultToScaleQ2ForOnePerson(String dataAboutOnePerson) {
        int[] questionsWithCOption = {22, 96, 97, 121, 122};
        int[] questionsWithAOption = {47, 71, 72, 146, 171};
        int sum = countSumFromAllAnswersOf2Options(questionsWithAOption, questionsWithCOption, dataAboutOnePerson);
        valuesOfTestScalesForOnePerson.put(ScalesOfKettelsTest.Q2, sum);
    }

    public void countResultToScaleQ3ForOnePerson(String dataAboutOnePerson) {
        int[] questionsWithCOption = {23, 24, 123, 147, 172};
        int[] questionsWithAOption = {48, 73, 98, 148, 173};
        int sum = countSumFromAllAnswersOf2Options(questionsWithAOption, questionsWithCOption, dataAboutOnePerson);
        valuesOfTestScalesForOnePerson.put(ScalesOfKettelsTest.Q3, sum);
    }

    public void countResultToScaleQ4ForOnePerson(String dataAboutOnePerson) {
        int[] questionsWithCOption = {25, 75, 100, 125, 150, 175};
        int[] questionsWithAOption = {49, 50, 74, 99, 124, 149, 174};
        int sum = countSumFromAllAnswersOf2Options(questionsWithAOption, questionsWithCOption, dataAboutOnePerson);
        valuesOfTestScalesForOnePerson.put(ScalesOfKettelsTest.Q4, sum);
    }
}
