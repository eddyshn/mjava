# CATALINA_HOME

`D:\software\apache-tomcat-8.5.66`

> tomcat的servlet容器在4.X 版本中被Craig McClanahan重新设计为Catalina。说白了，Catalina就是servlet容器。显然CATALINA_HOME就是Tomcat运 行时的环境变量，老版本中的是TOMCAT_HOME（有的网友说“老版本中称为 CATALINA_HOME，新版本都称为TOMCAT_HOME”，我看他是记混了)。
> 关于到底应该用CATALINA_HOME，还是应该用TOMCAT_HOME。网友有以下意见：
> 1、tomcat 3.0时要用tomcat_home，而不能用catalina_home；tomcat4.05.0时，用catalina_home和 tomcat_hoem都行。我看前半句是对的，因为CATALINA到Tomcat 4.x 才被设计出来。我没用过tomcat4.05.0，但我想应该差不多少：老产品到新产品总要有个过渡，所以此时应兼容TOMCAT_HOME。
> 2、tomcat 5.0 之前用TOMCAT_HOME，之后用 CATALINA_HOME。对于前半句，我想补充一下，在tomcat 4.x与tomcat 5.0之间，应该也可以用CATALINA_HOME（根据第一段话)。对于后半句，我就不确定了，但我在配置tomcat 6.x中的6.0.18版时，已经不能使用TOMCAT_HOME了 。

# path

`%CATALINA_HOME%\bin`

