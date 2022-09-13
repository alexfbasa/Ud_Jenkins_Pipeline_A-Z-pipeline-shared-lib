package com.br.devops.pipeline_shared_library.utils

import com.br.devops.pipeline_shared_library.Constants
import com.br.devops.pipeline_shared_library.Params

def gitCheckout(map) {
    def branchName = env.CHANGE_BRANCH? env.CHANGE_BRANCH: env.BRANCH_NAME
    def gitCheckoutMessage = checkout changelog: false,
            poll: false,
            scm: [$class: 'GitSCM',
                  branches: [[name: branchName]],
                  doGenerateSubmoduleConfigurations: false,
                  extensions: [],
                  submoduleCfg: [],
                  userRemoteConfigs: [
                          [
                                  credentialsId: Constants.GIT_CREDENTIALS_ID,
                                  url: map.gitUrl
                          ]
                  ]]

    return gitCheckoutMessage
}

