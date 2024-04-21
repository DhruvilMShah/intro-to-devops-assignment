pipeline {
    agent any

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
                    sh 'mvn clean install'
                }
            }
        }
    }
}
