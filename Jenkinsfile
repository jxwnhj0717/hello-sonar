pipeline {
    agent {
        docker {
            image 'gradle:7.0.2-jdk8-hotspot'
            args '-v gradle_home:/home/gradle/.gradle'
        }
    }
    stages {
        stage('构建项目') {
            steps {
                sh 'gradle -i build'
            }
            post {
                success {
                    archiveArtifacts artifacts: 'build/libs/*.jar', fingerprint: true
                    junit skipPublishingChecks: true, testResults: 'build/test-results/test/*.xml'
                }
            }
        }
        stage('sonar扫描') {
            steps {
                withSonarQubeEnv('sonar') {
                    sh 'gradle -i sonarqube'
                }
            }
        }
    }
}