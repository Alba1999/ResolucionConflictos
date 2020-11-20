# ResolucionConflictos
Creamos un repositorio local, lo subimos al remoto y clonamos el repo en otra carpeta teniendo de esa manera dos carpetas (carpetaCasa y carpetaInstituto) con el mismo contenido.

1. Realizamos un *`pull`* en carpetaCasa y realizamos un cambio, lo subimos al remoto y desde carpetaInstituto creamos un nuevo documento java 
y intentamos subirlo al repo remoto. En este caso aparece el primer error y lo solucionaremos de la siguiente manera: debemos realizar un *`pull`* y tras eso va un *`merge`* que nos permite fusionar en la misma rama, realizamos un *`git commit -m`* y posteriormente un *`git push origin master`* para subir los cambios. Este cambio nos permitira ver desde el repo remoto el cambio en el merge y dentro la nueva clase.


![Conflicto_remoto.png](/ProgramacionEntregas/Img/Conflicto_remoto.png)

2. Realizamos un *`git pull origin master`* en carpetaCasa para tener los mismos cambios en ambas carpetas y se realiza un cambio. Realizamos el mismo cambio en la misma linea en
carpetaInstituto. Desde carpetaCasa *`git add ./*`*, posteriormente *`git commit -m`* y un *`push origin master`*, desde carpetaInstituto escribimos la misma serie de comandos 
*`git add ./*`*, *`git commit -m`*, *`git push origin master`* y nos salta el segundo error, para solucionarlo realizamos un *`git pull origin master`*, *`merge`* para fusionar y un 
*`git push origin master`* para subir lo cambios.


![Conflicto_misma_linea_visualizacion.png](/ProgramacionEntregas/Img/Conflicto_mlinea_mcontenido.png)
![Resolucion_mlinea_mcontenido.png](/ProgramacionEntregas/Img/Resolucion_mlinea_mcontenido.png)


3. Realizamos un *`git pull origin master`* en carpetaCasa para tener los mismos cambios en ambas carpetas y se realiza un cambio, desde la carpetaInstituto 
realizamos un cambio en el mismo documento (pero con diferente contenido). En cada Bash realizamos la siguiente serie de comandos: *`git add ./*`*, *`git commit -m`*
*`git push origin marter`*. Para tener los cambios usamos el comando *`git pull origin master`* y aparece el último error en el merge porque Git tiene dos cambios. Realizamos 
el cambio en 1 carpeta y lo añadimos con *`git add./*`*, por último *`git commit -m`* y lo subimos al repositorio remoto.


![Conflicto_misma_linea.png](/ProgramacionEntregas/Img/Conflicto_misma_linea.png)
![Conflicto_mlinea_mcontenido.png](/ProgramacionEntregas/Img/Conflicto_misma_linea_visualizacion.png)



# P02-40 Git tags, localizar versiones


1. Creamos un tag con el comando *`git tag -a v1.0`*.


![Git_Tag.png](/ProgramacionEntregas/capturas/Git_tag.png)


2. Recuperamos la versión anterior del commit con el comando *`git checkout`* y realizamos un commit *`git commit -m`*.


![Git_checkout.png](/ProgramacionEntregas/capturas/Git_checkout.png)


(Aqui se muestra con un *`git log`* el cambio en el repo local)

![Git_commit.png](/ProgramacionEntregas/capturas/Git_commit.png)


3. Lo subimos al repo remoto con un *`git pull origin master`*.


![Git_Pull_Tag.png](/ProgramacionEntregas/capturas/Git_Pull_Tag.png)


4. Para poder tener los cambios en carpetaInstituto realizamos un *`git push origin master` 
4. Para poder tener los cambios en carpetaInstituto realizamos un *`git push origin master`.


![Git_Push_Tag.png](/ProgramacionEntregas/capturas/Git_Push_Tag.png)
