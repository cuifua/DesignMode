package G_PrototypeMode.Java_Clone;


/**
 * 订单的接口，声明了可以克隆自身的方法
 */
public interface OrderApi
{
	/**
	 * 获取订单产品数量
	 * @return 订单中产品数量
	 */
	public int getOrderProductNum();

	/**
	 * 设置订单产品数量
	 * @param num 订单产品数量
	 */
	public void setOrderProductNum(int num);

	//注意！！这个接口里现在没有克隆方法，所以一会客户端new新的订单时，不要new成OrderApi oa = new ....
	
}
