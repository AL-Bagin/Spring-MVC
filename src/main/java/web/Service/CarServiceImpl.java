package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> carList;

    public CarServiceImpl() {
        carList = new ArrayList<>();
        carList.add(new Car(1, "Black", "BMW", "5"));
        carList.add(new Car(2, "White", "Audi", "А3"));
        carList.add(new Car(3, "Red", "Mazda", "6"));
        carList.add(new Car(4, "Grey", "Kia", "K5"));
        carList.add(new Car(5, "Green", "Toyota", "Camry"));
    }

    @Override
    public List<Car> listCarServ(Integer count) {
        List<Car> cars = new ArrayList<>();
        int i = 1;
        if (count == null || count >= 5 || count <= 0) {
            return carList;
        }else {
            for (Car car : carList) {
                cars.add(car);
                i++;
                if (i > count) { break; }
            }
            return cars;
        }
    }
}

