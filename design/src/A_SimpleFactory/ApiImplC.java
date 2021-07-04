package A_SimpleFactory;

/**
 * @Author cuifua
 * @Date 2021/7/4 18:08
 * @Version 1.0
 */
public class ApiImplC implements Api
{
    @Override
    public void test1(String s)
    {
        System.out.println("这是测试C，内容是:" + s);
        System.out.println("这是测试C,推送，内容是:" + s);
    }
}
