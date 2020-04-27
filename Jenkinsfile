pipeline {
  agent any
  stages {
    stage('Git Checkout') {
      steps {
        git(url: 'https://github.com/nandanabhi0312/hotel-booking', branch: 'master')
      }
    }

    stage('Compile Code - MVN') {
      environment {
        def mvnHome = tool name: 'maven-3', type: 'maven'
      }
      steps {
        sh "${mvnHome}/bin/mvn clean install -Dlicense.skip=true"
      }
    }
    stage('Build Docker image') {
      steps {
        sh 'docker build -t gowravk24/hotel-booking-app:1.0.0 .'
      }
    }
  }
}
