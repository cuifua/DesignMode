package H_MediatorMode.GeneralizedMedistor;

import lombok.Data;

/**
 *	描述部门和人员关系的类
 */
@Data
public class DepUserModel
{
	/**
	 * 用于部门和人员关系的编号，用做主键
	 */
	private String depUserId;

	/**
	 * 部门的编号
	 */
	private String depId;

	/**
	 * 人员的编号
	 */
	private String userId;
}
