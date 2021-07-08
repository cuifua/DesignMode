package H_MediatorMode.PC_Example.Colleague;

import H_MediatorMode.PC_Example.Mediator.Mediator;

/**
 * CPU类，一个同事类
 */
public class CPU extends Colleague
{
	public CPU(Mediator mediator)
	{
		super(mediator);
	}

	/**
	 * 分解出来的视频数据
	 */
	private String videoData = "";

	/**
	 * 分解出来的声音数据
	 */
	private String soundData = "";

	/**
	 * 获取分解出来的视频数据
	 * @return 分解出来的视频数据
	 */
	public String getVideoData() {
		return videoData;
	}

	/**
	 * 获取分解出来的声音数据
	 * @return 分解出来的声音数据
	 */
	public String getSoundData() {
		return soundData;
	}

	/**
	 * 处理数据，把数据分成音频和视频的数据
	 * @param data 被处理的数据
	 */
	//业务方法，也是和中介者交互的方法
	//【这里执行的是cpu具体的自己的方法，和显卡啊声卡啊没有任何交互关系，这个方法就是单纯分离数据的，没有调用其他同事的意思】
	public void executeData(String data)
	{
		//把数据分解开，前面的是视频数据，后面的是音频数据
		String [] ss = data.split(",");
		this.videoData = ss[0];
		this.soundData = ss[1];

		//通知主板，CPU的工作完成
		this.getMediator().changed(this);
	}
	
}
