package F_PrototypeMode.old;

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
}
