package H_MediatorMode.PC_Example.Role;

import H_MediatorMode.PC_Example.Colleague.CDDriver;
import H_MediatorMode.PC_Example.Colleague.CPU;
import H_MediatorMode.PC_Example.Colleague.SoundCard;
import H_MediatorMode.PC_Example.Colleague.VideoCard;
import H_MediatorMode.PC_Example.Mediator.MotherBoard;

public class Client
{
	public static void main(String[] args)
	{
		//1：创建中介者——主板对象
		MotherBoard mediator = new MotherBoard();

		//2：创建同事类
		CDDriver cd = new CDDriver(mediator);
		CPU cpu = new CPU(mediator);
		VideoCard vc = new VideoCard(mediator);
		SoundCard sc = new SoundCard(mediator);

		//3：让中介者知道所有的同事
		mediator.setCdDriver(cd);
		mediator.setCpu(cpu);
		mediator.setVideoCard(vc);
		mediator.setSoundCard(sc);
		
		//4：开始看电影，把光盘放入光驱，光驱开始读盘
		// 具体同事类通过中介者执行自己的方法
		cd.readCD();

		/**
		 *  cd执行了CDDriver类里的自己的readCD()方法，这个方法里的数据是“this.data = "设计模式,值得好好研究";”
		 *  但是控制台出来的是“您正观看的是：设计模式
		 *                   画外音：值得好好研究”
		 *  说明背后还调用了
		 *               ①cpu同事类里的将数据分割功能 分割成“设计模式” “值得好好研究”
		 *               ②SoundCard同事类里的 画外音：+ data
		 *               ③VideoCard同事类里的 您正观看的是：+ data
		 *  这些都是MotherBoard 做的
		 */
	}
}