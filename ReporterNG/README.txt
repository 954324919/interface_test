reportng-1.1.5.jar是支持报告中中文的jar包文件，具体配置如下：


支持中文的jar包具体下载地址：http://yunpan.taobao.com/s/1SqalrSXHZU   提取码：sxlJ88


Maven本地仓库工程中加入该jar包并引用：
使用链接：http://blog.csdn.net/hhb200766/article/details/42168819

将jar包安装到本地repository中

mvn install:install-file -Dfile=reportng-1.1.5.jar -DgroupId=org.uncommons -DartifactId=reportng -Dversion=1.1.5 -Dpakaging=jar


使用上边命令就可以加入到本地仓库中。

#############################
在Maven的pom.xml文件中引用：
<dependency>
      <!--这里修改为本地仓库中的jar包及版本-->
      <groupId>org.uncommons</groupId>
      <artifactId>reportng</artifactId>
      <version>1.1.5</version>

        <!--<groupId>org.uncommons</groupId>-->
        <!--<artifactId>reportng</artifactId>-->
        <!--<version>1.1.4</version>-->

      <scope>test</scope>
      <exclusions>
        <exclusion>
          <groupId>org.testng</groupId>
          <artifactId>testng</artifactId>
        </exclusion>
      </exclusions>
    </dependency>

因为reportng在生成报告时会引用velocity-1.4的jar包，所以还要在pom.xml文件中添加对velocity的引用：
<dependency>
      <groupId>velocity</groupId>
      <artifactId>velocity-dep</artifactId>
      <version>1.4</version>
    </dependency>
    <dependency>
      <groupId>velocity</groupId>
      <artifactId>velocity</artifactId>
      <version>1.4</version>
    </dependency>