/**
 * Created by user on 24.02.2017.
 */
public class ValueByAnswer {
    private final String answer;
    private final Long value;

    ValueByAnswer(String answer, Long value) {
        this.answer = answer;
        this.value = value;
    }

    public static ValueByAnswer valueByAnswer(String answer, Integer value) {
        return new ValueByAnswer(answer, value.longValue());
    }


}
