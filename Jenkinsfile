pipeline {
    agent any
    tools{
        maven 'local maven'
    }

    stages{
		stage('Test'){
			steps {
				build job: 'lunch-and-learn-test'
			}
		}
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
        stage('Deploy to staging'){
            steps{
                build job:'lunch-and-learn-deploy-to-staging'
            }
        }

         stage ('Deploy to Production'){
            steps{
                timeout(time:5, unit:'DAYS'){
                    input message:'If it is OK to deploy to the Production?' 
                }

                build job: 'lunch-and-learn-deploy-to-production'
            }
            post {
                success {
                    echo 'Successfully deploy to the Production'
                }

                failure {
                    echo 'Fail to deploy to the Production'
                }
            }
        }
    }
}
