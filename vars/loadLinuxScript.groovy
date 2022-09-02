def call(Map config = [:]){
    def scriptcontents = libraryResource "com/acceleratedskillup/scripts/linux/${scriptName}"
    writeFile file: "${scriptName}"
    sh "chmod a+x ./${scriptName}"
}
