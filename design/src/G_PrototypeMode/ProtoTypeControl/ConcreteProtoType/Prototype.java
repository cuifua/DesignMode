package G_PrototypeMode.ProtoTypeControl.ConcreteProtoType;
public interface Prototype
{
	//�����ṩһ����¡����
	public Prototype clone();

	//���ṩһ�������ơ�������
	public String getName();
	public void setName(String name);
}