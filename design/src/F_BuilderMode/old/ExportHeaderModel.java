package F_BuilderMode.old;

import lombok.Data;

/**
 * 描述输出到文件头的内容的对象
 */
@Data
public class ExportHeaderModel
{
	/**
	 * 分公司或门市点编号
	 */
	private String depId;

	/**
	 * 导出数据的日期
	 */
	private String exportDate;
}
