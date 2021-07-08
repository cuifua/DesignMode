package G_PrototypeMode.now.Order;

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

	//��д���
	public String toString()
	{
		return "�����˶����Ķ�������="+this.customerName+"��������Ʒ��="+this.productId+"����������Ϊ="+this.orderProductNum;
	}
	
	public OrderApi cloneOrder()
	{
		//����һ���µĶ�����Ȼ��ѱ�ʵ�������ݸ��ƹ�ȥ
		PersonalOrder order = new PersonalOrder();
		
		order.setCustomerName(this.customerName);
		order.setProductId(this.productId);
		order.setOrderProductNum(this.orderProductNum);
		
		return order;
	}
}
