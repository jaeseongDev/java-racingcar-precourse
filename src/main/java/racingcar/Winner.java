package racingcar;

import java.util.List;

public class Winner {
    private static final int GAP_WITH_SIZE_AND_INDEX = 1;

    public static List<String> getNamesOfWinners(List<Result> results) {
        Result lastResult = results.get(results.size() - GAP_WITH_SIZE_AND_INDEX);
        return lastResult.getNamesOfMaxPosition();
    }
}
