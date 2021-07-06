package E_FactoryMode.FactoryMethod.Factory;

import E_FactoryMode.FactoryMethod.IceCream.IceCream;
import E_FactoryMode.FactoryMethod.IceCream.Orange_IceCream;

/**
 * @Author cuifua
 * @Date 2021/7/6 17:53
 * @Version 1.0
 */
public class Orange_Factory implements IceCreamFactory
{
    @Override
    public IceCream creat()
    {
        return new Orange_IceCream();
    }
}
