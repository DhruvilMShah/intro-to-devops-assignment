pipeline {
    agent any
    tools {
        maven 'Maven' 
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
