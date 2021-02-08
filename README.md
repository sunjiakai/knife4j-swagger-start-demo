# swagger_springboot

## 简介
`swagger_springboot` 是演示集成knife4j-swagger方式，该用例是引用knife4j版本为2.0.8

## 主要功能
- 通过knife4j 配置,并注入bean（单个服务）
- knife4j-sjk-springboot-autoconfiguration和nife4j-sjk-springboot-start 
   已经封装成star进行自动装配，通过在yml配置，自动创建docket和分组docket;yml配置如下：
```
   # knife4j 全局配置, 参考knife4j官方文档
   knife4j:
     enable: true
     setting:
       enableReloadCacheParameter: true
       enableVersion: true
       enableDynamicParameter: true
       enableFooter: false
       enableFooterCustom: true
       footerCustomContent: Apache License 2.0 | Copyright 2020 [百度](http://baidu.com)
```
- knife4j 提供了生产环境禁用、访问密码、修改文档基础样式等功能, 更多功能参考: knife4j
- SwaggerProperties 提供了动态配置docket文档的能力, 修改 lamp-xxx-server.yml 配置文件配置多个文档group.      
```
sjk:
  swagger:
    docket:
      auth:
        title: xxx模块接口
        base-package: com.knife4j.sjk.demo.controller
      common:
        title: 公共模块
        base-package: com.knife4j.sjk.demo.controller
```
- 通过网关gateway聚合文档服务下,可以再把前端的ui资源引入，访问网关doc.html,该案例还在完善中.....
```
<dependency>    
   <groupId>com.github.xiaoymin</groupId>    
   <artifactId>knife4j-spring-boot-starter</artifactId>    
   <version>${knife4j.version}</version>
</dependency>
```

