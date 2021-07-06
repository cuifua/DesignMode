package E_FactoryMode.AbstractFactory.now.Role;

import E_FactoryMode.AbstractFactory.now.CPU.CPU_API;
import E_FactoryMode.AbstractFactory.now.Factory.AbstractFactory_add;
import E_FactoryMode.AbstractFactory.now.MainBoard.MainBoard_API;
import E_FactoryMode.AbstractFactory.now.Memery.MemoryApi;

/**
 * װ������ʦ����
 */
public  class ComputerEngineer_add
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
	 * ������װ������Ҫ���ڴ�
	 */
	private MemoryApi memory = null;

	/**
	 * װ������
	 * @param schema �ͻ�ѡ���װ������
	 */
	public void makeComputer(AbstractFactory_add schema)
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
	private void prepareHardwares(AbstractFactory_add schema)
	{
		//����Ҫȥ׼��CPU������ľ���ʵ�֣�Ϊ��ʾ���򵥣�����ֻ׼��������
		//���ǣ�װ������ʦ����֪�����ȥ��������ô���أ�
		
		//ʹ�ó��󹤳�����ȡ��Ӧ�Ľӿڶ���
		this.cpu = (CPU_API) schema.createProduct(1);
		this.mainboard = (MainBoard_API) schema.createProduct(2);
		this.memory = (MemoryApi)schema.createProduct(3);
		
		//����һ������Ƿ����
		this.cpu.calculate();
		this.mainboard.installCPU();
		if(memory!=null)
			this.memory.cacheData();
	}
}
