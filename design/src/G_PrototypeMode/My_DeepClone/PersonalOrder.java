package G_PrototypeMode.My_DeepClone;

import G_PrototypeMode.My_DeepClone.ProductClass.Product;
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
	 * 产品对象
	 *///【【【【【增加引用类型的属性】】】】】
	private Product product = null;

	/**
	 * 订单产品数量
	 */
	private int orderProductNum = 0;

	public String toString()
	{
		//简单点输出
		return "订购产品是="+this.product.getName()+"，订购数量为="+this.orderProductNum;
	}
	
	public OrderApi cloneOrder()
	{
		//创建一个新的订单，然后把本实例的数据复制过去
		PersonalOrder order = new PersonalOrder();
		order.setCustomerName(this.customerName);
		order.setOrderProductNum(this.orderProductNum);

		//对于对象类型的数据，深度克隆的时候需要继续调用这个对象的克隆方法
		order.setProduct((Product)this.product.cloneProduct());		
		return order;
	}
}
