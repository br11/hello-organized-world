hello-organized-world
=====================

Hello World  organizado 

### Compilando os fontes
rm -fR bin
mkdir bin
mkdir bin/classes
javac -cp libs/commons-cli-1.2.jar -d bin/classes **/*.java

### Empacotando a aplicação
jar -cfm app.jar ./src/resources/manifest.txt -C bin/classes .

### Executando a aplicação
java -jar app.jar -fv Fulano
