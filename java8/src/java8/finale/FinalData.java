package java8.finale;

import java.util.Random;

public class FinalData {
    private static Random rand = new Random();
    private String id;
    private final int valueOne = 9;
    // 带有恒定初始值的 final static 基本变量（即编译时常量）命名全部使用大写，单词之间用下划线分隔。
    private static final int VALUE_TWO = 99;
    /*
        我们不能因为某数据被 final 修饰就认为在编译时可以知道它的值
     */
    private final int i4 = rand.nextInt();
    private  static final int INT_5 = rand.nextInt();

    // 你必须在定义时或在每个构造器中执行 final 变量的赋值操作。这保证了 final 属性在使用前已经被初始化过。
    private final  int j;

    public FinalData() {
        j = 1;
    }

}
