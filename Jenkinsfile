pipeline {
    agent any
    tools {
        maven 'Maven_3.5.2' 
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
