def checkout(git){
  git url:'https://github.com/Apekshshn/DevOpsClassCodes'
}

def compile(){
  sh "mvn compile"
  echo "compiling is done"
}
