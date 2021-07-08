package G_PrototypeMode.ProtoTypeControl.ConcreteProtoType;

import lombok.Data;

/**
 * 克隆的具体实现对象
 */
@Data
public class ConcretePrototype1 implements Prototype
{
	private String name;

	public String toString()
	{
		return "Now in Prototype1，name="+name;
	}

	public Prototype clone()
	{
		ConcretePrototype1 prototype = new ConcretePrototype1();
		prototype.setName(this.name);
		return prototype;
	}

}

