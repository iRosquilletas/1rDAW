#abrimos el /etc/passwd, el numero 1001, es el numero del grupo al que pertenece

prova:x:1004:1001::/home/prova:/bin/sh

#le creamos una contraseña con openssl

sudo openssl passwd -1 "prova123"

prova:$1$XMM30iCC$A2mM5K4/otgvTaWSHeXmz0:19808:0:99999:7:::


sudo mkdir /home/prova
sudo chown prova:(grupo) /home/prova
sudo chmod 700 /home/prova




