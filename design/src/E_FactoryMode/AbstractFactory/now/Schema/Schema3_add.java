package E_FactoryMode.AbstractFactory.now.Schema;

import E_FactoryMode.AbstractFactory.now.CPU.IntelCPU;
import E_FactoryMode.AbstractFactory.now.Factory.AbstractFactory_add;
import E_FactoryMode.AbstractFactory.now.MainBoard.GAmainboard;
import E_FactoryMode.AbstractFactory.now.Memery.HyMemory;

/**
 * 装机方案三：Intel 的CPU + 技嘉的主板 + 现代的内存
 */
public class Schema3_add implements AbstractFactory_add
{
	public Object createProduct(int type)
	{
		Object retObj = null;
		//type为1表示创建CPU，type为2表示创建主板，type为3表示创建内存

		if(type==1)
			retObj = new IntelCPU(1156);

		else if(type==2)
			retObj = new GAmainboard(1156);

		//创建新添加的产品
		else if(type==3)
			retObj = new HyMemory();

		return retObj;
	}
}
