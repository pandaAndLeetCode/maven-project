pipeline {
    agent any
    tools{
        maven 'local maven'
    }

    stages{
        stage('Build'){
            steps {
                bat 'mvn clean package'
            }
            post {
                success {
                    echo 'Begin to archive war....'
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }
        }
        
    }
}
