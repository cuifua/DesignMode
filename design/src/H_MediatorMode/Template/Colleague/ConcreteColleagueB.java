package H_MediatorMode.Template.Colleague;

import H_MediatorMode.Template.Mediator.Mediator;

/**
 * �����ͬ����B
 */
public class ConcreteColleagueB extends Colleague
{
	public ConcreteColleagueB(Mediator mediator)
	{
		super(mediator);
	}

	/**
	 * ʾ�ⷽ����ִ��ĳЩҵ����
	 */
	public void someOperation()
	{
		//����Ҫ������ͬ��ͨ�ŵ�ʱ��֪ͨ�н��߶���
		getMediator().changed(this);
	}
}

