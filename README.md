hello-organized-world
=====================

Hello World  organizado 

### Compilando os fontes
rm -fR bin

rm -fR dist

mkdir bin

mkdir bin/classes

javac -cp libs/commons-cli-1.2.jar -d bin/classes **/*.java

jar -cfm bin/app.jar ./src/resources/manifest.txt -C bin/classes .

mkdir dist

cp -R bin dist 

cp -R libs dist 

cp src/resources/run dist


### Empacotando a aplicação
jar -cfm app.jar ./src/resources/manifest.txt -C bin/classes .

### Executando a aplicação
java -jar bin/app.jar [options] <visitor-name>

Ex.: java -jar app.jar -fv Fulano
