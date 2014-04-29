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

mkdir dist/bin

cp -R bin/app.jar dist/bin 

cp -R libs dist 



### Empacotando a aplicação
jar -cfm app.jar ./src/resources/manifest.txt -C bin/classes .

### Executando a aplicação
cd dist

java -jar bin/app.jar [options] \<visitor-name\>

Ex.: 

cd dist

java -jar bin/app.jar -fv Fulano
