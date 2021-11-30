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

//原来的内容
class Speaker
{
    public String speak(){
        return "我是演讲者，我正在中文演讲";
    }
}

//翻译工具的接口，里面定义了翻译工具的方法
interface Translate
{
    String translateTool();
}

//翻译适配器，做的内容：把要捯饬的类注入进来，实现方法，然后进行加工
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

        //对需要加工的内容result进行加工
        result += "........我翻译完了!!结果是:I am a speaker I am speking in Chinese now!";

        return result;
    }
}


