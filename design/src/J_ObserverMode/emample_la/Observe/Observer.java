package J_ObserverMode.emample_la.Observe;

import J_ObserverMode.emample_la.Subject.Subject;

/**
 * �۲��ߣ����籨ֽ�Ķ���
 */
public interface Observer
{
	/**
	 * ��֪ͨ�ķ���
	 * @param subject �����Ŀ����󣬿��Ի�ȡ��ֽ������
	 */
	public void update(Subject subject);
}
