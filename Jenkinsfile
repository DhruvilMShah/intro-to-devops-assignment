pipeline {
    agent any
    tools {
        maven 'Maven' 
        jdk 'java11'
    }

    stages {
        stage('Hello') {
            steps {
                echo 'Hello cool World'
            }
        }
        stage('Build') {
            steps {
                echo 'Building now .....'
                dir('javaProject') {
                    bat 'cd'
                    bat "mvn -version"
                    //bat 'mvn clean install'
                }
            }
        }
    }
}
