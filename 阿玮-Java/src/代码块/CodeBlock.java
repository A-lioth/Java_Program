package 代码块;

public class CodeBlock {
    int test;

    // 作用：数据的初始化
    static {
        System.out.println("静态代码块");
    }

    {
        System.out.println("实例代码块");
    }

    public CodeBlock() {
        System.out.println("空参构造");
    }

    public CodeBlock(int test) {
        System.out.println("有参构造");
        this.test = test;
    }
}
