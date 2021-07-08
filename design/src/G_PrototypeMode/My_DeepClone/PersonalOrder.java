package G_PrototypeMode.My_DeepClone;

import G_PrototypeMode.My_DeepClone.ProductClass.Product;
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
	 * ��Ʒ����
	 *///���������������������͵����ԡ���������
	private Product product = null;

	/**
	 * ������Ʒ����
	 */
	private int orderProductNum = 0;

	public String toString()
	{
		//�򵥵����
		return "������Ʒ��="+this.product.getName()+"����������Ϊ="+this.orderProductNum;
	}
	
	public OrderApi cloneOrder()
	{
		//����һ���µĶ�����Ȼ��ѱ�ʵ�������ݸ��ƹ�ȥ
		PersonalOrder order = new PersonalOrder();
		order.setCustomerName(this.customerName);
		order.setOrderProductNum(this.orderProductNum);

		//���ڶ������͵����ݣ���ȿ�¡��ʱ����Ҫ���������������Ŀ�¡����
		order.setProduct((Product)this.product.cloneProduct());		
		return order;
	}
}
