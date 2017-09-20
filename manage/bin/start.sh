#!/bin/sh

DIR=$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )
ENV_FILE="$DIR/setenv.sh"
if [ ! -f "$ENV_FILE" ]; then
    echo "No evn file to set"
else
    . "$ENV_FILE"
    SPRING_PROFILES_ACTIVE=$SPRING_PROFILES_ACTIVE \
    SPRING_APPLICATION_NAME=$SPRING_APPLICATION_NAME \
    APP_PATH="$APP_PATH" \
    APP_HOME="$APP_HOME" \
    java $JAVA_OPTS -jar -Dapp.path=$APP_PATH $APP_PATH/target/$SPRING_APPLICATION_NAME.jar &
fi