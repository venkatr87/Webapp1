pipelineJob('Webapp2_Pipeline') {

  def repo = 'https://github.com/venkatr87/Webapp2-DockerContainer.git'

  triggers {
    scm('H/5 * * * *')
  }
  description("Pipeline for Webapp2")
  
   parameters {
     choice{
       name('Environment')
       description('Select the Environment')
       choices('Dev', 'Test', 'UAT', 'Staging', 'Prod')
     }
     stringParam{
      name('Environment IP')
      description('Enter the IP Address')
     }
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
