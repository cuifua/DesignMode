package E_FactoryMode.AbstractFactory.now.Role;

import E_FactoryMode.AbstractFactory.now.Factory.AbstractFactory;
import E_FactoryMode.AbstractFactory.now.Schema.Schema2;

public class Client
{
	public static void main(String[] args)
	{
		//创建装机工程师对象
		ComputerEngineer engineer = new ComputerEngineer();

		//客户选择并创建需要使用的装机方案对象
		AbstractFactory schema = new Schema2();

		//告诉装机工程师自己选择的装机方案，让装机工程师组装电脑
		engineer.makeComputer(schema);
	}
}
