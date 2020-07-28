

    node {
	stage ('scm checkout stage') {

            steps {
               git 'https://github.com/apidae2020/springboot'
            }
        }
        stage ('Compile Stage') {

            steps {
                def mvnHome = tool name: 'apache-maven-3.6.3', type: 'maven'
                    sh "${mvnHome}/bin/mvn package"
            }
        }

    }
