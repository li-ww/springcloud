# springcloud 微服务

### 服务注册
- eurekaServer 或者 使用consul服务中心

### 服务发现
- eurekaClient
> 此服务中包含actuator依赖简单应用

### 服务消费者
- eurekaConsumer
- consulConsumer

### 服务消费 负载均衡
- eurekaConsumerRibbon
- eurekaConsumerFeign

### 分布式配置中心
- configServerGit （server端 链接git库配置文件）

### 配置文件client
- configClient （对应具体服务）

### 服务容错保护 Hystrix 服务降级 服务隔离 断路器
- eurekaconsumerfeignhystrix （error）
- eurekaConsumerRibbonHystrix

### Hystrix监控面板 Hystrix监控数据聚合
- hystrixDashboard
- turbine （error）

### 服务网关 路由配置 过滤器
- eurekaZuul

### 消息驱动 RabbitMQ
- streamRabbitMQ
