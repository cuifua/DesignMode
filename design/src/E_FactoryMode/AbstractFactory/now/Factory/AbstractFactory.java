package E_FactoryMode.AbstractFactory.now.Factory;

import E_FactoryMode.AbstractFactory.now.CPU.CPU_API;
import E_FactoryMode.AbstractFactory.now.MainBoard.MainBoard_API;

/**
 * 抽象工厂的接口，声明创建抽象产品对象的操作
 */
public interface AbstractFactory
{
	/**
	 * 创建CPU的对象
	 * @return CPU的对象
	 */
	public CPU_API createCPUApi();


	/**
	 * 创建主板的对象
	 * @return 主板的对象
	 */
	public MainBoard_API createMainboardApi();
}