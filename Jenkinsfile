pipeline {
    agent any
    tools {
        maven 'Maven_3.23' 
    }

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Build') {
            steps {
                echo 'Building now ...'
                withMaven {
                    bat 'mvn clean install'
                }
            }
        }
    }
}
