package racingcar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {
    Map<String, Integer> result = new HashMap<>();

    public void put(String name, int position) {
        result.putIfAbsent(name, position);
    }

    public Map<String, Integer> getResult() {
        return result;
    }

    public List<String> getNamesOfMaxPosition() {
        List<String> names = new ArrayList<>();
        result.forEach((key, value) -> {
            if (value == getMaxPosition()) {
                names.add(key);
            }
        });
        return names;
    }

    private int getMaxPosition() {
        List<Integer> positions = new ArrayList<>(result.values());
        return Collections.max(positions);
    }
}
