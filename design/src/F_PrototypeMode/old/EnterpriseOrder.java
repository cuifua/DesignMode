package F_PrototypeMode.old;

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
}
