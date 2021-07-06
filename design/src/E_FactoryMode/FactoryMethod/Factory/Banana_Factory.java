package E_FactoryMode.FactoryMethod.Factory;

import E_FactoryMode.FactoryMethod.IceCream.Banana_IceCream;
import E_FactoryMode.FactoryMethod.IceCream.IceCream;

/**
 * @Author cuifua
 * @Date 2021/7/6 17:53
 * @Version 1.0
 */
public class Banana_Factory implements IceCreamFactory
{
    @Override
    public IceCream creat()
    {
        return new Banana_IceCream();
    }
}
