package racingcar;

import java.util.List;

public class RacingCars {
    private static final int MIN_RACING_CARS_SIZE = 2;
    private List<Car> cars;

    public RacingCars(List<Car> cars) {
        validateRacingCarsSize(cars);
        validateOverlappedRacingCar(cars);
        this.cars = cars;
    }

    private void validateRacingCarsSize(List<Car> cars) {
        if (cars.size() < MIN_RACING_CARS_SIZE) {
            throw new IllegalArgumentException("[ERROR] 경주할 자동차가 2대이상이어야 합니다.");
        }
    }

    private void validateOverlappedRacingCar(List<Car> cars) {
        int notOverlappedCarsSize = (int) cars.stream()
            .distinct()
            .count();
        if (cars.size() != notOverlappedCarsSize) {
            throw new IllegalArgumentException("[ERROR] 경주할 자동차의 이름이 중복되면 안 됩니다.");
        }
    }
}
