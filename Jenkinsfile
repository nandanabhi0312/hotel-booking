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
        withMaven(maven: maven-3) {
          sh "${mvnHome}/bin/mvn clean install"
        }
      }
    }
  }
}
