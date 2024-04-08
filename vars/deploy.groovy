def call(){
  sh 'mvn sudo cp -f /var/lib/jenkins/workspace/DeclarativePipline/target/addressbook.war /opt/tomcat/webapps'
}
