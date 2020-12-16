package racingcar;

import java.util.HashMap;
import java.util.Map;

public class Result {
    Map<String, Integer> result = new HashMap<>();

    public void put(String name, int position) {
        result.putIfAbsent(name, position);
    }

    public Map<String, Integer> getResult() {
        return result;
    }
}
