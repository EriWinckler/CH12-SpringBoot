package com.carRental.carRental.carStore;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/car")
public class CarController {
    private Map<Long, Car> cars = new HashMap<>();
    private AtomicLong idCounter = new AtomicLong();

    public CarController() {
        Long id = idCounter.incrementAndGet();
        cars.put(id, new Car(id, "Kia Stinger"));
        cars.put(id, new Car(id, "Hyundai Palisade"));
        cars.put(id, new Car(id, "Nissan Skyline"));
        cars.put(id, new Car(id, "Nissan Skyline"));
        cars.put(id, new Car(id, "Nissan Skyline"));
        cars.put(id, new Car(id, "Nissan Skyline"));
        cars.put(id, new Car(id, "Nissan Skyline"));

        cars.put(id, new Car(id, "Nissan Skyline"));
        cars.put(id, new Car(id, "Nissan Skyline"));
        cars.put(id, new Car(id, "Nissan Skyline"));

    }

    @GetMapping
    public List<Car> all() {
        return new ArrayList<Car>(cars.values());
    }

    @PostMapping
    public Car newStore(@RequestBody Car newCar) {
        Long id = idCounter.incrementAndGet();
        newCar.setId(id);
        cars.put(id, newCar);
        return newCar;
    }

    @GetMapping("/{id}")
    public Car car(@PathVariable Long id) {
        return cars.get(id);
    }

    @PutMapping("/{id}")
    public Car updateStore(@PathVariable Long id,
                           @RequestBody Car updateCar) {

        Car car = cars.get(id);
        updateCar.getClass().getDeclaredFields();

        if(car == null) {
            return car;
        }

        if(updateCar.getCarModel() != null) {
            car.setCarModel(updateCar.getCarModel());
        }

        return car;
    }

    @DeleteMapping("/{id}")
    public void deleteStore(@PathVariable Long id) {
        cars.remove(id);
    }
}