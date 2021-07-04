package A_SimpleFactory;

/**
 * @Author cuifua
 * @Date 2021/7/4 17:37
 * @Version 1.0
 */
public class ApiImplB implements Api
{
    @Override
    public void test1(String s)
    {
        System.out.println("这是测试B，内容是:" + s);
    }
}
