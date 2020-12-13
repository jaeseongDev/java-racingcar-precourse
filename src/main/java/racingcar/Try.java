package racingcar;

public class Try {
    private static final int MIN_COUNT = 1;
    private int count;

    public Try(int count) {
        validateCount(count);
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }

    private void validateCount(int count) {
        if (count < MIN_COUNT) {
            throw new IllegalArgumentException("[ERROR] 시도 회수는 1 이상이어야 합니다.");
        }
    }
}
