pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {

        stage('Clone') {
            steps {
                git branch: 'main',
                url: 'YOUR_GITHUB_REPO'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t myapp .'
            }
        }

        stage('Run') {
            steps {
                bat 'docker run -d -p 8081:8080 myapp'
            }
        }
    }
}