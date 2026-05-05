// Define function
def call(String ImageName, String ImageTag(version), String DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
