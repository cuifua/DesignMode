package E_FactoryMode.AbstractFactory.old.CPU;

/**
 * @Author cuifua
 * @Date 2021/7/6 19:21
 * @Version 1.0
 */
public class AMDCPU implements CPU_API
{
    //cpu的针脚数目
    private int pins = 0;

    //构造方法，传入cpu的针脚数目
    public AMDCPU(int pins)
    {
        this.pins = pins;
    }
    @Override
    public void calculate()
    {
        System.out.println("AMD cpu中目前有针脚数目：" + pins);
    }
}
