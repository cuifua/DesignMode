package E_FactoryMode.AbstractFactory.now.Schema;

import E_FactoryMode.AbstractFactory.now.CPU.IntelCPU;
import E_FactoryMode.AbstractFactory.now.Factory.AbstractFactory_add;
import E_FactoryMode.AbstractFactory.now.MainBoard.GAmainboard;
import E_FactoryMode.AbstractFactory.now.Memery.HyMemory;

/**
 * װ����������Intel ��CPU + ���ε����� + �ִ����ڴ�
 */
public class Schema3_add implements AbstractFactory_add
{
	public Object createProduct(int type)
	{
		Object retObj = null;
		//typeΪ1��ʾ����CPU��typeΪ2��ʾ�������壬typeΪ3��ʾ�����ڴ�

		if(type==1)
			retObj = new IntelCPU(1156);

		else if(type==2)
			retObj = new GAmainboard(1156);

		//��������ӵĲ�Ʒ
		else if(type==3)
			retObj = new HyMemory();

		return retObj;
	}
}
