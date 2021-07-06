package A_SimpleFactory;

/**
 * @Author cuifua
 * @Date 2021/7/4 17:37
 * @Version 1.0
 */
public class Client
{
    public static void main(String[] args)
    {
        Api api = SimpleFactory.creatApi();
        api.test1("我被创造出来了！！");

        System.out.println("============gitHub==========");
    }
}
