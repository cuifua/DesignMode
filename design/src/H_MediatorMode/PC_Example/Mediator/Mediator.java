package H_MediatorMode.PC_Example.Mediator;

import H_MediatorMode.PC_Example.Colleague.Colleague;

/**
 * �н��߶���Ľӿ�
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

