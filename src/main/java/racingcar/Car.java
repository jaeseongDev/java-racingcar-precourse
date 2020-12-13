package racingcar;

import java.util.Objects;

public class Car {

    private static final int MIN_CAR_NAME_LENGTH = 1;
    private static final int MAX_CAR_NAME_LENGTH = 5;
    private final String name;
    private int position = 0;

    public Car(String name) {
        validateCarName(name);
        this.name = name.trim();
    }

    private void validateCarName(String name) {
        if (name.trim().length() < MIN_CAR_NAME_LENGTH
            || name.trim().length() > MAX_CAR_NAME_LENGTH
        ) {
            throw new IllegalArgumentException(
                "[ERROR] 이름은 1글자 이상 5글자 이하만 가능합니다."
                    + "(문자열의 양끝에 있는 공백을 제거한 글자 수가 5글자 이하여야 합니다.)");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
