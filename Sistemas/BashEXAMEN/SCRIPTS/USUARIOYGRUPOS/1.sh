#!/bin/bash

# Crear usuario estudiante1
sudo useradd estudiante1

# Crear grupo clase
sudo groupadd clase

# Añadir estudiante1 al grupo clase
sudo usermod -aG clase estudiante1

