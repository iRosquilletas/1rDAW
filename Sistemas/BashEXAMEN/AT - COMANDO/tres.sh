#!/bin/bash


echo `ps -u | tee  -a test.txt`
# -a no borra lo que habia
