package H_MediatorMode.PC_Example.Colleague;

import H_MediatorMode.PC_Example.Mediator.Mediator;

/**
 * 光驱类，一个同事类
 */
public class CDDriver extends Colleague
{
	//意思是注册一个中介者
	public CDDriver(Mediator mediator)
	{
		super(mediator);
	}

	/**
	 * 光驱读取出来的数据
	 */
	private String data = "";  // 这里的 “ ” 指的是自身业务状态数据

	/**
	 * 获取光驱读取出来的数据
	 * @return 光驱读取出来的数据
	 */
	public String getData()
	{
		return this.data;
	}

	/**
	 * 读取光盘
	 */
	//业务方法，也是和中介者交互的方法
	public void readCD()
	{
		//逗号前是视频显示的数据，逗号后是声音
		this.data = "设计模式,值得好好研究";

		//通知主板，自己的状态发生了改变
		this.getMediator().changed(this);
	}
}
