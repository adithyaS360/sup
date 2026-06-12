pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'master',
                url: 'https://github.com/adithyaS360/sup.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Debug') {
    steps {
        sh 'whoami'
        sh 'pwd'
        sh 'java -version'
        sh 'mvn -version'
        sh 'which google-chrome'
        sh 'google-chrome --version'
        sh 'env | sort'
    }
}

        stage('Run Selenium') {
            steps {
                sh 'java -jar target/supniqa-1.0-SNAPSOT.jar'
            }
        }
    }

    post {
        success {
            echo "hello"
        }

        failure {
            echo "Build FAILED"
        }
    }
}
