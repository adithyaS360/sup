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

        stage('Run Selenium') {
            steps {
                sh 'mvn exec:java'
            }
        }
    }

    post {
        success {
            echo "Open Google: https://www.google.com"
        }

        failure {
            echo "Build FAILED"
        }
    }
}
