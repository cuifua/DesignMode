package E_FactoryMode.AbstractFactory.example.Factory;

import E_FactoryMode.AbstractFactory.example.A.AbstractProductA;
import E_FactoryMode.AbstractFactory.example.B.AbstractProductB;

/**
 * ���󹤳��Ľӿڣ��������������Ʒ����Ĳ���
 */
public interface AbstractFactory
{
	/**
	 * ʾ�����������������ƷA�Ķ���
	 * @return �����ƷA�Ķ���
	 */
	public AbstractProductA createProductA();

	/**
	 * ʾ�����������������ƷB�Ķ���
	 * @return �����ƷB�Ķ���
	 */
	public AbstractProductB createProductB();
}