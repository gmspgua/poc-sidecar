
tasklist /fi "imagename eq nginx.exe

TASKKILL /PID 1230 /F

netstat -nao | find ":80"