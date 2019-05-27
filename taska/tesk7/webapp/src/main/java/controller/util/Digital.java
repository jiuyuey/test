package controller.util;

public class Digital {

    public static int codeGenerat(){
        int code= (int) ((Math.random() * 9 + 1) * 100000);
        return code;
    }
}
