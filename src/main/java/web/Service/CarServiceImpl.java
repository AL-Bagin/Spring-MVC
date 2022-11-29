package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        if (count == null || count >= 5 || count <= 0) {
            return carList;
        }else {
            return carList.stream().limit(count).collect(Collectors.toList());
        }
    }
}

