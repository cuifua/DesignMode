package E_FactoryMode.AbstractFactory.old.Role;

/**
 * @Author cuifua
 * @Date 2021/7/6 19:35
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args)
    {
        //创建装机工程师对象
        ComputerEngineer engineer = new ComputerEngineer();


        //告诉装机工程师自己选择的配件，让装机工程师组装电脑
        engineer.makeComputer(1,2);
    }
}
