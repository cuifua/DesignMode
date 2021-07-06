package E_FactoryMode.AbstractFactory.now.Schema;

import E_FactoryMode.AbstractFactory.now.CPU.CPU_API;
import E_FactoryMode.AbstractFactory.now.CPU.IntelCPU;
import E_FactoryMode.AbstractFactory.now.Factory.AbstractFactory;
import E_FactoryMode.AbstractFactory.now.MainBoard.GAmainboard;
import E_FactoryMode.AbstractFactory.now.MainBoard.MainBoard_API;

/**
 * װ������һ��Intel ��CPU + ���ε�����
 * ���ﴴ��CPU����������ʱ���Ƕ�Ӧ�ģ���ƥ���ϵ�
 */

public class Schema1 implements AbstractFactory
{
	public CPU_API createCPUApi()
	{
		return new IntelCPU(1156);
	}
	public MainBoard_API createMainboardApi()
	{
		return new GAmainboard(1156);
	}	
}