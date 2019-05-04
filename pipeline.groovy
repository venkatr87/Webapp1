pipelineJob('Webapp2_Pipeline') {

  def repo = 'https://github.com/venkatr87/Webapp2-DockerContainer.git'

  triggers {
    scm('H/5 * * * *')
  }
  description("Pipeline for Webapp2")
  
   parameters {
     choiceParam{
       name('Environment')
       choices(Object 'Dev', 'Test')
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
