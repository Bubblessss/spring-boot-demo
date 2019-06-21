# spring-boot-demo
- springboot 2.0+整合各种技术

- 点击添加springboot全系列技术交流qq群：[822132747](http://shang.qq.com/wpa/qunwpa?idkey=5bad2b8f8696a3fa80a906df2624de5560b3ab8614c817c3bab7d21270f77e93)

- 所有的测试用例均在springboot默认生成的test文件夹下的测试类里

- √：完结   ""：正在更   ×：待更

模块快速预览：

[√spring-boot-condition](https://github.com/Bubblessss/spring-boot-demo/tree/master/spring-boot-condition)：测试配置类条件注解：@conditional、@ConditionalOnBean、@ConditionalOnMissingBean

[√spring-boot-async](https://github.com/Bubblessss/spring-boot-demo/tree/master/spring-boot-async)：测试spring异步注解：@Async,覆盖默认线程池自定义线程池,无返回值纯异步、有返回值Future<T>、有返回值CompletableFuture<T>

[√spring-boot-redis](https://github.com/Bubblessss/spring-boot-demo/tree/master/spring-boot-redis)：整合redis,7大数据类型：string、list、set、zset、hash、geo、hyperloglog

[√spring-boot-redisson](https://github.com/Bubblessss/spring-boot-demo/tree/master/spring-boot-redisson)：整合redisson实现分布式锁

[spring-boot-java8stream](https://github.com/Bubblessss/spring-boot-demo/tree/master/spring-boot-java8stream)：optional判空替代ifnull优化代码、stream集合增强处理
 
×spring-boot-redisCluster：整合redis cluster

[√spring-boot-aoplog](https://github.com/Bubblessss/spring-boot-demo/tree/master/spring-boot-aoplog)：利用spring aop自定义注解记录日志

[√spring-boot-swagger](https://github.com/Bubblessss/spring-boot-demo/tree/master/spring-boot-swagger)：前后端分离开发接口在线文档神器

[√spring-boot-banner](https://github.com/Bubblessss/spring-boot-demo/tree/master/spring-boot-banner)：自定义启动打印banner

[√spring-boot-command](https://github.com/Bubblessss/spring-boot-demo/tree/master/spring-boot-command):项目启动时去做某些事,比如初始化资源,自动打开浏览器定位到首页

[√spring-boot-exception](https://github.com/Bubblessss/spring-boot-demo/tree/master/spring-boot-exception):使用@RestControllerAdvice做全局rest异常统一处理

[√spring-boot-activemq](https://github.com/Bubblessss/spring-boot-demo/tree/master/spring-boot-activemq)：整合activemq，使用连接池，同时支持2种模式[topic-消息群通知、queue-p2p通知]、delay(延时队列)、双向队列、手动ack模型

×spring-boot-rabbitmq：整合rabbitmq，测试各个交换机和延时队列

[√spring-boot-elasticsearch](https://github.com/Bubblessss/spring-boot-demo/tree/master/spring-boot-elasticsearch)：整合搜索引擎ES,实现全文模糊分词检索,单/多字段分词模糊检索,聚合操作,高亮字段，ElasticSearchTemplate和ElasticSearchRepository的使用

×spring-boot-docker：第一个docker容器的springboot应用

[√spring-boot-jpa](https://github.com/Bubblessss/spring-boot-demo/tree/master/spring-boot-jpa)：整合新型orm框架jpa

[√spring-boot-mybatis](https://github.com/Bubblessss/spring-boot-demo/tree/master/spring-boot-mybatis)：整合主流orm框架mybatis

[√spring-boot-multidatasource](https://github.com/Bubblessss/spring-boot-demo/tree/master/spring-boot-multidatasource)：整合多数据源

[√spring-boot-atomikos-jta](https://github.com/Bubblessss/spring-boot-demo/tree/master/spring-boot-atomikos-jta)：整合基于简单2PC协议的atomikos-jta分布式事务，该方式配置实现简单但是效率较低

[√spring-boot-mongodb](https://github.com/Bubblessss/spring-boot-demo/tree/master/spring-boot-mongodb)：整合主流Nosql框架mongodb,记录系统访问/响应日志

[√spring-boot-mail](https://github.com/Bubblessss/spring-boot-demo/tree/master/spring-boot-mail)：使用springmail快速发邮件

[√spring-boot-thymeleaf](https://github.com/Bubblessss/spring-boot-demo/tree/master/spring-boot-thymeleaf)：整合官网推荐主流模版引擎thymeleaf

[√spring-boot-logback](https://github.com/Bubblessss/spring-boot-demo/tree/master/spring-boot-logback)：使用springboot自带日志框架logback记录日志

×spring-boot-shiro：整合简单好用的权限框架shiro

[√spring-boot-scheduler](https://github.com/Bubblessss/spring-boot-demo/tree/master/spring-boot-scheduler)：整合spring定时任务scheduler

×spring-boot-quartz：整合传统定时任务quartz

[√spring-boot-easypoi](https://github.com/Bubblessss/spring-boot-demo/tree/master/spring-boot-easypoi)：整合新型超简单excel处理框架easypoi

×spring-boot-guava-bloomfilter：测试海量数据下过滤,排序


