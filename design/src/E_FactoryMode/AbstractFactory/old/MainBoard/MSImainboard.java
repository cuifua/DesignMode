package E_FactoryMode.AbstractFactory.old.MainBoard;

/**
 * @Author cuifua
 * @Date 2021/7/6 19:25
 * @Version 1.0
 */
public class MSImainboard implements MainBoard_API
{
    //CPU插槽的孔数
    private int cpuHoles = 0;

    //构造方法，传入CPU插槽的孔数
    public MSImainboard(int cpuHoles)
    {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU()
    {
        System.out.println("now in MSIMainboard,cpuHoles="+cpuHoles);
    }
}
