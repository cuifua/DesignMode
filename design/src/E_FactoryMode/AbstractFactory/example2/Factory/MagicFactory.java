package E_FactoryMode.AbstractFactory.example2.Factory;

import E_FactoryMode.AbstractFactory.example2.Food.Food;
import E_FactoryMode.AbstractFactory.example2.Food.MushRoom;
import E_FactoryMode.AbstractFactory.example2.Vehicle.Broom;
import E_FactoryMode.AbstractFactory.example2.Vehicle.Vehicle;

/**
 * @Author cuifua
 * @Date 2021/11/30 13:08
 * @Version 1.0
 */
public class MagicFactory implements AbstractFactory
{
    @Override
    public Food createFood()
    {
        return new MushRoom();
    }

    @Override
    public Vehicle createVehicle()
    {
        return new Broom();
    }
}
