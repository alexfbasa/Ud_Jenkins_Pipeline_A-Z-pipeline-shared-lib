@Library("my-shared-libray") _

pipeline {
    agent any
    options {
        buildDiscarder(logRotator(numToKeepStr: '1'))
        timestamps()
    }
    timestamps()
    }
    stages{
        stage('Build'){
            steps{
                script{
                    echo "Hello-World"
                }
            }
        }
    }
}