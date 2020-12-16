package view;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import racingcar.RacingCars;
import racingcar.Result;

public class OutputView {
    private static final String ONE_STEP = "-";

    public static void printResults(List<Result> results) {
        System.out.println("실행 결과");
        for (Result result : results) {
            printResult(result);
        }
    }

    private static void printResult(Result inputResult) {
        Map<String, Integer> result = inputResult.getResult();
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " : " + ONE_STEP.repeat(entry.getValue()));
        }
        printEmptyLine();
    }

    public static void printWinner(RacingCars cars) {
        List<String> winners = cars.getWinners();
        System.out.println("최종 우승자: " + String.join(", ", winners));
    }

    private static void printEmptyLine() {
        System.out.println();
    }
}
