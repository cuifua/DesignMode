package E_FactoryMode.AbstractFactory.now.Role;

import E_FactoryMode.AbstractFactory.now.Factory.AbstractFactory;
import E_FactoryMode.AbstractFactory.now.Schema.Schema2;

public class Client
{
	public static void main(String[] args)
	{
		//����װ������ʦ����
		ComputerEngineer engineer = new ComputerEngineer();

		//�ͻ�ѡ�񲢴�����Ҫʹ�õ�װ����������
		AbstractFactory schema = new Schema2();

		//����װ������ʦ�Լ�ѡ���װ����������װ������ʦ��װ����
		engineer.makeComputer(schema);
	}
}
