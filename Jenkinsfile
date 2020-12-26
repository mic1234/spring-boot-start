pipeline {
  agent {
    kubernetes {
      label podlabel
      yaml """
kind: Pod
metadata:
  name: jenkins-agent
spec:
  containers:
  - name: kaniko
    image: gcr.io/kaniko-project/executor:debug
    imagePullPolicy: Always
    command:
    - /busybox/cat
    tty: true
  restartPolicy: Never
"""
    }
  }

  stages {
    stage('Example Build') {
      steps {
        sh 'mvn clean spring-boot:build-image -Dspring-boot.build-image.imageName=gcr.io/solar-botany-297306/gs-spring-boot-start:v4'
      }
    }
  }
}
