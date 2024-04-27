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
                    bat """set JAVA_HOME="C:\\Program Files\\Java\\jdk-11.0.2" \
                        set JAVA_HOME \
                        set PATH=%JAVA_HOME%;%PATH% \
                        mvn -version
                        """
                    //bat 'mvn clean install'
                }
            }
        }
    }
}
