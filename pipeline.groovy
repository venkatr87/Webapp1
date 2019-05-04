pipelineJob('Webapp2_Pipeline') {

  def repo = 'https://github.com/venkatr87/Webapp2-DockerContainer.git'

  triggers {
    scm('H/5 * * * *')
  }
  description("Pipeline for Webapp2")
  
   parameters {
        stringParam('SERVER_ID', SERVER_ID, 'Enter Environment ID')
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
