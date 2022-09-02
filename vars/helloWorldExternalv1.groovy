def call(Map config = [:]) {
   //01 - Carregar o Script
   loadLinuxScript(name: "hello-world.sh")
   //02 - Executar o Script
   sh "./hello-world.sh ${config.name} ${config.dayOfWeek}"
}
