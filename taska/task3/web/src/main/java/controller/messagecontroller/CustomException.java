package controller.messagecontroller;

public class CustomException extends RuntimeException {//继承异常处理部分

    public String message;//定义一个字符串的message

    public CustomException(String message){//构造函数创建一个具有详细消息的异常。
        super(message);//要调用父类的构造方法.这样出异常的时候才会打印异常信息
        this.message = message;
    }

    public String getMessage() {//获取异常，转换字符串返回
        return message;
    }

    public void setMessage(String message) {//输入更新message，
        this.message = message;
    }
}