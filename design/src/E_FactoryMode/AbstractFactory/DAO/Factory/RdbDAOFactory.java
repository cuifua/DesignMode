package E_FactoryMode.AbstractFactory.DAO.Factory;

import E_FactoryMode.AbstractFactory.DAO.DetailDAO.OrderDetailDAO;
import E_FactoryMode.AbstractFactory.DAO.DetailDAO.RdbDetailDAOImpl;
import E_FactoryMode.AbstractFactory.DAO.MainDAO.OrderMainDAO;
import E_FactoryMode.AbstractFactory.DAO.MainDAO.RdbMainDAOImpl;

public class RdbDAOFactory extends DAOFactory
{
	public OrderDetailDAO createOrderDetailDAO()
	{
		return new RdbDetailDAOImpl();
	}
	public OrderMainDAO createOrderMainDAO()
	{
		return new RdbMainDAOImpl();
	}
}
