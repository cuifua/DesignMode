package H_MediatorMode.Template.Colleague;

import H_MediatorMode.Template.Mediator.Mediator;

/**
 * �����ͬ����A
 */
public class ConcreteColleagueA extends Colleague
{
	public ConcreteColleagueA(Mediator mediator)
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