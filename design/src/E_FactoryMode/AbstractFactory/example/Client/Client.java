package E_FactoryMode.AbstractFactory.example.Client;

import E_FactoryMode.AbstractFactory.example.Factory.AbstractFactory;
import E_FactoryMode.AbstractFactory.example.Factory.ConcreteFactory1;

public class Client
{
	public static void main(String[] args)
	{
		//创建抽象工厂对象
		AbstractFactory af = new ConcreteFactory1();

		//通过抽象工厂来获取一系列的对象，如产品A和产品B
		af.createProductA();
		af.createProductB();
	}
}
