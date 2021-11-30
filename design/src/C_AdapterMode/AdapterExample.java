package C_AdapterMode;

/**
 * @Author cuifua
 * @Date 2021/11/30 16:16
 * @Version 1.0
 */
public class AdapterExample
{
    public static void main(String[] args){
        String s = new TranslateAdapter(new Speaker()).translateTool();
        System.out.println(s);
    }
}

//ԭ��������
class Speaker
{
    public String speak(){
        return "�����ݽ��ߣ������������ݽ�";
    }
}

//���빤�ߵĽӿڣ����涨���˷��빤�ߵķ���
interface Translate
{
    String translateTool();
}

//�������������������ݣ���Ҫ��������ע�������ʵ�ַ�����Ȼ����мӹ�
class TranslateAdapter implements Translate
{
    private Speaker speaker;

    TranslateAdapter(Speaker speaker)
    {
        this.speaker = speaker;
    }

    @Override
    public String translateTool()
    {
        String result = speaker.speak();

        //����Ҫ�ӹ�������result���мӹ�
        result += "........�ҷ�������!!�����:I am a speaker I am speking in Chinese now!";

        return result;
    }
}


