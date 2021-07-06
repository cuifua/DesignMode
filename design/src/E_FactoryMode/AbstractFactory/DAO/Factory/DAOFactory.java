package E_FactoryMode.AbstractFactory.DAO.Factory;

import E_FactoryMode.AbstractFactory.DAO.DetailDAO.OrderDetailDAO;
import E_FactoryMode.AbstractFactory.DAO.MainDAO.OrderMainDAO;

/**
 * ���󹤳����������������Ӽ�¼��Ӧ��DAO����
 */
public abstract class DAOFactory
{
	/**
	 * ������������¼��Ӧ��DAO����
	 * @return ��������¼��Ӧ��DAO����
	 */
	public abstract OrderMainDAO createOrderMainDAO();

	/**
	 * ���������Ӽ�¼��Ӧ��DAO����
	 * @return �����Ӽ�¼��Ӧ��DAO����
	 */
	public abstract OrderDetailDAO createOrderDetailDAO();
}
