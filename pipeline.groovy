pipelineJob('Webapp2_Pipeline') {

  def repo = 'https://github.com/venkatr87/Webapp2-DockerContainer.git'

  triggers {
    scm('H/5 * * * *')
  }
  description("Pipeline for Webapp2")
  
   parameters {
     choiceParam('Environment', ['Dev', 'Test', 'UAT', 'Staging', 'Prod'], 'Select the Environment')
     stringParam('Environment IP', '', 'Enter the IP Address')
   }
  definition {
    cpsScm {
      scm {
        git {
          remote { url(repo) }
          branches('master')
            }
          }
           }
            }
  }
