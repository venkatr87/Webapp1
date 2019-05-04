pipelineJob('Webapp2_Pipeline') {

  def repo = 'https://github.com/venkatr87/Webapp2-DockerContainer.git'

  triggers {
    scm('H/5 * * * *')
  }
  description("Pipeline for Webapp2")
  
   parameters {
     choiceParam(name: 'Environment',choices: 'Dev\nUAT\nPRD',description: 'Please select Environment')
     stringPAram(name:  'servername',description: 'Please enter ip address of Machine where you want to deploy')
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
