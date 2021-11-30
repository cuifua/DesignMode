package E_FactoryMode.AbstractFactory.example2.Factory;

import E_FactoryMode.AbstractFactory.example2.Food.Bread;
import E_FactoryMode.AbstractFactory.example2.Food.Food;
import E_FactoryMode.AbstractFactory.example2.Vehicle.Car;
import E_FactoryMode.AbstractFactory.example2.Vehicle.Vehicle;

/**
 * @Author cuifua
 * @Date 2021/11/30 13:07
 * @Version 1.0
 */
public class MoedenFactory implements AbstractFactory
{
    @Override
    public Food createFood()
    {
        return new Bread();
    }

    @Override
    public Vehicle createVehicle()
    {
        return new Car();
    }
}
