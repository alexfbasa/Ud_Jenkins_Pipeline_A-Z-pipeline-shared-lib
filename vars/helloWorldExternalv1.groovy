def call(Map config = [:]) {
   //01 - Carregar o Script
   loadLinuxScript(name: "${scriptName}")
   //02 - Executar o Script
   sh "./${scriptName} ${config.name} ${config.dayOfWeek}"
}
