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
		//1�������н��ߡ����������
		MotherBoard mediator = new MotherBoard();

		//2������ͬ����
		CDDriver cd = new CDDriver(mediator);
		CPU cpu = new CPU(mediator);
		VideoCard vc = new VideoCard(mediator);
		SoundCard sc = new SoundCard(mediator);

		//3�����н���֪�����е�ͬ��
		mediator.setCdDriver(cd);
		mediator.setCpu(cpu);
		mediator.setVideoCard(vc);
		mediator.setSoundCard(sc);
		
		//4����ʼ����Ӱ���ѹ��̷��������������ʼ����
		// ����ͬ����ͨ���н���ִ���Լ��ķ���
		cd.readCD();

		/**
		 *  cdִ����CDDriver������Լ���readCD()���������������������ǡ�this.data = "���ģʽ,ֵ�úú��о�";��
		 *  ���ǿ���̨�������ǡ������ۿ����ǣ����ģʽ
		 *                   ��������ֵ�úú��о���
		 *  ˵�����󻹵�����
		 *               ��cpuͬ������Ľ����ݷָ�� �ָ�ɡ����ģʽ�� ��ֵ�úú��о���
		 *               ��SoundCardͬ������� ��������+ data
		 *               ��VideoCardͬ������� �����ۿ����ǣ�+ data
		 *  ��Щ����MotherBoard ����
		 */
	}
}