package racingcar;

import java.util.List;
import java.util.Scanner;
import view.InputView;
import view.OutputView;

public class Game {

    public void start(Scanner scanner) {
        try {
            String[] namesOfCars = getInputNamesOfCars(scanner);
            RacingCars cars = RacingCarsFactory.createRacingCarsByCarsNames(namesOfCars);
            List<Result> results = cars.getResults();
            Try tryCount = getInputTry(scanner);
            for (int i = 0; i < tryCount.getCount(); i++) {
                cars.race();
                OutputView.printResults(results);
            }
            OutputView.printWinner(Winner.getNamesOfWinners(results));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            start(scanner);
        }
    }

    private String[] getInputNamesOfCars(Scanner scanner) {
        String input = InputView.inputNamesOfCars(scanner);
        String[] namesOfCars = input.split(",");
        return namesOfCars;
    }

    private Try getInputTry(Scanner scanner) {
        try {
            String input = InputView.inputTryCount(scanner);
            int tryCount = toInt(input);
            return new Try(tryCount);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getInputTry(scanner);
        }
    }

    private int toInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 숫자만 입력하셔야 됩니다.");
        }
    }
}
