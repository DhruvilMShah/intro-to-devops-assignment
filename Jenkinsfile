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
                bat 'chdir javaProject'
                bat 'mvn clean install'
            }
        }
    }
}
