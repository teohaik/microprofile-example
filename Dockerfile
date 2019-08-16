FROM airhacks/glassfish
COPY ./target/quick.war ${DEPLOYMENT_DIR}
