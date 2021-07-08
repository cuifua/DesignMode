package H_MediatorMode.PC_Example.Colleague;

import H_MediatorMode.PC_Example.Mediator.Mediator;

/**
 * 声卡类，一个同事类
 */
public class SoundCard extends Colleague
{
	public SoundCard(Mediator mediator)
	{
		super(mediator);
	}
	
	/**
	 * 按照声频数据发出声音
	 * @param data 发出声音的数据
	 */
	//业务方法，也是和中介者交互的方法
	public void soundData(String data)
	{
		System.out.println("画外音："+data);
	}
	
}
