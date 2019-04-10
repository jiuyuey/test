package the.testclass;

public class Jun {
    /**
     * 阶乘
     * @peram n
     * @return
     **/
    public int factoricl(int n) throws Exception{
        if (n<0){
            throw new Exception("负数没有阶乘");
        }else if (n<=1){
            return 1;
        }else{
            return n * factoricl(n - 1 );
        }
    }
    public int man(int a,int b){
        return a + b;
    }
    public int enhen(int c,int d){
        return c * d;
    }
    public int ggbo(int aa,int bb){
        return aa / bb;
    }
}
