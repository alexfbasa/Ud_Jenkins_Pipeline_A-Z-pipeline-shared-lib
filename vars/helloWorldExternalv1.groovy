def call(Map config = [:]) {
   //01 - Carregar o Script
   loadLinuxScript(scriptName: "${scriptName}")
   //02 - Executar o Script - Criar essa entrada de parametro no Jenkins na pipeline
   sh "./${scriptName} ${config.name} ${config.dayOfWeek}"
}
