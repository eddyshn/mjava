# 第 02 章 Spring Boot 基础配置 

## Spring属性注入

```java
@Component
@PropertySource("classpath:book.properties")
public class Book {
}

// equal to
<beans>
      <context:property-placeholder location="classpath:book.properties" />
</beans>
```

