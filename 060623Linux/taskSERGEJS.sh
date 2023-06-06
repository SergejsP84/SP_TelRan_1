#!/bin/bash
TARGETFOLDER=/tmp/test
if [ -d "$TARGETFOLDER" ]
then
rm -rf $TARGETFOLDER
fi
mkdir -p $TARGETFOLDER
CURDATE=$(date +"%d.%m.%y")
for run in {1..10}
do
FILENAME=$run_$CURDATE
echo $FILENAME
touch $TARGETFOLDER/$FILENAME.txt
done
