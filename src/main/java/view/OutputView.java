package view;

import java.util.List;
import racingcar.RacingCars;

public class OutputView {
    private static final String ONE_STEP = "-";
    public static void printResult() {
        System.out.println("실행 결과");
    }

    public static void printResultsPerTry(RacingCars cars) {
        List<Integer> positionsOfCars = cars.getPositionsOfCars();
        List<String> namesOfCars = cars.getNamesOfCars();
        for (int i = 0; i < namesOfCars.size(); i++) {
            System.out.println(namesOfCars.get(i) + " : " + ONE_STEP.repeat(positionsOfCars.get(i)));
        }
        printEmptyLine();
    }

    private static void printPosition(int positions) {

    }

    private static void printEmptyLine() {
        System.out.println();
    }
}
