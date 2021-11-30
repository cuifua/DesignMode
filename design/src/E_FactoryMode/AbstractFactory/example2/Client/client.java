package E_FactoryMode.AbstractFactory.example2.Client;

import E_FactoryMode.AbstractFactory.example2.Factory.AbstractFactory;
import E_FactoryMode.AbstractFactory.example2.Factory.MagicFactory;
import E_FactoryMode.AbstractFactory.example2.Factory.MoedenFactory;
import E_FactoryMode.AbstractFactory.example2.Food.Food;
import E_FactoryMode.AbstractFactory.example2.Vehicle.Vehicle;

/**
 * @Author cuifua
 * @Date 2021/11/30 13:09
 * @Version 1.0
 */
public class client
{
    //抽象工厂的意义是产品簇，现代工厂创造现代物品，魔法工厂创造魔法物品
    public static void main(String[] args)
    {
        AbstractFactory factory = new MagicFactory();
        //AbstractFactory factory = new MoedenFactory();   我们最后需要哪个，就直接替换工厂就好了

        Food food = factory.createFood();
        food.eat();
        Vehicle vehicle = factory.createVehicle();
        vehicle.go();
    }
}
