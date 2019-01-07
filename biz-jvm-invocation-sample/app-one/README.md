该 Demo 演示使用动态API的方式安装卸载 Biz (Spring Boot) 应用。

注意：目前动态 API 的能力还没有合并至 master 分支. 因此你需要执行如下命令：
+ git clone git@github.com:QilongZhang/sofa-ark.git
+ cd sofa-ark
+ git checkout -b add_api_operation origin/add_api_operation
+ mvn clean install

上述命令执行完之后，才能完成该 Demo 演示。

app-one 提供了三个 RestController:
+ HelloController: /hello， 调用 JVM 服务，如果调用失败，页面会打印错误信息

+ InstallController: /install/{filePath}， 安装应用，在演示过程中，需要安装 ../app-two. 为了方便演示，已经将 app-two 打包生成的 biz 包存放在 resources 目录中

+ UninstallController: /uninstall/name/version， 卸载应用，在演示过程中，需要卸载 app-two:1.0.0


在 app-two 会发布 app-one 所需的 JVM 服务，因此可以通过访问 /hello 来查看安装、卸载是否成功。

演示步骤（注意不要开启网络加速）：
+ localhost:8080/hello   
```text
报错 JVM Reference[interface me.qlong.tech.service.SampleJvmService#] cant not find the corresponding JVM service. 
```

+ localhost:8080/install/app-two-1.0.0-ark-biz.jar
```text
Install Biz: app-two:1.0.0 success.
```

+ localhost:8080/hello
```text
App Two
```

+ localhost:8080/uninstall/app-two/1.0.0
```text
Uninstall biz: app-two:1.0.0 success.
```

+ localhost:8080/hello
```text
报错 JVM Reference[interface me.qlong.tech.service.SampleJvmService#] cant not find the corresponding JVM service. 
```
