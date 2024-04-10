def call(){
  sh 'sudo cp -f /var/lib/jenkins/workspace/Project-sharedlib/target/addressbook.war /opt/tomcat/webapps'
}
