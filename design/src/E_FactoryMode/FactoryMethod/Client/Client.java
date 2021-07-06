package E_FactoryMode.FactoryMethod.Client;

import E_FactoryMode.FactoryMethod.Factory.*;
import E_FactoryMode.FactoryMethod.IceCream.IceCream;

/**
 * @Author cuifua
 * @Date 2021/7/6 17:54
 * @Version 1.0
 */
//这种方式新增口味，只需要新加一个口味，和这个口味的工厂，最大的便捷之处在于不用去那个唯一的Factory类里不断添加case
public class Client
{
    public static void main(String[] args)
    {
        IceCreamFactory apple_factory = new Apple_Factory();   //创建苹果工厂
        IceCream apple_icecream = apple_factory.creat();       //苹果工厂创建苹果冰淇淋
        apple_icecream.test();
        /*需要哪个创建哪个实例
        IceCreamFactory banana_factory = new Banana_Factory();
        IceCream banana_icecream = banana_factory.creat();
        banana_icecream.test();

        IceCreamFactory orange_factory = new Orange_Factory();
        IceCream orange_icecream = orange_factory.creat();
        orange_icecream.test();
         */
        IceCreamFactory test_factory = new Test_Factory();
        IceCream test_cream = test_factory.creat();
        test_cream.test();

    }
}
