package E_FactoryMode.AbstractFactory.example.Factory;

import E_FactoryMode.AbstractFactory.example.A.AbstractProductA;
import E_FactoryMode.AbstractFactory.example.A.ProductA1;
import E_FactoryMode.AbstractFactory.example.B.AbstractProductB;
import E_FactoryMode.AbstractFactory.example.B.ProductB1;

/**
 * ����Ĺ���ʵ�ֶ���ʵ�ִ�������Ĳ�Ʒ����Ĳ���
 */
public class ConcreteFactory1 implements AbstractFactory
{
	public AbstractProductA createProductA()
	{
		return new ProductA1();
	}

	public AbstractProductB createProductB()
	{
		return new ProductB1();
	}
}

