�� Demo ��ʾʹ�ö�̬API�ķ�ʽ��װж�� Biz (Spring Boot) Ӧ�á�

ע�⣺Ŀǰ��̬ API ��������û�кϲ��� master ��֧. �������Ҫִ���������
+ git clone git@github.com:QilongZhang/sofa-ark.git
+ cd sofa-ark
+ git checkout -b add_api_operation origin/add_api_operation
+ mvn clean install

��������ִ����֮�󣬲�����ɸ� Demo ��ʾ��

app-one �ṩ������ RestController:
+ HelloController: /hello�� ���� JVM �����������ʧ�ܣ�ҳ����ӡ������Ϣ

+ InstallController: /install/{filePath}�� ��װӦ�ã�����ʾ�����У���Ҫ��װ ../app-two. Ϊ�˷�����ʾ���Ѿ��� app-two ������ɵ� biz ������� resources Ŀ¼��

+ UninstallController: /uninstall/name/version�� ж��Ӧ�ã�����ʾ�����У���Ҫж�� app-two:1.0.0


�� app-two �ᷢ�� app-one ����� JVM ������˿���ͨ������ /hello ���鿴��װ��ж���Ƿ�ɹ���

��ʾ���裨ע�ⲻҪ����������٣���
+ localhost:8080/hello   
```text
���� JVM Reference[interface me.qlong.tech.service.SampleJvmService#] cant not find the corresponding JVM service. 
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
���� JVM Reference[interface me.qlong.tech.service.SampleJvmService#] cant not find the corresponding JVM service. 
```
