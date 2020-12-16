package view;

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
        result.forEach((key, value) -> System.out.println(key + " : " + ONE_STEP.repeat(value)));
        printEmptyLine();
    }

    public static void printWinner(List<String> namesOfWinners) {
        System.out.println("최종 우승자: " + String.join(", ", namesOfWinners));
    }

    private static void printEmptyLine() {
        System.out.println();
    }
}
