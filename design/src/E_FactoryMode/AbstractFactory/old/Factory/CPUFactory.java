package E_FactoryMode.AbstractFactory.old.Factory;

import E_FactoryMode.AbstractFactory.old.CPU.AMDCPU;
import E_FactoryMode.AbstractFactory.old.CPU.CPU_API;
import E_FactoryMode.AbstractFactory.old.CPU.IntelCPU;

/**
 * @Author cuifua
 * @Date 2021/7/6 19:28
 * @Version 1.0
 */
public class CPUFactory
{
    /**
     * 创建CPU接口对象的方法
     * @param type 选择CPU类型的参数
     * @return CPU接口对象的方法
     */
    public static CPU_API createCPUApi(int type)
    {
        CPU_API cpu = null;

        //根据参数来选择并创建相应的CPU对象
        if(type==1)
            cpu = new IntelCPU(1156);

        else if(type==2)
            cpu = new AMDCPU(939);

        return cpu;
    }
}
