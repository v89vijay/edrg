pipeline{
    agent any
    stages{
        stage('Declarative Checkout'){
            steps{
                sh 'git clone "https://github.com/v89vijay/edrg.git"'
            }
        }
        stage('Set up Build'){
            steps{
                echo 'second step clear' 
            }
        }
        stage('Test'){
            steps{
                echo 'third stage' 
            }
        }
    }
}
