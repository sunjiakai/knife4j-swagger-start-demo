# knife4j-sjk-start-demo


## 主要功能
- 通过yml配置文件自动创建docker，并支持多分组，引用自定义 start进行创建docker
- 本项目只是引用自定义start一个demo,通过在yml配置，自动创建docket和分组docket;yml配置如下：
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



