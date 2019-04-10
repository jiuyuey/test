package the.testclass;//定义包

//一个公有的emp类
public class Returns {

    //（私用，当前类可用）定义姓名为字符串
    private String name;
    //(私用，当前类可用)定义the为双精度浮点类型
    private double the;
    //（私用，当前类可用）定义age为整型
    private int age;

    //公用字符串获取名字
    public String getName(){
        //返回名字
        return name;
    }
    //公用 赋予name
    public void setName(String name){
        //返回name类引用
        this.name = name;
    }
    //公用获取双精度浮点类型的the
    public double getThe(){
        //返回the
        return the;
    }
    //公用 赋予the
    public void setThe(double the){
        //返回the引用
        this.the = the;
    }
    //公用获取整型age
    public int getAge(){
        //返回age
        return age;
    }
    //公用 赋予ago
    public void setAge(int age){
        //返回ago引用
        this.age = age;
    }
}
