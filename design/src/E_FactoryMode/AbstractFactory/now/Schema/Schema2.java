package E_FactoryMode.AbstractFactory.now.Schema;

import E_FactoryMode.AbstractFactory.now.CPU.AMDCPU;
import E_FactoryMode.AbstractFactory.now.CPU.CPU_API;
import E_FactoryMode.AbstractFactory.now.Factory.AbstractFactory;
import E_FactoryMode.AbstractFactory.now.MainBoard.MSImainboard;
import E_FactoryMode.AbstractFactory.now.MainBoard.MainBoard_API;

/**
 * װ����������AMD��CPU + ΢�ǵ�����
 * ���ﴴ��CPU����������ʱ���Ƕ�Ӧ�ģ���ƥ���ϵ�
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