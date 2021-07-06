package E_FactoryMode.AbstractFactory.DAO.Factory;

import E_FactoryMode.AbstractFactory.DAO.DetailDAO.OrderDetailDAO;
import E_FactoryMode.AbstractFactory.DAO.DetailDAO.XmlDetailDAOImpl;
import E_FactoryMode.AbstractFactory.DAO.MainDAO.OrderMainDAO;
import E_FactoryMode.AbstractFactory.DAO.MainDAO.XmlMainDAOImpl;

public class XmlDAOFactory extends DAOFactory
{
	public OrderDetailDAO createOrderDetailDAO()
	{
		return new XmlDetailDAOImpl();
	}
	public OrderMainDAO createOrderMainDAO()
	{
		return new XmlMainDAOImpl();
	}
}