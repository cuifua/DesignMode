package H_MediatorMode.Template.Mediator;

import H_MediatorMode.Template.Colleague.Colleague;

/**
 * �н��ߣ��������ͬ�¶���ͨ�ŵĽӿ�
 */
public interface Mediator
{
	/**
	 * ͬ�¶���������ı��ʱ����֪ͨ�н��ߵķ�����
	 * ���н���ȥ������Ӧ��������ͬ�¶���Ľ���
	 * @param colleague ͬ�¶������������н��߶���ͨ������ʵ��
	 *                  ȥ��ȡͬ�¶����״̬
	 */
	public void changed(Colleague colleague);
}