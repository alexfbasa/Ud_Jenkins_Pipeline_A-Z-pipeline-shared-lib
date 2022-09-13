def call(Map config = [:]){
    def scriptcontents = libraryResource "com/acceleratedskillup/scripts/linux/${scriptName}"
    // Carregue a String text e salve o script la
    writeFile file: "${scriptName}", text: scriptcontents
    sh "chmod a+x ./${scriptName}"
}
