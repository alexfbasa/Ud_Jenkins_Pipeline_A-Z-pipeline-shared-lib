package com.br.devops.pipeline_shared_library.utils

import com.br.devops.pipeline_shared_library.Constants
import com.br.devops.pipeline_shared_library.Params

def call(Map args) {
    def tag
    def gitCheckoutInfo
    def utils = new Utils()
    def environments = args.environments.keySet() as List
    def registry = new Params().openShiftRepositoryName

    properties([[$class: 'BuildConfigProjectProperty', name: '', namespace: '', resourceVersion: '', uid: ''],
                buildDiscarder(
                        logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '15')
                ),
                parameters([
                        choice(choices: ['bullseye', 'buster', 'stretch', 'jessie'], description: 'Select your distro version',
                                name: 'distro')
                ])
    ]
    )
    node() {

        stage('Git Checkout') {
            gitCheckoutInfo = utils.gitCheckout(map)
            println("Git checkout information: ${gitCheckoutInfo}")
        }
    }
}

