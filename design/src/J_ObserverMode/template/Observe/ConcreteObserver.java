package J_ObserverMode.template.Observe;

import J_ObserverMode.template.Subject.ConcreteSubject;
import J_ObserverMode.template.Subject.Subject;

/**
 * ����۲��߶���ʵ�ָ��µķ�����ʹ�����״̬��Ŀ���״̬����һ��
 */
public class ConcreteObserver implements Observer
{
	/**
	 * ʾ�⣬�����ߵ�״̬
	 */
	private String observerState;
	
	public void update(Subject subject)
	{
		// ����ĸ���ʵ��
		//���������Ҫ���¹۲��ߵ�״̬��ʹ����Ŀ���״̬����һ��
		observerState = ((ConcreteSubject)subject).getSubjectState();
	}
}

