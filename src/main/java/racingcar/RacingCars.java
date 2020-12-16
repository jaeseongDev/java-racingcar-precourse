package racingcar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RacingCars {
    private static final int MIN_RACING_CARS_SIZE = 2;
    private List<Car> cars;
    private List<Result> results = new ArrayList<>();

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

    public void race() {
        Result result = new Result();
        for (Car car : cars) {
            car.move();
            result.put(car.getName(), car.getPosition());
        }
        results.add(result);
    }

    public List<Integer> getPositionsOfCars() {
        List<Integer> positionsOfCars = new ArrayList<>();
        for (Car car : cars) {
            positionsOfCars.add(car.getPosition());
        }
        return positionsOfCars;
    }

    public List<String> getWinners() {
        List<Integer> positionsOfCars = getPositionsOfCars();
        List<String> namesOfCars = getNamesOfCars();
        List<String> winners = new ArrayList<>();
        int maxPosition = Collections.max(positionsOfCars);
        for (int i = 0; i < namesOfCars.size(); i++) {
            if (maxPosition == positionsOfCars.get(i)) {
                winners.add(namesOfCars.get(i));
            }
        }
        return winners;
    }

    public List<String> getNamesOfCars() {
        List<String> namesOfCars = new ArrayList<>();
        for (Car car : cars) {
            namesOfCars.add(car.getName());
        }
        return namesOfCars;
    }

    public List<Result> getResults() {
        return results;
    }
}
