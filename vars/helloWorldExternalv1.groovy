def call(Map config = [:]) {
   //01 - Carregar o Script
   loadLinuxScript(scriptName: "${scriptName}")
   //02 - Executar o Script
   sh "./${scriptName} ${config.name} ${config.dayOfWeek}"
}
