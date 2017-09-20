## required
## Your APP's parent dir, not your APP's dir
## APP_HOME=/Users/hanzhe/work
APP_HOME=/home/hanzhe/work/riska
## Your runtime env, see resource/application-xxx.yml
SPRING_PROFILES_ACTIVE=qa
## Your App Name
SPRING_APPLICATION_NAME=kingstar-api-holder

## optional
## for JDK arguments set in here
## JAVA_OPTS="-Xms1024m -Xmx1024m"
JAVA_OPTS="-Xbootclasspath/a:/home/hanzhe/work/riska/kingstar-api-holder/ext-lib/JNATest.jar:"

## private
## Don't Modify this section.
APP_PATH="$APP_HOME/$SPRING_APPLICATION_NAME"
