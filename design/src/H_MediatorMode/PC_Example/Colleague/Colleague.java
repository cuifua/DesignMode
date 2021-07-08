package H_MediatorMode.PC_Example.Colleague;

import H_MediatorMode.PC_Example.Mediator.Mediator;

/**
 * ͬ����ĳ�����
 */
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

