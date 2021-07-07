package F_BuilderMode.now.pojo;

import lombok.Data;

/**
 * 描述输出数据的对象
 */
@Data
public class ExportDataModel
{
	/**
	 * 产品编号
	 */
	private String productId;
	/**
	 * 销售价格
	 */
	private double price;
	/**
	 * 销售数量
	 */
	private double amount;
}
