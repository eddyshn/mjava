# abstract

- Java 提供了一个叫做抽象方法的机制，这个方法是不完整的：它只有声明没有方法体  
- 如果一个类包含一个或多个抽象方法，那么类本身也必须限定为抽象的
- 如果创建一个继承抽象类的新类并为之创建对象，那么就必须为基类的所有抽象方法提供方法定义。如果不这么做（可以选择不做），新类仍然是一个抽象类，编译器会强制我们为新类加上 abstract关键字   
- 可以将一个不包含任何抽象方法的类指明为 abstract，在类中的抽象方法没啥意义但想阻止创建类的对象时，这么做就很有用 
- 一个类指明为 abstract 并不强制类中的所有方法必须都是抽象方法 

# interface

- 接口方法默认是公有的
- Java 8 允许接口包含默认方法和静态方法
- 接口同样可以包含属性，这些属性被隐式指明为 static 和 final
- 关键字 default 允许在接口中提供方法实现——在 Java 8 之前被禁止。
- 增加默认方法的极具说服力的理由是它允许在不破坏已使用接口的代码的情况下，在接口中增加
  新的方法。默认方法有时也被称为守卫方法或虚拟扩展方法  
- Java 8 允许在接口中添加静态方法。这么做能恰当地把工具功能置于接口中，从而操作接口，或
  者成为通用的工具  