package E_FactoryMode.SimpleFactory.Factory;

import E_FactoryMode.SimpleFactory.IceCream.Apple_IceCream;
import E_FactoryMode.SimpleFactory.IceCream.Banana_IceCream;
import E_FactoryMode.SimpleFactory.IceCream.IceCream;
import E_FactoryMode.SimpleFactory.IceCream.Orange_IceCream;

/**
 * @Author cuifua
 * @Date 2021/7/6 17:38
 * @Version 1.0
 */
public class IceCreamFactory
{
    public static IceCream Creat(String taste)
    {
        IceCream iceCream = null;

        switch (taste)
        {
            case "Apple":
                iceCream = new Apple_IceCream();
                break;
            case "Banana":
                iceCream = new Banana_IceCream();
                break;
            case "Orange":
                iceCream = new Orange_IceCream();
                break;
            default:
                break;
        }
        return iceCream;
    }
}
