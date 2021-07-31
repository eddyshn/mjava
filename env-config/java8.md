# Go to [Java 8 SDK](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html) 

Download ***jdk-8u261-windows-x64.exe***

# Environment Variable

- JAVA_HOME
  - C:\Program Files\Java\jdk1.8.0_261

- Path
  - %JAVA_HOME%\bin
  
- CLASSPATH

  - .%JAVA_HOME%\lib;%JAVA_HOME%\lib\tools.jar

    > 在JDK1.5以后，classpath并不是必须配置了，在JDK1.5之前，是没有办法在当前目录下加载类的（找不到 JDK目录下lib文件夹中的.jar文件），所以我们需要通过配置classpath，但JDK1.5之后，JRE能自动搜索目录下类文件，并且加载dt.jar和tool.jar的类。