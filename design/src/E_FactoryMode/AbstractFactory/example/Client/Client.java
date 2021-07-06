package E_FactoryMode.AbstractFactory.example.Client;

import E_FactoryMode.AbstractFactory.example.Factory.AbstractFactory;
import E_FactoryMode.AbstractFactory.example.Factory.ConcreteFactory1;

public class Client
{
	public static void main(String[] args)
	{
		//�������󹤳�����
		AbstractFactory af = new ConcreteFactory1();

		//ͨ�����󹤳�����ȡһϵ�еĶ������ƷA�Ͳ�ƷB
		af.createProductA();
		af.createProductB();
	}
}
