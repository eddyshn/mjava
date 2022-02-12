# Spring config

- Add spring-webmvc dependency before add the config xml

![image-20220212100620528](D:\Github\mjava\smaples\boot-video\00\xmlssm\readme.assets\image-20220212100620528.png)



# applicationContext

![image-20220212102717356](D:\Github\mjava\smaples\boot-video\00\xmlssm\readme.assets\image-20220212102717356.png)

```xml
s
```

- Spring MVC is the sub container of Spring
- Spring scan all except **Controller**
- Spring MVC scan **Controller**
- use-default-filters="true" - scan all beans under org.eddy package