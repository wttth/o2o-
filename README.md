## 校园o2o商铺平台

项目后端采用SSM框架搭建，前端复用[SUI Mobile库](http://m.sui.taobao.org/)，采用html+js实现与后端语言解耦。

## 主要功能-店家

* 店铺注册

  ![捕获.PNG](https://i.loli.net/2020/02/16/3tHVDOCm5YMIpf1.png)

* 店铺管理

  ![捕获.PNG](https://i.loli.net/2020/02/16/B4DioGlHOSPfmNw.png)

* 商品管理

  ![捕获.PNG](https://i.loli.net/2020/02/16/5lgxeHQPVq2pkIT.png)

## 主要功能-用户

* 店铺及商品浏览

  <img src="https://i.loli.net/2020/02/16/TtedFMEK3ihDy6P.png" align="left" width="300" height = "420"/><img src="https://i.loli.net/2020/02/16/kyNlhJUecuFiAvm.png" align="right" width="300" height = "420"/>

  

  

  

  

  

  

  

  

  

  

  

  

  




## 源码结构

项目使用标准MVC框架，采用maven搭建，其中前端代码位于`/webapp`，dao层CRUD代码位于`/resources/mapper`，Mybatis、web、Redis相关配置文件位于`/resources/spring`。其中dao层split下为数据库主从库同步相关代码，Redis缓存相关实现整合在service中。