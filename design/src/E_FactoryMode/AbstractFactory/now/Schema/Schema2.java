package E_FactoryMode.AbstractFactory.now.Schema;

import E_FactoryMode.AbstractFactory.now.CPU.AMDCPU;
import E_FactoryMode.AbstractFactory.now.CPU.CPU_API;
import E_FactoryMode.AbstractFactory.now.Factory.AbstractFactory;
import E_FactoryMode.AbstractFactory.now.MainBoard.MSImainboard;
import E_FactoryMode.AbstractFactory.now.MainBoard.MainBoard_API;

/**
 * 装机方案二：AMD的CPU + 微星的主板
 * 这里创建CPU和主板对象的时候，是对应的，能匹配上的
 */
public class Schema2 implements AbstractFactory
{
	public CPU_API createCPUApi()
	{
		return new AMDCPU(939);
	}
	public MainBoard_API createMainboardApi()
	{
		return new MSImainboard(939);
	}	
}