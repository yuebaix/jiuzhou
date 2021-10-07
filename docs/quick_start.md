# 快速入门 😊

## docker

> docker network create -d bridge --subnet=172.18.0.0/16 --gateway 172.18.0.1 inner-network<br/>
> docker-compose -f docker-compose.yml up

> 先初始化mysql数据库，再集群启动

## zookeeper

```shell
zkcli.sh -server ip:port
ls /
ls /jiuzhou
ls /jiuzhou/app-biz
get /jiuzhou/app-biz/15184591-300c-47c2-8429-4b1d1c6829e6
quit
```

[zookeeper official site](https://zookeeper.apache.org/)

[zookeeper github](https://github.com/apache/zookeeper)

[zookeeper dockerhub](https://hub.docker.com/_/zookeeper)

## apollo

```text
apollo config http://localhost:11021/
apollo admin http://localhost:11022/
apollo portal http://localhost:11023/
```

[apollo github](https://github.com/apolloconfig/apollo)

[apollo dockerhub](https://hub.docker.com/r/nobodyiam/apollo-quick-start)

[apollo wiki](https://github.com/apolloconfig/apollo/wiki)

[apollo docs](https://www.apolloconfig.com/#/zh/README)

## xxl

```text
xxl dashboard http://localhost:11031/xxl-job-admin/
admin/123456
```
[xxljob github](https://github.com/xuxueli/xxl-job)

[xxljob dockerhub](https://hub.docker.com/r/xuxueli/xxl-job-admin)

[xxljob docs](https://www.xuxueli.com/xxl-job/)

## apisix

## uaa

[http://localhost:12101/swagger-ui/](http://localhost:12101/swagger-ui/)

GET http://localhost:12101/oauth/authorize?client_id=jiuzhou&response_type=code&redirect_uri=https://baidu.com&state=test-state&scope=all
Accept: application/json

POST http://localhost:12101/oauth/token
Content-Type: application/json

{
"client_id":"jiuzhou",
"client_secret":"jiuzhou",
"grant_type":"password",
"username":"yuebaix",
"password":"yuebaix",
"scope":"all"
}


## gate

[http://localhost:12001/swagger-ui/](http://localhost:12001/swagger-ui/)

[http://localhost:12001/doc.html](http://localhost:12001/doc.html)

## bizagg

[http://localhost:12201/swagger-ui/](http://localhost:12201/swagger-ui/)

## biz

[http://localhost:12202/swagger-ui/](http://localhost:12202/swagger-ui/)

## bizclient

[http://localhost:8080/swagger-ui/](http://localhost:8080/swagger-ui/)
