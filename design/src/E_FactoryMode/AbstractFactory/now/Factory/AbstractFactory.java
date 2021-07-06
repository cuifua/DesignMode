package E_FactoryMode.AbstractFactory.now.Factory;

import E_FactoryMode.AbstractFactory.now.CPU.CPU_API;
import E_FactoryMode.AbstractFactory.now.MainBoard.MainBoard_API;

/**
 * ���󹤳��Ľӿڣ��������������Ʒ����Ĳ���
 */
public interface AbstractFactory
{
	/**
	 * ����CPU�Ķ���
	 * @return CPU�Ķ���
	 */
	public CPU_API createCPUApi();


	/**
	 * ��������Ķ���
	 * @return ����Ķ���
	 */
	public MainBoard_API createMainboardApi();
}