package G_PrototypeMode.Java_DeepClone.PoductClass;

import lombok.Data;

/**
 * ��Ʒ����
 */
@Data
public class Product implements Cloneable
{
	/**
	 * ��Ʒ���
	 */
	private String productId;

	/**
	 * ��Ʒ����
	 */
	private String name;

	public String toString(){
		return "��Ʒ���="+this.productId+"����Ʒ����="+this.name;
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
