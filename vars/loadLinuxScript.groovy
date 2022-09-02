def call(Map config = [:]){
    def scriptcontents = libraryResource "com/acceleratedskillup/scripts/linux/${config.name}"
    writeFile file: "${config.name}", text: scriptcontents
    sh "echo $scriptcontents"
    sh "chmod a+x ./${config.name}"
}
