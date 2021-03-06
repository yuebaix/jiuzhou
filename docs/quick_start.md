# å¿«éå¥é¨ ð

## docker

> docker network create -d bridge --subnet=172.18.0.0/16 --gateway 172.18.0.1 inner-network<br/>
> docker-compose -f docker-compose.yml up

> ååå§åmysqlæ°æ®åºï¼åéç¾¤å¯å¨

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

[é®ä¸å³°ï¼OAuth 2.0 çåç§æ¹å¼](http://www.ruanyifeng.com/blog/2019/04/oauth-grant-types.html)

* authorization_code ææç æ¨¡å¼ï¼ç¨æ·ååºç¨ææï¼ç¨æ·å­è¯ -> ææç  -> åºç¨è·åææç  -> ææç è½¬æ¢ä»¤ç -> åºç¨è·åä»¤çï¼

```http request
GET http://localhost:12101/oauth/authorize?client_id=jiuzhou&response_type=code&redirect_uri=https://baidu.com&scope=all

POST http://localhost:12101/oauth/token?grant_type=authorization_code&code=U3j5FJ&redirect_uri=https://baidu.com&scope=all
Authorization: Basic aml1emhvdTpqaXV6aG91
```

* implicit éå¼è½¬æ¢æ¨¡å¼ï¼ç¨æ·ååºç¨ææï¼ç¨æ·å­è¯ -> ä»¤ç -> åºç¨è·åä»¤çï¼åç«¯ç´æ¥æåä»¤çï¼æåæ»å»ï¼åä»¤çå å¯å½±åã

```http request
GET http://localhost:12101/oauth/authorize?client_id=jiuzhou&response_type=token&redirect_uri=https://baidu.com&scope=all
```

* client_credentials åºç¨å­è¯æ¨¡å¼ï¼åºç¨ç´æ¥è·åä»¤çï¼åºç¨ç´æ¥æåèªå·±çæéï¼éç¨äºä¸éè¦ç¨æ·ææçåºæ¯ã

```http request
POST http://localhost:12101/oauth/token?grant_type=client_credentials&scope=all
Authorization: Basic aml1emhvdTpqaXV6aG91
```

* password å¯ç æ¨¡å¼ï¼ç¨æ·ååºç¨ææï¼ç¨æ·å­è¯ -> åºç¨è·åä»¤çï¼è¿ç§æ¹å¼ç¨æ·è´¦å·å¯ç ç´æ¥ç»äºä¸æ¹åºç¨ã

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
