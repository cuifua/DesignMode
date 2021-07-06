package E_FactoryMode.AbstractFactory.now.Schema;

import E_FactoryMode.AbstractFactory.now.CPU.AMDCPU;
import E_FactoryMode.AbstractFactory.now.Factory.AbstractFactory_add;
import E_FactoryMode.AbstractFactory.now.MainBoard.MSImainboard;

/**
 * װ����������AMD��CPU + ΢�ǵ�����
 * ���ﴴ��CPU����������ʱ���Ƕ�Ӧ�ģ���ƥ���ϵ�
 */
public class Schema2_add implements AbstractFactory_add
{
	public Object createProduct(int type)
	{
		Object retObj = null;
		//typeΪ1��ʾ����CPU��typeΪ2��ʾ��������
		if(type==1)
			retObj = new AMDCPU(939);

		else if(type==2)
			retObj = new MSImainboard(939);

		return retObj;
	}	
}