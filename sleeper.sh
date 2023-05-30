#!/bin/bash
SLEEPTIME=5
for run in {1..10}
do
date +"%H:%M:%S"
PROC_COUNT=$(ps -ef | wc -l)
echo "The current process count is: $PROC_COUNT"
done
SLEEPTIME=1
mkdir -p /root/OutputFiles
lscpu > /root/OutputFiles/sysinfo.txt
cat /etc/os-release | head -1 >> /root/OutputFiles/sysinfo.txt
cat /etc/os-release | head -1 | cut -b 7-12 >> /root/OutputFiles/sysinfo.txt
FILEINDEX=50
for run in {50..100}
do
touch /root/OutputFiles/$FILEINDEX.txt
let "FILEINDEX+=1"
done
echo "Script completed. Linux is amazing!"
