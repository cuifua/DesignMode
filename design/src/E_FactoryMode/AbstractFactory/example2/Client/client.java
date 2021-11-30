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
    //���󹤳��������ǲ�Ʒ�أ��ִ����������ִ���Ʒ��ħ����������ħ����Ʒ
    public static void main(String[] args)
    {
        AbstractFactory factory = new MagicFactory();
        //AbstractFactory factory = new MoedenFactory();   ���������Ҫ�ĸ�����ֱ���滻�����ͺ���

        Food food = factory.createFood();
        food.eat();
        Vehicle vehicle = factory.createVehicle();
        vehicle.go();
    }
}
