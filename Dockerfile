# Use the official Tomcat 9.0 image
FROM tomcat:9.0  

# Copy sunrays.html to the Tomcat ROOT web directory
COPY ORSProject-04.war /usr/local/tomcat/webapps/ROOT/