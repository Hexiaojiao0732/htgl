This project was created by Guocai Pei.

1, cd ./
2, mvn clean package 
 mvn clean package -o
3, mvn jetty:run 
 mvn jetty:run-exploded -o
4, http://localhost:8081/interrogate-web/login.jsp

Change
MAVENREPO\org\mortbay\jetty\jetty\6.1.25\jetty-6.1.25.jar
org/mortbay/jetty/webapp/webdefault.xml

<init-param>
      <param-name>useFileMappedBuffer</param-name>
      <param-value>false</param-value><!-- true:cache html,js,css -->
</init-param>  


mysql -ulaptop -plaptop_stock
use laptop_db
source D:\laptop_db.sql
条码打印机使用：
1.只支持32位的IE浏览器；
2.在提醒安装ActiveX插件时，允许安装。


文案预览/下载
1.将项目下的/resources/template/jacob-1.14.3-x64.dll文件，
    分别放入：%java_home%/bin;
              /%java_home/jre/lib/ext;
              c:/windows/System32.
2.导入jacob-1.14.3.jar
    maven代码如下：
        <dependency>
			<groupId>net.sf.jacob-project</groupId>
			<artifactId>jacob</artifactId>
			<version>1.14.3</version>
		</dependency>
3.将需要预览下载的文案，另存为window 2003 xml 文档；(注：查看文案文档编码是否为utf-8)
4.将需要转换的变量，在xml中用${}替换；(注：xml在线格式化网址：web.chacuo.net/formatxml)
5.java代码详情看LawDocProcessController或CommonfficeController；
6.测试页面在根目录的test.html。
