pipeline {
    agent any

    stage("Build") {
        steps {
            sh "mvn -version"
            sh "mvn clean install"
        
        }
    }
    post {
        always {
            // clean workspace
            cleanWs()
        }
    }
}

