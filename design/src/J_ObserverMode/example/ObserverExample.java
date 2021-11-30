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

//被借钱人，债主，接口里写了要债的方法
interface BeBorrowedPeople
{
    void takeMoney();
}

//借钱人接口，里面写了借钱和通知债主的两个方法
interface BorrowPeople
{
    void borrow(BeBorrowedPeople beBorrowedPeople);//借钱行为
    void notifyy(); //通知行为，告诉债主我有钱还了
}

class Zhangsan implements BorrowPeople
{
    private List<BeBorrowedPeople> AllbeBorrowedPeoples = new ArrayList<>();
    private Integer state = 0;//状态，为1表示有钱还了

    @Override
    public void borrow(BeBorrowedPeople beBorrowedPeople)
    {
        AllbeBorrowedPeoples.add(beBorrowedPeople);//添加债主,就是借钱
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
        System.out.println("给王五还钱");
    }
}

class ZhaoSi implements BeBorrowedPeople
{
    @Override
    public void takeMoney()
    {
        System.out.println("给赵四还钱");
    }
}