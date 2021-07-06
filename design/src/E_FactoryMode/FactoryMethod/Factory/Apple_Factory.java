package E_FactoryMode.FactoryMethod.Factory;

import E_FactoryMode.FactoryMethod.IceCream.Apple_IceCream;
import E_FactoryMode.FactoryMethod.IceCream.IceCream;

/**
 * @Author cuifua
 * @Date 2021/7/6 17:49
 * @Version 1.0
 */
public class Apple_Factory implements IceCreamFactory
{
    @Override
    public IceCream creat()
    {
        return new Apple_IceCream();
    }
}
