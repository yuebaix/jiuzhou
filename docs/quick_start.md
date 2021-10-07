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

[阮一峰：OAuth 2.0 的四种方式](http://www.ruanyifeng.com/blog/2019/04/oauth-grant-types.html)

* authorization_code 授权码模式（用户向应用授权，用户凭证 -> 授权码 -> 应用获取授权码 -> 授权码转换令牌 -> 应用获取令牌）

```http request
GET http://localhost:12101/oauth/authorize?client_id=jiuzhou&response_type=code&redirect_uri=https://baidu.com&scope=all

POST http://localhost:12101/oauth/token?grant_type=authorization_code&code=U3j5FJ&redirect_uri=https://baidu.com&scope=all
Authorization: Basic aml1emhvdTpqaXV6aG91
```

* implicit 隐式转换模式（用户向应用授权，用户凭证 -> 令牌 -> 应用获取令牌）前端直接拉取令牌，易受攻击，受令牌加密影响。

```http request
GET http://localhost:12101/oauth/authorize?client_id=jiuzhou&response_type=token&redirect_uri=https://baidu.com&scope=all
```

* client_credentials 应用凭证模式（应用直接获取令牌）应用直接拉取自己的权限，适用于不需要用户授权的场景。

```http request
POST http://localhost:12101/oauth/token?grant_type=client_credentials&scope=all
Authorization: Basic aml1emhvdTpqaXV6aG91
```

* password 密码模式（用户向应用授权，用户凭证 -> 应用获取令牌）这种方式用户账号密码直接给了三方应用。

```http request
POST http://localhost:12101/oauth/token?grant_type=password&username=yuebaix&password=yuebaix&scope=all
Authorization: Basic aml1emhvdTpqaXV6aG91
```

```http request
GET http://localhost:12101/user/userInfo
Authorization: Bearer a08ec88a-a4b2-4527-8f7a-37a36b8c939c

```

## gate

[http://localhost:12001/swagger-ui/](http://localhost:12001/swagger-ui/)

[http://localhost:12001/doc.html](http://localhost:12001/doc.html)

## bizagg

[http://localhost:12201/swagger-ui/](http://localhost:12201/swagger-ui/)

## biz

[http://localhost:12202/swagger-ui/](http://localhost:12202/swagger-ui/)

## bizclient

[http://localhost:8080/swagger-ui/](http://localhost:8080/swagger-ui/)
