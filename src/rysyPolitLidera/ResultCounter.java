package rysyPolitLidera;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 01.03.2017.
 */
public class ResultCounter {

    public String[] createArrayOfAnswersFromStringData(String dataAboutOnePerson) {
        String[] arrayOfTestDataForOnePerson = dataAboutOnePerson.split(" ");
        return arrayOfTestDataForOnePerson;
    }

    public Map<String, Integer> createMapWithResults(String dataAboutPerson) {
        String[] answers = createArrayOfAnswersFromStringData(dataAboutPerson);
        Map<String, Integer> resultOfRanging = new HashMap<>();
        String[] scales = {"Відповідальність", "Впевненість в собі", "Гнучкість", "Kомпетентність",
                "Мудрість", "Ораторські здібності", "Організаторські здібності", "Освіченість", "Патріотизм",
                "Порядність", "Професіоналізм", "Рішучість", "Самостійність", "Сила", "Справедливість",
                "Толерантність", "Харизматичність", "Цілеспрямованість", "Чесність", "Щирість"};
        for (int i = 0; i < scales.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                resultOfRanging.put(scales[i],Integer.valueOf(answers[j]));
            }
        }

        return resultOfRanging;
    }
}

