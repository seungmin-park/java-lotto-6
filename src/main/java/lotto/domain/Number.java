package lotto.domain;

public class Number {
    private int value;

    public Number(int value) {
        validate(value);
        this.value = value;
    }

    private void validate(int value) {
        isInRange(value);
    }

    private void isInRange(int value) {
        if (value < 1 || value > 45) {
            throw new IllegalArgumentException("[ERROR] 번호는 1이상 45이하의 수만 입력할 수 있습니다.");
        }
    }
}
