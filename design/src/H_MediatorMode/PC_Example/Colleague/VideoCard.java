package H_MediatorMode.PC_Example.Colleague;

import H_MediatorMode.PC_Example.Mediator.Mediator;

/**
 * �Կ��࣬һ��ͬ����
 */
public class VideoCard extends Colleague
{
	//��һ����ʹ�Լ������н���
	public VideoCard(Mediator mediator)
	{
		super(mediator);
	}

	//�ڶ������Լ��ķ���
	/**
	 * ��ʾ��Ƶ����
	 * @param data ����ʾ������
	 */
	public void showData(String data)
	{
		System.out.println("�����ۿ����ǣ�"+data);
	}	
}
