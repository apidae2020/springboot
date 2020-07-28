pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                def mvnHome = tool name: 'apache-maven-3.6.3', type: 'maven'
                    sh "${mvnHome}/bin/mvn package"
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'apache-maven-3.6.3') {
                    sh "mvn test"
                }
            }
        }


        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'apache-maven-3.6.3') {
                    sh "mvn deploy"
                }
            }
        }
    }
}
