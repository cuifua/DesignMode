package H_MediatorMode.Template.Colleague;

import H_MediatorMode.Template.Mediator.Mediator;

/**
 * ͬ����ĳ�����
 */
//�����ࣺ�Լ�Ҳ��֪������Ҫ����ɶ�������࣬�����óɳ�����
//��������Ϊ�ǳ���ģ����Բ���new ����
//���ǿ���ͨ�����ഴ����ʱ������̳����������
public abstract class Colleague
{
	/**
	 * �����н��߶���ÿһ��ͬ���඼֪�������н��߶���
	 */
	private Mediator mediator;

	/**
	 * ���췽���������н��߶���
	 * @param mediator �н��߶���
	 */
	public Colleague(Mediator mediator)
	{
		this.mediator = mediator;
	}

	/**
	 * ��ȡ��ǰͬ�����Ӧ���н��߶���
	 * @return ��Ӧ���н��߶���
	 */
	public Mediator getMediator()
	{
		return mediator;
	}
}