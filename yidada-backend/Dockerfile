# 指定JDK
FROM java:8

#作者
MAINTAINER muye

#工作目录
WORKDIR /usr/local/yidada

# 开放端口
EXPOSE 8101

# 指定运行方式
ENTRYPOINT ["java" , "-jar" , "/yidada-backend-0.0.1-SNAPSHOT.jar" , "--spring.profiles.active=prod"]