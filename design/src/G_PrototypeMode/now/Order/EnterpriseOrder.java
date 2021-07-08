package G_PrototypeMode.now.Order;

import lombok.Data;

/**
 * 企业订单对象
 */
@Data
public class EnterpriseOrder implements OrderApi
{
	/**
	 * 企业名称
	 */
	private String enterpriseName;

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
		return "本企业订单的订购企业是="+this.enterpriseName+"，订购产品是="+this.productId+"，订购数量为="+this.orderProductNum;
	}

	public OrderApi cloneOrder()
	{
		//创建一个新的订单，然后把本实例的数据复制过去
		EnterpriseOrder order = new EnterpriseOrder();

		order.setEnterpriseName(this.enterpriseName);
		order.setProductId(this.productId);
		order.setOrderProductNum(this.orderProductNum);
		
		return order;
	}
	
}
