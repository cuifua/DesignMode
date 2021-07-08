package H_MediatorMode.GeneralizedMedistor;

import lombok.Data;

/**
 * ������
 */
@Data
public class Dep
{
	/**
	 * �������ű��
	 */
	private String depId;

	/**
	 * ������������
	 */
	private String depName;

	/**
	 * ��������
	 * @return �Ƿ����ɹ�
	 */
	public boolean deleteDep()
	{
		//1��Ҫ��ͨ���н���ȥ��������������������صĲ��ź���Ա�Ĺ�ϵ
		DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();
		mediator.deleteDep(depId);

		//2��Ȼ��������������������
		//��ע����ʵ�ʿ����У���Щҵ���ܿ��ܻ�����ҵ���ȥ��
		//����ʵ�ʿ����ж����Ѿ�ʹ�õ�ҵ������ͨ���ǲ��ᱻɾ���ģ�
		//���ǻᱻ��Ϊ��ʷ���ݱ���
		return true;
	}
}
