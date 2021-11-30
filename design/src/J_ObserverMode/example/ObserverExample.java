package J_ObserverMode.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author cuifua
 * @Date 2021/11/30 16:56
 * @Version 1.0
 */
public class ObserverExample
{
    public static void main(String[] args)
    {
        BorrowPeople zhangsan = new Zhangsan();
        zhangsan.borrow(new WangWu());
        zhangsan.borrow(new ZhaoSi());

        zhangsan.notifyy();
    }
}

//����Ǯ�ˣ�ծ�����ӿ���д��Ҫծ�ķ���
interface BeBorrowedPeople
{
    void takeMoney();
}

//��Ǯ�˽ӿڣ�����д�˽�Ǯ��֪ͨծ������������
interface BorrowPeople
{
    void borrow(BeBorrowedPeople beBorrowedPeople);//��Ǯ��Ϊ
    void notifyy(); //֪ͨ��Ϊ������ծ������Ǯ����
}

class Zhangsan implements BorrowPeople
{
    private List<BeBorrowedPeople> AllbeBorrowedPeoples = new ArrayList<>();
    private Integer state = 0;//״̬��Ϊ1��ʾ��Ǯ����

    @Override
    public void borrow(BeBorrowedPeople beBorrowedPeople)
    {
        AllbeBorrowedPeoples.add(beBorrowedPeople);//���ծ��,���ǽ�Ǯ
    }

    @Override
    public void notifyy()
    {
        AllbeBorrowedPeoples.forEach(BeBorrowedPeople::takeMoney);
    }
}

class WangWu implements BeBorrowedPeople
{
    @Override
    public void takeMoney()
    {
        System.out.println("�����廹Ǯ");
    }
}

class ZhaoSi implements BeBorrowedPeople
{
    @Override
    public void takeMoney()
    {
        System.out.println("�����Ļ�Ǯ");
    }
}