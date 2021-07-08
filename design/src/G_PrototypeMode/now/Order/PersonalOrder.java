package G_PrototypeMode.now.Order;

import lombok.Data;

/**
 * 个人订单对象
 */
@Data
public class PersonalOrder implements OrderApi
{
	/**
	 * 订购人员姓名
	 */
	private String customerName;

	/**
	 * 产品编号
	 */
	private String productId;

	/**
	 * 订单产品数量
	 */
	private int orderProductNum = 0;

	//重写输出
	public String toString()
	{
		return "本个人订单的订购人是="+this.customerName+"，订购产品是="+this.productId+"，订购数量为="+this.orderProductNum;
	}
	
	public OrderApi cloneOrder()
	{
		//创建一个新的订单，然后把本实例的数据复制过去
		PersonalOrder order = new PersonalOrder();
		
		order.setCustomerName(this.customerName);
		order.setProductId(this.productId);
		order.setOrderProductNum(this.orderProductNum);
		
		return order;
	}
}
