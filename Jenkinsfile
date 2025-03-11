pipeline {
    agent any

    environment {
        MAVEN_HOME = "C:/apache-maven-3.8.8/apache-maven-3.8.8"
    }

    stages {
        stage('Checkout Code') {
            steps {
                 git branch: 'main', url: 'https://github.com/emmanuhkipngetich/Cucumber_Test_Automation_OrangeHRM_Demo_Site.git'
            }
        }

        stage('Setup Environment') {
            steps {
                bat 'java -version'
                bat 'mvn --version'
            }
        }

        stage('Build Project') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Run Cucumber Tests') {
            steps {
                bat 'mvn test'
            }
        }
    }
}
