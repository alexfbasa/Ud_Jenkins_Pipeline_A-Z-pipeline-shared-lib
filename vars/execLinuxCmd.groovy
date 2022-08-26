def call(String opt = '-ntpl') {
    sh "netstat ${opt}"
}