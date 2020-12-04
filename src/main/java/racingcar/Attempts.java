package racingcar;

import java.util.List;
import ui.Output;

public class Attempts {

    private int count = 0;

    public Attempts(String count) {
        int attemptsCount = toInt(count);
        validatePositiveNumber(attemptsCount);
        this.count = attemptsCount;
    }

    public void completeAll(List<Car> cars) {
        Output.willPrintResult();
        for (int i = 0; i < count; i++) {
            completeOne(cars);
        }
    }

    private void completeOne(List<Car> cars) {
        moveCarsAndPrintResult(cars);
        Output.printEmptyLine();
    }

    private void validatePositiveNumber(int count) {
        if (count < 0) {
            throw new IllegalArgumentException(ErrorMessage.SHOULD_BE_NOT_NEGATIVE_NUMBER);
        }
    }

    private int toInt(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.SHOULD_INPUT_ONLY_NUMBER);
        }
    }

    private void moveCarsAndPrintResult(List<Car> cars) {
        cars.stream().forEach(car -> car.moveAndPrintResult());
    }
}
