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
                java -jar target/*.jar
            }
        }
        stage('Deploy') { 
            steps {
                echo "Deploying" 
            }
        }
    }
}