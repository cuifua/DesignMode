package B_FacadeMode;

/**
 * @Author cuifua
 * @Date 2021/7/4 19:15
 * @Version 1.0
 */
public class BmoduleImpl implements BmoduleApi
{
    @Override
    public void testB()
    {
        System.out.println("现在在接口B的实现方法里，实现方法testB()");
    }
}
