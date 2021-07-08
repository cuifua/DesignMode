package G_PrototypeMode.now.Order;

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

	//��д���
	public String toString()
	{
		return "����ҵ�����Ķ�����ҵ��="+this.enterpriseName+"��������Ʒ��="+this.productId+"����������Ϊ="+this.orderProductNum;
	}

	public OrderApi cloneOrder()
	{
		//����һ���µĶ�����Ȼ��ѱ�ʵ�������ݸ��ƹ�ȥ
		EnterpriseOrder order = new EnterpriseOrder();

		order.setEnterpriseName(this.enterpriseName);
		order.setProductId(this.productId);
		order.setOrderProductNum(this.orderProductNum);
		
		return order;
	}
	
}
