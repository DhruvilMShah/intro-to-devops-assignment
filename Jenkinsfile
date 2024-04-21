pipeline {
    agent any
    tools {
        maven 'Maven' 
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
                    //bat 'mvn clean install'
                }
            }
        }
    }
}
