Comandos utilizados: 

**Comando para encontrar instancia do nginx ativo

tasklist /fi "imagename eq nginx.exe

**Matar processo ngin

taskkill /PID 1230 /F

**Contrar processo rodando na porta 80

netstat -nao | find ":80"


**MAC

lsof -i :4000

kill -9 [Número do pid do processo]
