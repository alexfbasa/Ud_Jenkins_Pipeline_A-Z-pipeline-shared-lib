def call(String user = 'oxboxes', String host = '192.168.0.52') {
    sh "ssh ${user}@${host}"
}