package F_PrototypeMode.old;

import lombok.Data;

/**
 * ��ҵ��������
 */
@Data
public class EnterpriseOrder implements OrderApi
{
	/**
	 * ��ҵ����
	 */
	private String enterpriseName;

	/**
	 * ��Ʒ���
	 */
	private String productId;

	/**
	 * ������Ʒ����
	 */

	private int orderProductNum = 0;
}
