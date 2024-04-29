sudo useradd sento -u 1070 -g 1040 -c "Vicent Tatay Mocholí" -d /SENIA/SI-DAW -s /bin/bash

sudo passwd sento

sudo chage -E $(date -d "next saturday" +%Y-%m-%d) sento

#ejemplo
sudo chage -E 2024-12-31 sento



