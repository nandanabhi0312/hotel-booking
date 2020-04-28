pipeline {
  agent any
  stages {
    stage('Git Checkout') {
      steps {
        git(url: 'https://github.com/nandanabhi0312/hotel-booking', branch: 'master')
      }
    }

    stage('Compile Code') {
      steps {
        sh "${MAVEN_HOME}/bin/mvn clean install"
      }
    }

    stage('Build Docker Image') {
      steps {
        sh 'docker build -f Dockerfile -t gk-hotel-booking .'
      }
    }

  }
}