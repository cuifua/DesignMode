package G_PrototypeMode.Java_DeepClone.PoductClass;

import lombok.Data;

/**
 * 产品对象
 */
@Data
public class Product implements Cloneable
{
	/**
	 * 产品编号
	 */
	private String productId;

	/**
	 * 产品名称
	 */
	private String name;

	public String toString(){
		return "产品编号="+this.productId+"，产品名称="+this.name;
	}

	public Object clone()
	{
		Object obj = null;
		try
		{
			obj = super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return obj;
	}	
}
