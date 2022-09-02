def call(Map config = [:]){
    def scriptcontents = libraryResource "com/acceleratedskillup/scripts/linux/${config.name}"
    writeFile file: "${config.name}", text: scriptcontents
    println scriptcontents
    println file
    sh "chmod a+x ./${config.name}"
}
