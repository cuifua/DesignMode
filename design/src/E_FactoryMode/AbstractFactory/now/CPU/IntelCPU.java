package E_FactoryMode.AbstractFactory.now.CPU;

/**
 * @Author cuifua
 * @Date 2021/7/6 19:18
 * @Version 1.0
 */
public class IntelCPU implements CPU_API
{
    //cpu的针脚数目
    private int pins = 0;

    //构造方法，传入cpu的针脚数目
    public IntelCPU(int pins)
    {
        this.pins = pins;
    }

    @Override
    public void calculate()
    {
        System.out.println("intel cpu中目前有针脚数目：" + pins);
    }
}
