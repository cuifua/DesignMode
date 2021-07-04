package A_SimpleFactory;

/**
 * @Author cuifua
 * @Date 2021/7/4 17:35
 * @Version 1.0
 */
public class ApiImplA implements Api
{
    @Override
    public void test1(String s)
    {
        System.out.println("这是测试A，内容是:" + s);
        System.out.println("这是测试A修改一下，内容是:" + s);
    }
}
