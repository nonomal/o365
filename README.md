# o365
O365管理系统是一个以java语言开发的基于Microsoft Graph Restful API的多全局管理系统，理论上支持任何Office全局的管理(A1,A3,A1P,E3,E5等)，你可以很方便的使用它来添加，删除，启用，禁用，搜索和查看用户，提升和收回管理员权限，更新密钥，查看订阅，分配订阅(创新用户时)，查看多全局报告

一般示例请参考
https://hostloc.com/thread-846732-1-1.html

# 站库分离版  
需要有一定的动手能力
启动方式同一般的jar包，仅仅需要修改application.properties下面三个参数为你自己的mysql 数据库的参数，让后将此文件放置到jar同级目录即可  
spring.datasource.url=jdbc:mysql://localhost/o365  
spring.datasource.username=root  
spring.datasource.password=12345678  
