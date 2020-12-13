package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacingCarsFactory {
    public static RacingCars createRacingCarsByCarsNames(String[] namesOfCars) {
        List<Car> cars = new ArrayList<>();
        for (String name : namesOfCars) {
            cars.add(new Car(name));
        }
        return new RacingCars(cars);
    }
}
