package racingcar;

import java.util.Arrays;
import java.util.Scanner;
import view.InputView;

public class Game {

    public void start(Scanner scanner) {
        try {
            String[] namesOfCars = getInputNamesOfCars(scanner);
            RacingCars cars = RacingCarsFactory.createRacingCarsByCarsNames(namesOfCars);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            start(scanner);
        }

    }

    private String[] getInputNamesOfCars(Scanner scanner) {
        String input = InputView.inputNamesOfCars(scanner);
        String[] namesOfCars = input.split(",");

        // TODO - 디버깅용 코드
        System.out.println(Arrays.toString(namesOfCars));

        return namesOfCars;
    }
}
