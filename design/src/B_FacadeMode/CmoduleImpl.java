package B_FacadeMode;

/**
 * @Author cuifua
 * @Date 2021/7/4 19:15
 * @Version 1.0
 */
public class CmoduleImpl implements CmoduleApi
{
    @Override
    public void testC()
    {
        System.out.println("现在在接口C的实现方法里，实现方法testC()");
    }
}
