pipeline {
    agent any

    tools {
        maven 'maven'
    }

    stages {
        stage('Clean Workspace') {
    steps {
        deleteDir()
    }
}

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
        sh 'google-chrome --version'
        sh 'ls -la /root/.cache/selenium || true'
    }
}

        stage('Run Selenium') {
            steps {
sh 'mvn exec:java -Dexec.mainClass=com.example.App'            }
        }
    }

    post {
        success {
            echo "Open SauceDemo: https://www.saucedemo.com"
        }

        failure {
            echo "Build FAILED"
        }
    }
}
