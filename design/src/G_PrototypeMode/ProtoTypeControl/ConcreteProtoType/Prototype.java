package G_PrototypeMode.ProtoTypeControl.ConcreteProtoType;
public interface Prototype
{
	//除了提供一个克隆方法
	public Prototype clone();

	//还提供一个【名称】的属性
	public String getName();
	public void setName(String name);
}