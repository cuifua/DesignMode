package H_MediatorMode.GeneralizedMedistor;

import lombok.Data;

/**
 * ��Ա��
 */
@Data
public class User
{
	/**
	 * ��Ա���
	 */
	private String userId;

	/**
	 * ��Ա����
	 */
	private String userName;

	/**
	 * ��Ա��ְ
	 * @return �Ƿ���ɹ�
	 */
	public boolean dimission()
	{
		//1��Ҫ��ͨ���н���ȥ����������������Ա��صĲ��ź���Ա�Ĺ�ϵ
		DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();
		mediator.deleteUser(userId);

		//2��Ȼ������������������Ա
		//��ע�⣬ʵ�ʿ����У���Ա��ְ���ǲ������ɾ����Ա��¼�ģ�
		//ͨ���ǰ���Ա��¼��״̬������ɾ��������ó���ɾ����
		//ֻ�ǲ��ٲμ��µ�ҵ�񣬵����Ѿ�������ҵ���¼�ǲ��ᱻ�������
		return true;
	}
}
