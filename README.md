# Info
Project taken from this tutorial
https://www.youtube.com/watch?v=8w_a-yEl2Wg


# Build
mvn clean package && docker build -t com.airhacks/quick .

# RUN

docker rm -f quick || true && docker run -d -p 8080:8080 -p 4848:4848 --name quick com.airhacks/quick 
