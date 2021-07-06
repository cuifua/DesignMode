package E_FactoryMode.AbstractFactory.example.Factory;

import E_FactoryMode.AbstractFactory.example.A.AbstractProductA;
import E_FactoryMode.AbstractFactory.example.A.ProductA2;
import E_FactoryMode.AbstractFactory.example.B.AbstractProductB;
import E_FactoryMode.AbstractFactory.example.B.ProductB2;

/**
 * ����Ĺ���ʵ�ֶ���ʵ�ִ�������Ĳ�Ʒ����Ĳ���
 */
public class ConcreteFactory2 implements AbstractFactory
{
	public AbstractProductA createProductA()
	{
		return new ProductA2();
	}

	public AbstractProductB createProductB()
	{
		return new ProductB2();
	}
}

