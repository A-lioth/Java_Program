package 单列集合顶层接口Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
  public static void main(String[] args) {
    Collection<String> coll = new ArrayList<>();

    // * 添加
    coll.add("aaa");
    System.out.println(coll);
    coll.add("bbb");

    // * remove() 存在则删除成功返回 true，不存在则删除失败返回 false
    System.out.println(coll.remove("aaa"));
    System.out.println(coll);

    // * 判断是否包含元素
    System.out.println(coll.contains("bbb"));

    // * 自定义对象
    Collection<Student> c = new ArrayList<>();
    c.add(new Student("Tom", 20));
    c.add(new Student("Jerry", 21));
    c.add(new Student("Mike", 22));

    // * 使用 contains() 方法判断是否包含自定义对象，需要重写 equals() 方法
    Student s = new Student("Tom", 20);
    System.out.println(c.contains(s));

    // * 清空
    c.clear();
    System.out.println(c);

    // * 是否为空
    System.out.println(c.isEmpty());

    // * 集合长度
    System.out.println(c.size());
  }
}
