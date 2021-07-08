package H_MediatorMode.PC_Example.Colleague;

import H_MediatorMode.PC_Example.Mediator.Mediator;

/**
 * 显卡类，一个同事类
 */
public class VideoCard extends Colleague
{
	//第一步，使自己带上中介者
	public VideoCard(Mediator mediator)
	{
		super(mediator);
	}

	//第二步，自己的方法
	/**
	 * 显示视频数据
	 * @param data 被显示的数据
	 */
	public void showData(String data)
	{
		System.out.println("您正观看的是："+data);
	}	
}
