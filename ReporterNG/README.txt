reportng-1.1.5.jar��֧�ֱ��������ĵ�jar���ļ��������������£�


֧�����ĵ�jar���������ص�ַ��http://yunpan.taobao.com/s/1SqalrSXHZU   ��ȡ�룺sxlJ88


Maven���زֿ⹤���м����jar�������ã�
ʹ�����ӣ�http://blog.csdn.net/hhb200766/article/details/42168819

��jar����װ������repository��

mvn install:install-file -Dfile=reportng-1.1.5.jar -DgroupId=org.uncommons -DartifactId=reportng -Dversion=1.1.5 -Dpakaging=jar


ʹ���ϱ�����Ϳ��Լ��뵽���زֿ��С�

#############################
��Maven��pom.xml�ļ������ã�
<dependency>
      <!--�����޸�Ϊ���زֿ��е�jar�����汾-->
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

��Ϊreportng�����ɱ���ʱ������velocity-1.4��jar�������Ի�Ҫ��pom.xml�ļ�����Ӷ�velocity�����ã�
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