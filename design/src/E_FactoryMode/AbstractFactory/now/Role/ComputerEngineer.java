package E_FactoryMode.AbstractFactory.now.Role;

import E_FactoryMode.AbstractFactory.now.CPU.CPU_API;
import E_FactoryMode.AbstractFactory.now.Factory.AbstractFactory;
import E_FactoryMode.AbstractFactory.now.MainBoard.MainBoard_API;

/**
 * װ������ʦ����
 */
public  class ComputerEngineer
{
	/**
	 * ������װ������Ҫ��CPU
	 */
	private CPU_API cpu= null;

	/**
	 * ������װ������Ҫ������
	 */
	private MainBoard_API mainboard = null;

	/**
	 * װ������
	 * @param schema �ͻ�ѡ���װ������
	 */
	public void makeComputer(AbstractFactory schema)
	{
		//1������׼����װ������Ҫ�����
		prepareHardwares(schema);
		//2����װ����
		
		//3�����Ի���
		
		//4�������ͻ�
	}


	/**
	 * ׼��װ������Ҫ�����
	 * @param schema �ͻ�ѡ���װ������
	 */
	private void prepareHardwares(AbstractFactory schema)
	{
		//����Ҫȥ׼��CPU������ľ���ʵ�֣�Ϊ��ʾ���򵥣�����ֻ׼��������
		//���ǣ�װ������ʦ����֪�����ȥ��������ô���أ�
		
		//��ʹ�ó��󹤳�����ȡ��Ӧ�Ľӿڶ���
		this.cpu = schema.createCPUApi();
		this.mainboard = schema.createMainboardApi();
		
		//����һ������Ƿ����
		this.cpu.calculate();
		this.mainboard.installCPU();
	}
}
