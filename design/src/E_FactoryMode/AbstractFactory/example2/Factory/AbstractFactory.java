package E_FactoryMode.AbstractFactory.example2.Factory;

import E_FactoryMode.AbstractFactory.example2.Food.Food;
import E_FactoryMode.AbstractFactory.example2.Vehicle.Vehicle;

/**
 * @Author cuifua
 * @Date 2021/11/30 13:05
 * @Version 1.0
 */
public interface AbstractFactory
{
    Food createFood();
    Vehicle createVehicle();
}
