package B_FacadeMode;

/**
 * @Author cuifua
 * @Date 2021/7/4 19:20
 * @Version 1.0
 */
public class Facade
{
    public void writeout()
    {
        AmoduleApi a = new AmoduleImpl();
        a.testA();

        BmoduleApi b = new BmoduleImpl();
        b.testB();

        CmoduleApi c = new CmoduleImpl();
        c.testC();
    }
}
