package H_MediatorMode.PC_Example.Colleague;

import H_MediatorMode.PC_Example.Mediator.Mediator;

/**
 * �����࣬һ��ͬ����
 */
public class SoundCard extends Colleague
{
	public SoundCard(Mediator mediator)
	{
		super(mediator);
	}
	
	/**
	 * ������Ƶ���ݷ�������
	 * @param data ��������������
	 */
	//ҵ�񷽷���Ҳ�Ǻ��н��߽����ķ���
	public void soundData(String data)
	{
		System.out.println("��������"+data);
	}
	
}
