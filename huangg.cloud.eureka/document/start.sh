#!/bin/bash

base_dir=/Users/tongzhou/gitroot/spring-cloud-demo/huangg.cloud.eureka

kill -9 $(jps -l|grep eureka|awk '{print $1}')
echo "kill eureka end!"
cp -r ${base_dir}/target/eureka-0.0.1-SNAPSHOT.jar ~/webroot/cloud/

java -jar eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1 &
java -jar eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2 &

#jps -l
echo "start-ok"