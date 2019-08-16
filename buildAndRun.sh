#!/bin/sh
mvn clean package && docker build -t com.airhacks/quick .
docker rm -f quick || true && docker run -d -p 8080:8080 -p 4848:4848 --name quick com.airhacks/quick 
