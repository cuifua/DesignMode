package I_ProxyMode.now.API;

import lombok.Data;

/**
 * �����û����ݵĶ���
 */
@Data
public class UserModel implements UserModelApi
{
	/**
	 * �û����
	 */
	private String userId;

	/**
	 * �û�����
	 */
	private String name;

	/**
	 * ���ű��
	 */
	private String depId;

	/**
	 * �Ա�
	 */
	private String sex;
}
