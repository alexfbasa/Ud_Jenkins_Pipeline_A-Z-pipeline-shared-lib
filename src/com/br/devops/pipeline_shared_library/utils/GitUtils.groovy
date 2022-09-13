package com.br.devops.pipeline_shared_library.utils

/**
 * gitCheckout used to make checkout on the specific git version, based on git tag (as release) or git branches
 * @param data, is the parameters on the pipeline
 * @return the gitCheckoutMessage is the map with all information about this checkout.
 */
String gitCheckout(data){
    stage('Git checkout'){
        def map = data['git']

    }
}