pipeline {
    agent any

    environment {
        MAVEN_HOME = "/path/to/maven"  // Change this to your actual Maven installation path
    }

    stages {
        stage('Checkout Code') {
            steps {
                git 'https://github.com/emmanuhkipngetich/Cucumber_Test_Automation_OrangeHRM_Demo_Site.git'
            }
        }

        stage('Setup Environment') {
            steps {
                sh 'java -version'
                sh 'mvn --version'
            }
        }

        stage('Build Project') {
            steps {
                sh 'mvn clean install -DskipTests'
            }
        }

        stage('Run Cucumber Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Publish Cucumber Reports') {
            steps {
                cucumber reportsDirectory: 'target/cucumber-reports'
            }
        }
    }
}
