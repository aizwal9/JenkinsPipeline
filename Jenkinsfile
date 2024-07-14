pipeline {
    agent any
    tools{
        jdk 'Java'
        maven 'maven_3_5_0'
    }
    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/aizwal9/JenkinsPipeline']])
                sh 'mvn clean install'
            }
        }
        stage('Build Docker image'){
            steps{
                script{
                    sh 'docker build -t amanjaiswal144181/jenkins-pipeline .'
                }
            }
        }
         stage('Push Docker image'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
                       sh 'docker login -u amanjaiswal144181 -p ${dockerhubpwd}'
                    }
                    sh 'docker push amanjaiswal144181/jenkins-pipeline'
                }
            }
        }
    }
}
