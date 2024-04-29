#!/bin/bash

read -p "Introduce el ID de la noticia" id
read -p "Introduce la fecha de la noticia" fecha
read -p "Introduce el título de la noticia" titulo
read -p "Introduce el autor de la noticia" autor
read -p "Introduce el texto de la noticia" texto

echo -n $id"$" >> prueba.txt
echo -n $fecha"$" >> prueba.txt
echo -n $titulo"$" >> prueba.txt
echo -n $autor"$" >> prueba.txt
echo $texto  >> prueba.txt


