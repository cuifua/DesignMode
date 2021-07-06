package E_FactoryMode.FactoryMethod.Factory;

import E_FactoryMode.FactoryMethod.IceCream.IceCream;
import E_FactoryMode.FactoryMethod.IceCream.Test_IceCream;

/**
 * @Author cuifua
 * @Date 2021/7/6 18:03
 * @Version 1.0
 */
public class Test_Factory implements IceCreamFactory
{
    @Override
    public IceCream creat()
    {
        return new Test_IceCream();//【步骤二】
    }
}
