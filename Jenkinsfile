pipeline {
    agent any
    tools {
        maven "maven"
    }

    stages {
        stage('Build') {
            steps {
                git url:'https://github.com/aimhigh-learning/spring-boot-testng-framework.git', branch:'feature/support-testng-suite'
                sh "mvn clean integration-test -Drunid=1"
            }
            post {
                success {
                    archiveArtifacts 'target/*.jar'
                }
            }
        }

        stage('Post build') {
            steps {
                sh 'python3 /home/output.py'
                // stash(name: 'compiled-results', includes: 'home/*.py*')
            }
        }
    }
}
