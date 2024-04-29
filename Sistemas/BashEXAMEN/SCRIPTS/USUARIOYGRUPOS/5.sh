sudo visudo

%sudo ALL=(ALL:ALL) ALL


# Debajo de esa linea poner esto: 
estudiante1 ALL=(ALL) NOPASSWD: /usr/bin/apt-get update, /usr/bin/apt-get upgrade


