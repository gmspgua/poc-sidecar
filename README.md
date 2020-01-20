Comandos utilizados: 

-comando para encontrar instancia do nginx ativo

tasklist /fi "imagename eq nginx.exe

-matar processo ngin

taskkill /PID 1230 /F

-contrar processo rodando na porta 80

netstat -nao | find ":80"
