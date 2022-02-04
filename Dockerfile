FROM tomcat:9.0.58-jdk11-temurin
COPY build/libs/slowness5-0.1-plain.war $CATALINA_HOME/webapps/ROOT.war
#Elapsed time:                  31.48 secs