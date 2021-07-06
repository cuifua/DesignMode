package E_FactoryMode.AbstractFactory.now.Factory;

/**
 * @Author cuifua
 * @Date 2021/7/6 20:18
 * @Version 1.0
 */
public interface AbstractFactory_add
{
    //这里的Type指的是大类，CPU，Mainborad类，不特指cup里的AMD等型号
    public Object createProduct(int Type);
}
