pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
            	mvn clean
            	mvn compile
                echo "Building" 
            }
        }
        stage('Test') { 
            steps {
                echo "Testing" 
                java -jar ExceptionHandling-0.0.1-SNAPSHOT.jar
            }
        }
        stage('Deploy') { 
            steps {
                echo "Deploying" 
            }
        }
    }
}