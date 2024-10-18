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
            }
        }
        stage('Deploy') { 
            steps {
                echo "Deploying" 
            }
        }
    }
}