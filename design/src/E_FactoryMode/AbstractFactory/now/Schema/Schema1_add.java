package E_FactoryMode.AbstractFactory.now.Schema;

import E_FactoryMode.AbstractFactory.now.CPU.IntelCPU;
import E_FactoryMode.AbstractFactory.now.Factory.AbstractFactory_add;
import E_FactoryMode.AbstractFactory.now.MainBoard.GAmainboard;

/**
 * װ������һ��Intel ��CPU + ���ε�����
 * ���ﴴ��CPU����������ʱ���Ƕ�Ӧ�ģ���ƥ���ϵ�
 */
public class Schema1_add implements AbstractFactory_add
{
	public Object createProduct(int type)
	{
		Object retObj = null;
		//typeΪ1��ʾ����CPU��typeΪ2��ʾ��������
		if(type==1)
			retObj = new IntelCPU(1156);

		else if(type==2)
			retObj = new GAmainboard(1156);

		return retObj;
	}	
}