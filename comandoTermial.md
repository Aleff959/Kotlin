//Comando para funcionar no VS Code

kotlinc *.kt -include-runtime -d main.jar ; if ($?) { java -jar main.jar }