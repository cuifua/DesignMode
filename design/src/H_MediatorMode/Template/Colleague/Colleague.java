package H_MediatorMode.Template.Colleague;

import H_MediatorMode.Template.Mediator.Mediator;

/**
 * 同事类的抽象父类
 */
//抽象类：自己也不知道具体要创建啥样的子类，就设置成抽象类
//抽象类因为是抽象的，所以不能new 对象
//但是可以通过子类创建的时候，子类继承这个抽象类
public abstract class Colleague
{
	/**
	 * 持有中介者对象，每一个同事类都知道它的中介者对象
	 */
	private Mediator mediator;

	/**
	 * 构造方法，传入中介者对象
	 * @param mediator 中介者对象
	 */
	public Colleague(Mediator mediator)
	{
		this.mediator = mediator;
	}

	/**
	 * 获取当前同事类对应的中介者对象
	 * @return 对应的中介者对象
	 */
	public Mediator getMediator()
	{
		return mediator;
	}
}