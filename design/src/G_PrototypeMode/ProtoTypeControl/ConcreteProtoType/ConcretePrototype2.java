package G_PrototypeMode.ProtoTypeControl.ConcreteProtoType;

import lombok.Data;

/**
 * 克隆的具体实现对象
 */
@Data
public class ConcretePrototype2 implements Prototype
{
	private String name;

	public String toString(){
		return "Now in Prototype2，name="+name;
	}

	public Prototype clone()
	{
		ConcretePrototype2 prototype = new ConcretePrototype2();
		prototype.setName(this.name);
		return prototype;
	}
}