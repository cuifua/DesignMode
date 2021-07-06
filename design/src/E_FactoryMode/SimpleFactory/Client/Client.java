package E_FactoryMode.SimpleFactory.Client;

import E_FactoryMode.SimpleFactory.IceCream.IceCream;
import E_FactoryMode.SimpleFactory.Factory.IceCreamFactory;

/**
 * @Author cuifua
 * @Date 2021/7/6 17:42
 * @Version 1.0
 */
//【弊端是，如果要新加入一个口味的冰淇淋呢】
//    【步骤1，新建一个新口味的类继承冰淇淋接口】
//    【步骤2，在Factory里添加一个case判断分支】
public class Client
{
    public static void main(String[] args)
    {
        IceCream apple = IceCreamFactory.Creat("Apple");
        apple.test();
        /*需要哪个创建哪个实例
        IceCream banana = IceCreamFactory.Creat("Banana");
        banana.test();

        IceCream orange = IceCreamFactory.Creat("Orange");
        orange.test();
         */
    }
}
