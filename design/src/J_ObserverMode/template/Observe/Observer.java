package J_ObserverMode.template.Observe;

import J_ObserverMode.template.Subject.Subject;

/**
 * �۲��߽ӿڣ�����һ�����µĽӿڸ���Щ��Ŀ�귢���ı��ʱ��֪ͨ�Ķ���
 */
public interface Observer
{
	/**
	 * ���µĽӿ�
	 * @param subject ����Ŀ����󣬺û�ȡ��Ӧ��Ŀ������״̬
	 */
	public void update(Subject subject);
}

