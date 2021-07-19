package I_ProxyMode.now;

import I_ProxyMode.now.API.UserModelApi;

import java.util.Collection;

public class Client
{
	public static void main(String[] args) throws Exception
	{
		UserManager userManager = new UserManager();
		Collection<UserModelApi> col = userManager.getUserByDepId("0101");

		//���ֻ����ʾ�û����ƣ���ô����Ҫ���²�ѯ���ݿ�
		for(UserModelApi umApi : col)
			System.out.println("�û���ţ�="+umApi.getUserId()+",�û�������="+umApi.getName());

		//������ʷ��û���ź��û�����������ԣ��Ǿͻ����²�ѯ���ݿ�
		for(UserModelApi umApi : col)
			System.out.println("�û���ţ�="+umApi.getUserId()+",�û�������="+umApi.getName()+",�������ţ�="+umApi.getDepId());
	}
}

//��ʱ�任�ռ�
//1+N�β�ѯ������
//Lazy Load===��ʵ�ֻ��ƾ���   ����