package F_PrototypeMode.old;

import lombok.Data;

/**
 * ���˶�������
 */
@Data
public class PersonalOrder implements OrderApi
{
	/**
	 * ������Ա����
	 */
	private String customerName;

	/**
	 * ��Ʒ���
	 */
	private String productId;

	/**
	 * ������Ʒ����
	 */
	private int orderProductNum = 0;
}
