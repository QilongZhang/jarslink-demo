该工程演示如何将多个 Web 应用合并部署，其中 app-one 应用依赖 app-two 应用发布的 SOFA Jvm 服务。

### 简单说明

+ app-one 是宿主应用，引入了 app-two 的 biz 依赖：
```xml
<dependency>
    <groupId>me.qlong.tech</groupId>
    <artifactId>app-two</artifactId>
    <version>1.0.0</version>
    <classifier>ark-biz</classifier>
</dependency>
```

+ app-one 暴露了 hello 的 endpoint
+ app-two 暴露了 hello 的 endpoint, 但是打包时设置了 webContextPath 为 another, 因此可以访问 another/hello
