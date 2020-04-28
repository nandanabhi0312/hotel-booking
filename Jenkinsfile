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

    stage('Start docker container') {
      steps {
        //Don't fail the build if the container is not running / available
        script {
          try {
            sh 'docker container stop gkhotelbooking'
          }catch (err) {
             echo err.getMessage()
          }
        }
        //Don't fail the build if the container is not running / available
        script {
          try {
            sh 'docker container rm gkhotelbooking'
          }catch (err) {
            echo err.getMessage()
          }
        }
        sh 'docker run -d -p 8080:8080 --name gkhotelbooking gk-hotel-booking'
      }
    }

  }
}
